require ../console/console-base-image-nm.bb

export IMAGE_BASENAME = "gnome2-base-image"

IMAGE_LINGUAS = "de-de fr-fr en-gb en-us"

IMAGE_INSTALL += " \
    packagegroup-gnome-themes \
    packagegroup-gnome-xserver-base \
    packagegroup-core-x11-xserver \
    packagegroup-gnome-fonts \
    angstrom-clearlooks-theme-enable \
    dconf \
    xinput-calibrator \
    ttf-dejavu-sans ttf-dejavu-sans-mono ttf-dejavu-common \
    \
    gnome-settings-daemon gnome-control-center \
    gnome-keyring \
    gnome-power-manager \
    gnome-panel \
    gnome-terminal \
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
