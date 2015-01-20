require xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-xfce-extended \
    packagegroup-xfce-multimedia \
    lxdm \
    evince \
    \
    xfce4-default-touch-config \
    \
    strace \
    \
    ntp ntp-utils \
    dnsmasq \
    bind \
    wireless-tools \
    \
    mesa-demos \
    glmark2 \
    \
    gparted \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
