require kde-tiny-image.bb

export IMAGE_BASENAME = "kde-full-image"

IMAGE_INSTALL += " \
    packagegroup-image-full \
" 
