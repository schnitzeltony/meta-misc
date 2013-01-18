require console-base-image-nm.bb

export IMAGE_BASENAME = "xfce4-base-image"

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
    dconf \
    \
    upower udisks \
    \
    operator-user \
"
