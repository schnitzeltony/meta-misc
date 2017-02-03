SUMMARY = "All packages required for a base image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

MACHINE_SPECIFICS_TINY = ""
MACHINE_SPECIFICS_FULL_mx6 = " \
    teamviewer \
"

RDEPENDS_${PN} = " \
    plymouth plymouth-set-default-theme plymouth-initrd \
    xdg-user-dirs \
    \
    evince \
    geany \
    \
    ntp ntp-utils \
    tzdata \
    dnsmasq \
    bind \
    wireless-tools \
    \
    bash-completion \
    dconf-editor \
"
