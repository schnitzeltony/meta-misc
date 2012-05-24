require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = "networkmanager network-manager-applet"

export IMAGE_BASENAME = "xfce-base-image"

# to be removed again later?
IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += " \
    task-gnome-xserver-base \
    task-xserver \
    task-xfce-extended \
    task-gnome-fonts \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    gvfs \
    gvfsd-ftp gvfsd-sftp gvfsd-trash \
    dconf \
    \
    upower udisks-systemd \
    \
    gtk-xfce-engine \
"
