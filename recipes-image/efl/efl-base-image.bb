require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "efl-base-image"

IMAGE_INSTALL += " \
    packagegroup-x11-illume \
    packagegroup-image-base \
"
