LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "recipe1"

do_install() {
    install -d ${D}${includedir}
    echo "// Include 2" >> ${D}${includedir}/recipe2_inc.h
}
