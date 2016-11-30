SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

MACHINE_SPECIFICS_FULL = ""
MACHINE_SPECIFICS_FULL_mx6 = "gstreamer1.0-plugins-imx"

RDEPENDS_${PN} = " \
    tzdata tzdata-misc tzdata-africa \
    tzdata-americas tzdata-antarctica tzdata-arctic tzdata-asia \
    tzdata-atlantic tzdata-australia tzdata-europe tzdata-pacific \
    \
    libreoffice \
    abiword-meta \
    gimp \
    fontforge \
    menulibre \
    \
    mpd \
    parole \
    dragon \
    gstreamer1.0-plugins-base-meta gstreamer1.0-plugins-good-meta \
    ${MACHINE_SPECIFICS_FULL} \
    \
    firefox \
    \
    gparted \
    \
    ark \
    filelight \
    konsole \
    spectacle \
    \
    alsa-utils \
    qmmp \
    drumstick \
    timidity++ \
    fluidsynth-bin \
    jack-utils \
    sox \
    qsynth qjackctl a2jmidid \
    qtractor synthv1 drumkv1 samplv1 hexter \
    mixxx \
    \
    \
    kde-games \
    \
    gottet \
    hexalate \
    peg-e \
    simsu \
    \
    mame \
    dosbox \
    z80 \
    vice \
    stella \
    opentyrian \
    d1x-rebirth \
    \
    pingus \
    supertux2 \
    openastromenace \
"

#    chromium
#    gursormaker
