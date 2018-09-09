# class to enable remote debugging by using build sysroot
# to enable set
# INHERIT += "instant-remote"
# in your local.conf

# This is where instant sysroot is installed into
INSTANT_REMOTE_PATH ??= "${TMPDIR}/sysroot-instant-remote"

addtask copysourcestosysroot before do_packagedata after do_package

do_copysourcestosysroot() {
    # ---------- source files ----------
    # remove old
    rm -rf ${INSTANT_REMOTE_PATH}/usr/src/debug/${PN}
    # add new
    if [ -d ${WORKDIR}/package/usr/src/debug/${PN} ] ; then
        mkdir -p ${INSTANT_REMOTE_PATH}/usr/src/debug/${PN}
        cd ${WORKDIR}/package/usr/src/debug/${PN}
        find . -print0 | cpio --null -pdlu ${INSTANT_REMOTE_PATH}/usr/src/debug/${PN}
    fi

    # ---------- binaries and symbols -> manifest ----------
    mkdir -p ${INSTANT_REMOTE_PATH}/manifests
    # remove old
    if [ -f ${INSTANT_REMOTE_PATH}/manifests/${PN} ] ; then
        # remove old files from sysroot
        for file in `cat ${INSTANT_REMOTE_PATH}/manifests/${PN}` ; do
            rm -f ${INSTANT_REMOTE_PATH}/$file
        done
        # remove old manifest
        rm ${INSTANT_REMOTE_PATH}/manifests/${PN}
    fi
    # add new
    for pkgdbg in `find ${WORKDIR}/packages-split -mindepth 1 -maxdepth 1 -type d -name '*-dbg'` ; do
        debug_binaries=
        if [ "${PACKAGE_DEBUG_SPLIT_STYLE}" = "debug-file-directory" ] ; then
            if [ -d $pkgdbg/usr/lib/debug ] ; then
                debug_binaries=`find $pkgdbg/usr/lib/debug -name '*.debug'`
            fi
        else
            debug_binaries=`find $pkgdbg -wholename '*.debug/*'`
        fi
        for file in $debug_binaries; do
            # do 'root' path
            file=`echo $file | sed -e 's:'$pkgdbg'::'`

            # stripped binary (non debug)
            if [ "${PACKAGE_DEBUG_SPLIT_STYLE}" = "debug-file-directory" ] ; then
                filestripped=`echo $file | sed -e 's:/usr/lib/debug::' -e 's:\.debug::'`
            else
                filestripped=`echo $file | sed -e 's:\.debug/::'`
            fi
            # keep files in manifest
	        echo $file >> ${INSTANT_REMOTE_PATH}/manifests/${PN}
	        echo $filestripped >> ${INSTANT_REMOTE_PATH}/manifests/${PN}
	        # check for so-file links
	        if echo $filestripped | grep -q '\.so'; then
	            soname=`basename $filestripped`
                for packsplit in `find ${WORKDIR}/packages-split -mindepth 1 -maxdepth 1 -type d ! -name '*-dbg' ! -name '*-dev' ! -name '*-doc'` ; do
	                for link in `find $packsplit -lname $soname` ; do
                        # do 'root' path
                        link=`echo $link | sed -e 's:'$packsplit'::'`
	                    echo $link >> ${INSTANT_REMOTE_PATH}/manifests/${PN}
	                done
	            done
	        fi
        done
    done


    # ---------- link binaries and symbols ----------
    if [ -f ${INSTANT_REMOTE_PATH}/manifests/${PN} ] ; then
        cd ${WORKDIR}/package
        for file in `cat ${INSTANT_REMOTE_PATH}/manifests/${PN}` ; do
            file=`echo $file | cut -c 2-`
            if [ -e $file ] ; then
                echo -n $file | cpio --null -pdlu ${INSTANT_REMOTE_PATH}
            fi
        done
    fi
}

# remove source links
do_clean[cleandirs] += "${INSTANT_REMOTE_PATH}/usr/src/debug/${PN}"

do_clean_append() {
    # remove binaries from mainfest
    manifest = "%s/manifests/%s" % (d.expand("${INSTANT_REMOTE_PATH}"), d.expand("${PN}"))
    if os.path.isfile(manifest):
        bb.note("Removing all files from manifest " + manifest)
        manifestfile = open(manifest, "r")
        for filetoremove in manifestfile:
            filetoremove = filetoremove.rstrip()
            filetoremove = d.expand("${INSTANT_REMOTE_PATH}") + filetoremove
            if os.path.isfile(filetoremove):
                os.remove(filetoremove)
        manifestfile.close()

        os.remove(manifest)
}
