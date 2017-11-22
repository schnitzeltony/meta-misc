SUMMARY = "All packages required for a music image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

MACHINE_SPECIFICS_MUSIC = ""
MACHINE_SPECIFICS_MUSIC_mx6 = "gstreamer1.0-plugins-imx"

RDEPENDS_${PN} = " \
    alsa-utils \
    pulseaudio-module-alsa-card \
    qmmp \
    drumstick \
    timidity++ \
    fluidsynth-bin fluidsynth-dssi fluidplug soundfont-collection-meta \
    xsynth-dssi \
    jack-utils patchage gmidimonitor \
    sox \
    qsynth qjackctl a2jmidid \
    ardour5 muse rosegarden qtractor lmms \
    amsynth synthv1 drumkv1 samplv1 padthv1 hexter whysynth calf dssi-vst arty-fx \
    helm \
    carla \
    distrho-ports \
    triceratops-lv2 \
    zynaddsubfx \
    guitarix \
    polyphone \
    mixxx \
"
