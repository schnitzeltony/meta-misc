require recipes-image/xfce4/xfce4-qt5-dev-image.bb

export IMAGE_BASENAME = "xfce4-dev-image"

DEPENDS = "gdb-cross"

IMAGE_FEATURES += "dev-pkgs dbg-pkgs"

IMAGE_INSTALL += " \
    unzip xz tar bzip2 \
    \
    python python-mako perl php vala lua5.1 php json-glib \
    gdbserver valgrind \
    automake autoconf libtool binutils-symlinks elfutils coreutils gnu-config m4 patch pkgconfig quilt \
    subversion \
    \
    glade3 gursormaker \
    xfce4-dev-tools libxfce4ui-glade\
    \
    texinfo gettext \
    ncurses dialog \
    man man-pages \
    gawk \
    chrpath \
    hexedit \
    \
    exo-csource \
    xfce4-dev-tools \
    libxfce4ui-glade \
"


