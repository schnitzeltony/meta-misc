require xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-xfce-extended \
    packagegroup-xfce-multimedia \
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
    gparted \
"
