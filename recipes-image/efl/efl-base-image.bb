require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "efl-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

IMAGE_INSTALL += " \
    packagegroup-x11-illume \
    packagegroup-image-base \
"
