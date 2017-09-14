require recipes-image/xfce4/xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-dev-image"

# not in packagegroup cause of allarch
DEPENDS += "gdb-cross-${TARGET_ARCH}"

IMAGE_INSTALL += " \
    packagegroup-image-dev \
    \
    exo-csource \
    xfce4-dev-tools \
    libxfce4ui-glade \
"
