require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "allgui-base-image"

DEPENDS += "gdb-cross-${TARGET_ARCH}"

# currently: plasma / xfce / lxqt
# not included: gnome / efl
IMAGE_INSTALL += " \
    packagegroup-core-x11-xserver \
    packagegroup-image-base \
    \
    sddm \
    \
    kf5-world \
    plasma-world \
    \
    packagegroup-gnome-xserver-base \
    packagegroup-xfce-base \
    xfce4-default-config \
    network-manager-applet \
    \
    packagegroup-lxqt-base \
    lxqt-default-config \
    \
    lumina \
    \
    weston weston-xwayland \
    \
    mesa-demos \
    \
    gdbserver \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
