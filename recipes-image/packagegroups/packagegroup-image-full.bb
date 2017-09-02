SUMMARY = "All packages required for a full image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

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
    mpv \
    kodi \
    parole \
    dragon \
    gstreamer1.0-plugins-base-meta gstreamer1.0-plugins-good-meta \
    ${MACHINE_SPECIFICS_FULL} \
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
    alsa-utils \
    pulseaudio-module-alsa-card \
    qmmp \
    drumstick \
    timidity++ \
    fluidsynth-bin fluidsynth-dssi fluidplug \
    jack-utils patchage \
    sox \
    qsynth qjackctl a2jmidid \
    ardour5 muse rosegarden qtractor lmms \
    amsynth synthv1 drumkv1 samplv1 padthv1 hexter whysynth calf dssi-vst \
    helm \
    carla \
    distrho-ports \
    zynaddsubfx \
    guitarix \
    polyphone \
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
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'meta-retro', 'mame dosbox z80 vice stella opentyrian d1x-rebirth', '', d)} \
    \
    ${@bb.utils.contains('BBFILE_COLLECTIONS', 'games-layer', 'pingus supertux2 openastromenace', '', d)} \
"

#    firefox 
#    gursormaker
