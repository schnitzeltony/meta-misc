LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_install() {
    install -d ${D}${includedir}
    echo "// Include 1 alt" >> ${D}${includedir}/recipe1-alt_inc.h
}
