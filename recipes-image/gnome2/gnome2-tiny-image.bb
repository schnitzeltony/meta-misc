require gnome2-base-image.bb

export IMAGE_BASENAME = "gnome2-tiny-image"

IMAGE_INSTALL += " \
    evince \
    gdm \
    gnome-bluetooth \
    gnome-mplayer \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
