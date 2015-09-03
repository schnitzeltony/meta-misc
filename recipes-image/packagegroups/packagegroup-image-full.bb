SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    abiword-meta \
    gimp \
    fontforge \
    \
    antimony \
    \
    mpd \
    parole \
    \
    midori \
    firefox \
"

#    chromium
#    menulibre
#    gursormaker
#    cherokee
#    gateone
