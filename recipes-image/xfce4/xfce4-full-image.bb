require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
    abiword-meta \
    gimp \
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
    geany \
    \
    python-pygtk-demo \
    fontforge \
    \
    mpd \
    \
    midori \
    firefox \
"

#    chromium
#    parole
#    menulibre
#    gursormaker

# beaglebone
#IMAGE_INSTALL_append_beaglebone = "beaglebone-getting-started gadget-init"

#    geany-plugins
#    bash-completion
#    gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#    lightdm-gtk-greeter lightdm


#    cherokee

#    gateone
