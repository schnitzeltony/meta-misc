SUMMARY = "All packages required for a games image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    atanks \
    freeciv \
    pingus \
    scummvm \
    supertux2 \
    gnome-games \
    freeciv \
    etr \
    \
    z80 \
    vice \
    stella \
    \
    opentyrian \
    d1x-rebirth \
    \
    kapman \
    katomic \
    kbounce \
    gottet \
    hexalate \
"

#    supertuxkart
#    wesnoth wesnoth-all-campaigns
