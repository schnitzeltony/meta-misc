require lxqt-base-image.bb

export IMAGE_BASENAME = "lxqt-tiny-image"

IMAGE_INSTALL += " \
    packagegroup-image-tiny \
"