SUMMARY = "All packages required for a base image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    packagegroup-gnome-fonts \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    source-han-sans-cn-fonts \
    source-han-sans-kr-fonts \
    source-han-sans-jp-fonts \
    source-han-sans-tw-fonts \
    \
    operator-user \
    \
    gedit \
    xarchiver \
    shared-mime-info \
    xterm \
"
