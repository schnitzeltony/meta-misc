SUMMARY = "All packages required for a games image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    atanks \
    freeciv \
    pingus \
    scummvm \
    etr \
    openastromenace \
    gnome-chess \
    gnome-robots \
    mog \
    \
    gnome-games \
    supertuxkart \
    wesnoth wesnoth-all-campaigns \
"


