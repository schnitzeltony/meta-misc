LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

export IMAGE_BASENAME = "hawaii-base-image"

# to be removed again later?
IMAGE_FEATURES += "package-management"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

IMAGE_INSTALL += " \
    ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
    angstrom-packagegroup-boot \
    packagegroup-basic \
    hawaii-world \
    hicolor-icon-theme \
    strace \
    \
    systemd-analyze \
    bash-completion \
    \
    qtbase-tools \
    qtbase-fonts \
    qtbase-plugins \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtscript \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtsvg-plugins \
    \
    qtwayland-plugins \
    qtwayland-examples qtwayland-tools \
    \
    weston weston-examples \
    plasma-nm \
    \
    operator-user \
"


inherit image

#    weston-init
#    operator-user
#    upower udisks
#    shared-mime-info
