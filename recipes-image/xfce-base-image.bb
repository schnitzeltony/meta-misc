require console-base-image-nm.bb

export IMAGE_BASENAME = "xfce-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

IMAGE_INSTALL += " \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    xinput-calibrator \
    \
    packagegroup-xfce-base \
    packagegroup-gnome-fonts \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    \
    gvfs \
    gvfsd-ftp gvfsd-sftp gvfsd-trash \
    dconf \
    \
    upower udisks \
    leafpad \
"
