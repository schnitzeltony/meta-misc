require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "xfce4-base-image"

XFCE_DM ?= "lxdm"

IMAGE_INSTALL += " \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    ${XFCE_DM} \
    \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    \
    packagegroup-xfce-base \
    packagegroup-image-base \
    \
    xfce4-default-touch-config \
"


# reenable graphical target
IMAGE_FEATURES += "x11-base"

#    shared-mime-info
#    dconf

