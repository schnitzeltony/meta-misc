require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
    packagegroup-image-full \
    \
    gnome-bluetooth \
    florence \
    \
    xdg-user-dirs-gtk \
    \
    faenza-icon-theme \
    openzone \
    \
    orage \
    xfce4-orageclock-plugin \
"

#    devilspie2

# beaglebone
#IMAGE_INSTALL_append_beaglebone = "beaglebone-getting-started gadget-init"
