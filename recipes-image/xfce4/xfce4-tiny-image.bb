require xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-xfce-extended \
    packagegroup-xfce-multimedia \
    lxdm \
    \
    gedit \
    \
    xfce4-default-touch-config \
"
