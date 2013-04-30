require console-base-image-nm.bb

export IMAGE_BASENAME = "gnome-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

IMAGE_INSTALL += " \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    xinput-calibrator \
    \
    packagegroup-gnome-fonts \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    angstrom-clearlooks-theme-enable \
    angstrom-gnome-icon-theme-enable \
    \
    dconf \
    gnome-settings-daemon gnome-control-center \
    gnome-keyring \
    gnome-power-manager \
    gnome-panel \
    gnome-terminal \
    gtk-engine-clearlooks gtk-theme-clearlooks \
    upower udisks \
    gnome-disk-utility \
    gnome-system-monitor \
    nautilus \
    gedit \
    gpe-scap \
    bash \
    tzdata \
    \
    operator-user \
"
