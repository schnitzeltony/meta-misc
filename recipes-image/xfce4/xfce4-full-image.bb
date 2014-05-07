require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
    midori \
    firefox \
    chromium \
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
    parole \
    orage \
    xfce4-orageclock-plugin \
    xfce4-vala \
    \
    strace \
    \
    glade3 \
    libxfce4ui-glade \
    geany \
    \
    python-pygtk-demo \
    ntp ntp-utils \
"

# beaglebone
IMAGE_INSTALL_append_beaglebone = "xf86-video-fbdev"
#IMAGE_INSTALL_append_beaglebone = "beaglebone-getting-started gadget-init"

#    geany-plugins
#    bash-completion
#    gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#    lightdm-gtk-greeter lightdm


#    ntp
#    cherokee

#    gateone
