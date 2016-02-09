require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = ""

export IMAGE_BASENAME = "console-base-image-no-nm"

IMAGE_LINGUAS = "de-de en-gb en-us fr-fr"

# to be removed again later?
IMAGE_FEATURES += "package-management"

# add some analysing tools
IMAGE_INSTALL += " \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    glibc-utils \
    evtest \
    systemd-analyze less \
"
