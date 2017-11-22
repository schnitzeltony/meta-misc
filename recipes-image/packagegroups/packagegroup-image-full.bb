SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

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
    chromium \
    \
    gparted \
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
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-retro', 'mame dosbox z80 vice stella opentyrian d1x-rebirth', '', d)} \
    \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'games-layer', 'pingus supertux2 openastromenace', '', d)} \
"

#    firefox 
#    gursormaker
