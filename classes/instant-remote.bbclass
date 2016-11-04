# class to enable remote debugging by using build sysroot
# to enable set
# INHERIT += "instant-remote"
# in your local.conf

# do not strip sysroot files
INHIBIT_SYSROOT_STRIP = "1"

addtask copysourcestosysroot before do_packagedata after do_package

do_copysourcestosysroot[cleandirs] = "${STAGING_DIR_HOST}/usr/src/debug/${PN}"
do_copysourcestosysroot[dirs] = "${STAGING_DIR_HOST}/usr/src/debug"

do_copysourcestosysroot() {
    if [ -d ${WORKDIR}/package/usr/src/debug/${PN} ] ; then
        rm -rf ${STAGING_DIR_HOST}/usr/src/debug/${PN} 
        mkdir ${STAGING_DIR_HOST}/usr/src/debug/${PN}
        cd ${WORKDIR}/package/usr/src/debug/${PN}
	    find . -print0 | cpio --null -pdlu ${STAGING_DIR_HOST}/usr/src/debug/${PN}
    fi
}
