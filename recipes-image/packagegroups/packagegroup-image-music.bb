SUMMARY = "All packages required for a music image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

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
    synthv1 synthv1-presets drumkv1 drumkv1-presets samplv1 padthv1 \
    amsynth helm hexter carla whysynth calf dssi-vst arty-fx \
    qmidiarp \
    distrho-ports \
    triceratops-lv2 \
    yoshimi zynaddsubfx \
    guitarix \
    polyphone \
    mixxx \
"
