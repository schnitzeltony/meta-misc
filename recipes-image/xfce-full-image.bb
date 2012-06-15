require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-full-image"

IMAGE_INSTALL += " \
    midori \
    epdfview \
    evince \
    firefox \
    gimp \
    gedit \
    gnome-bluetooth \
    gnome-disk-utility \
    florence \
    xarchiver \
    \
    strace \
    \
    ntp-systemd \
    cherokee-systemd \
    \
    libgles-omap3-x11demos \
"


#    gateone
#    chromium
#    dhcp-relay-systemd
#    clutter-1.8
#    slim
#    orage
