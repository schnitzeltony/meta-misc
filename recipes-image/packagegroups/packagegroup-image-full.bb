SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

MACHINE_SPECIFICS_FULL = ""
MACHINE_SPECIFICS_FULL_mx6 = "gstreamer1.0-plugins-imx"

RDEPENDS_${PN} = " \
    packagegroup-image-music \
    \
    tzdata-misc tzdata-africa \
    tzdata-americas tzdata-antarctica tzdata-arctic tzdata-asia \
    tzdata-atlantic tzdata-australia tzdata-europe tzdata-pacific \
    \
    libreoffice \
    abiword-meta \
    gimp \
    fontforge \
    menulibre \
    \
    chromium-x11 \
    \
    gparted \
    \
    mpd \
    mpv \
    kodi \
    parole \
    dragon \
    gstreamer1.0-plugins-base-meta gstreamer1.0-plugins-good-meta \
    ${MACHINE_SPECIFICS_FULL} \
    \
    ark \
    filelight \
    konsole \
    spectacle \
    \
    kde-games \
    \
    gottet \
    hexalate \
    peg-e \
    simsu \
    \
    qwt-qt5-examples \
    \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-retro', 'mame dosbox z80 vice stella opentyrian d1x-rebirth', '', d)} \
    \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'games-layer', 'pingus supertux2 freeciv', '', d)} \
"

#    firefox 
#    gursormaker
