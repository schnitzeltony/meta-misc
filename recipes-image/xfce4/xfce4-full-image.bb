require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
    packagegroup-image-full \
    \
    gnome-bluetooth \
    florence \
    \
    xdg-user-dirs-gtk \
    devilspie2 \
    faenza-icon-theme \
    openzone \
    \
    orage \
    xfce4-orageclock-plugin \
    \
    python-pygtk-demo \
"

#    chromium
#    parole
#    menulibre
#    gursormaker

# beaglebone
#IMAGE_INSTALL_append_beaglebone = "beaglebone-getting-started gadget-init"

#    geany-plugins

#    cherokee

#    gateone
