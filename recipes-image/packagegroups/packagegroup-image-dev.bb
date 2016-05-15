SUMMARY = "All packages required for a dev image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    qt5-creator \
    hexedit \
    glade3 \
    umbrello \
    lokalize \
    \
    unzip xz tar bzip2 \
    make cmake \
    automake autoconf libtool m4 \
    gcc-symlinks g++-symlinks cpp-symlinks \
    dtc \
    pkgconfig binutils-symlinks elfutils coreutils gnu-config \
    gdb gdbserver \
    git git-bash-completion subversion \
    python-shell python-subprocess \
    python python-mako perl php vala lua php json-glib \
    texinfo gettext \
    patch quilt ncurses dialog \
    man man-pages \
    gawk \
    chrpath \
    \
    qtbase-tools \
    qtbase-fonts \
    qtbase-plugins \
    qtbase-examples \
    qtbase-doc \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtscript \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtsvg-plugins \
    \
    qtbase-dbg \
    qt3d-dbg \
    qtconnectivity-dbg \
    qtdeclarative-dbg \
    qtenginio-dbg \
    qtimageformats-dbg \
    qtlocation-dbg \
    qtmultimedia-dbg \
    qtsensors-dbg \
    qtsvg-dbg \
    qtsystems-dbg \
    qttools-dbg \
    qtwebsockets-dbg \
    qtwebchannel-dbg \
    qtquickcontrols-dbg \
    \
    wireshark \
    nfs-utils-client \
    lmsensors-sensord lmsensors-sensorsdetect \
    \
    qemu \
"

#    geany-plugins
#    valgrind
