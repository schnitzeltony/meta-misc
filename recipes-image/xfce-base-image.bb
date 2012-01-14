require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = "networkmanager network-manager-applet"

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
    consolekit \
    upower udisks-systemd \
    \
    gtk-xfce-engine \
    \
    midori \
    epdfview \
    evince \
    gedit \
    gnome-bluetooth \
    florence \
    \
    strace \
    \
    ntp-systemd \
"

#    firefox 

#    clutter-1.8
#    slim
#    orage

inherit image

