require ../console/console-base-image-no-nm.bb

export IMAGE_BASENAME = "lxqt-base-image"

CONMANPKGS = "networkmanager"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

LXQT_DM ?= "sddm"

IMAGE_INSTALL += " \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    ${LXQT_DM} \
    \
    packagegroup-lxqt-base \
    \
    operator-user \
"


# reenable graphical target
IMAGE_FEATURES += "x11-base"