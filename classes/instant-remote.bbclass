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
    for pkgdbg in `find ${WORKDIR}/packages-split -maxdepth 1 -name '*-dbg'` ; do
        for file in `find $pkgdbg -wholename '*.debug/*'`; do
            # do 'root' path
            file=`echo $file | sed -e 's:'$pkgdbg'::'`

            # stripped binary (non debug)
            filestripped=`echo $file | sed -e 's:.debug/::'`

            # keep files in manifest
	        echo $filestripped >> ${INSTANT_REMOTE_PATH}/manifests/${PN}
	        echo $file >> ${INSTANT_REMOTE_PATH}/manifests/${PN}
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
