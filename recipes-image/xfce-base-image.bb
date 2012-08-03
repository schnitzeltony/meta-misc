require console-base-image-nm.bb

export IMAGE_BASENAME = "xfce-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

# task-gnome-xserver-base and task-gnome-fonts in angstrom-task-gnome drag in
# tons of unpacked recipes so copy them here for now
IMAGE_INSTALL += " \
    dbus-x11 \
    iso-codes \
    mime-support \
    xauth \
    xdg-utils \
    xhost \
    xinetd \
    xinit \
    xrandr \
    xrdb \
    xset \
    xvinfo \
    \
    fontconfig fontconfig-utils font-util \
    ttf-liberation-sans \
    ttf-liberation-serif \
    ttf-liberation-mono \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    task-xserver \
    \
    task-xfce-base \
    \
    gvfs \
    gvfsd-ftp gvfsd-sftp gvfsd-trash \
    dconf \
    \
    upower udisks \
    leafpad \
"
