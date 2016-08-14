require allgui-tiny-image.bb

export IMAGE_BASENAME = "allgui-full-image"

IMAGE_INSTALL += " \
    packagegroup-image-full \
    gnome-bluetooth \
    florence \
    \
    xdg-user-dirs-gtk \
    \
    faenza-icon-theme \
    openzone \
    \
    orage \
    xfce4-orageclock-plugin \
"
