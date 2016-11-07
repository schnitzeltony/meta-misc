require allgui-base-image.bb

export IMAGE_BASENAME = "allgui-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-image-tiny \
    qpdfview \
    \
    \
    kde-world \
    \
    \
    packagegroup-xfce-extended \
    packagegroup-xfce-multimedia \
    rodent-icon-theme \
    \
    \
    weston-examples \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
