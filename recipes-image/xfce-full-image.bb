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
    gateone \
    cherokee-systemd \
    \
    libgles-omap3-x11demos \
"


#    chromium
#    dhcp-relay-systemd
#    clutter-1.8
#    slim
#    orage
