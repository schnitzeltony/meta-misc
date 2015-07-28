require xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-games-image"

IMAGE_INSTALL += " \
    atanks \
    freeciv \
    pingus \
    scummvm \
    supertux2 \
    gnome-games \
    freeciv \
    etr \
    \
    z80 \
    vice \
    stella \
    \
    kapman \
    katomic \
"
#    supertuxkart
#    wesnoth wesnoth-all-campaigns
