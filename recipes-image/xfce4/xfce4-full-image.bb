require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
    midori \
    firefox \
    chromium \
    evince \
    gimp \
    gnome-bluetooth \
    gnome-disk-utility \
    florence \
    xarchiver \
    \
    xdg-user-dirs-gtk \
    devilspie2 \
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
"


#    geany-plugins
#    bash-completion
#    gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#    lightdm-gtk-greeter lightdm


#    ntp
#    cherokee

#    gateone
