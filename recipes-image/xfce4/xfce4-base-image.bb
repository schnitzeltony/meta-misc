require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "xfce4-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

XFCE_DM ?= "lxdm"

IMAGE_INSTALL += " \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    ${XFCE_DM} \
    \
    packagegroup-xfce-base \
    packagegroup-gnome-fonts \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    \
    dconf \
    \
    operator-user \
    \
    gedit \
    xarchiver \
"


# reenable graphical target
IMAGE_FEATURES += "x11-base"

#    shared-mime-info
