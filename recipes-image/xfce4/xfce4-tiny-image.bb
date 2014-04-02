require xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-xfce-extended \
    packagegroup-xfce-multimedia \
    lxdm \
    \
    xfce4-default-touch-config \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
