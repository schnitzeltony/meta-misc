require allgui-full-image.bb

export IMAGE_BASENAME = "allgui-dev-image"

# not in packagegroup cause of allarch
DEPENDS += "gdb-cross-${TARGET_ARCH}"

IMAGE_INSTALL += " \
    packagegroup-image-dev \
    \
    exo-csource \
    xfce4-dev-tools \
    libxfce4ui-glade \
    \
    plasma-workspace-dbg plasma-workspace-dev \
    libpng12-dev libpng12-dbg \
"
