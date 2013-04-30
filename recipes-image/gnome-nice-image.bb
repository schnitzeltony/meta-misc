require gnome-base-image.bb

export IMAGE_BASENAME = "gnome-nice-image"

IMAGE_INSTALL += " \
    gdm \
    gnome-bluetooth \
    gnome-mplayer \
"
