require lxqt-full-image.bb

export IMAGE_BASENAME = "lxqt-dev-image"

# not in packagegroup cause of allarch
DEPENDS = "gdb-cross-${TARGET_ARCH}"

IMAGE_INSTALL += " \
    packagegroup-image-dev \
"
