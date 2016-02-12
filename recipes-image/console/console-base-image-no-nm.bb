require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = ""

export IMAGE_BASENAME = "console-base-image-no-nm"

# there are important missing I bet
IMAGE_LINGUAS = " \
    af-za \
    ar-sa \
    da-dk \
    de-de \
    el-gr \
    en-gb \
    en-us \
    es-es \
    fi-fi \
    fr-fr \
    he-il \
    hi-in \
    hu-hu \
    it-it \
    ja-jp \
    ko-kr \
    nn-no \
    ku-tr \
    pl-pl \
    pt-pt \
    ru-ru \
    sv-se \
    vi-vn \
    zh-cn \
"
# broken?
#    tr-tr 


# to be removed again later?
IMAGE_FEATURES += "package-management"

# add some analysing tools
IMAGE_INSTALL += " \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    glibc-utils \
    evtest \
    systemd-analyze less \
"
