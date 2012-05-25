require console-base-image-nm.bb

export IMAGE_BASENAME = "xfce-base-image"

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
