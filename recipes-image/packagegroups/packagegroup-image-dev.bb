SUMMARY = "All packages required for a dev image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    geany \
    qt5-creator \
    hexedit \
    glade3 \
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
    python-pygtk-demo \
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
    qtbase-plugins-dbg \
    qt3d-qmlplugins-dbg \
    qtconnectivity-qmlplugins-dbg \
    qtdeclarative-plugins-dbg \
    qtdeclarative-qmlplugins-dbg \
    qtenginio-qmlplugins-dbg \
    qtimageformats-plugins-dbg \
    qtlocation-plugins-dbg \
    qtlocation-qmlplugins-dbg \
    qtmultimedia-plugins-dbg \
    qtmultimedia-qmlplugins-dbg \
    qtsensors-plugins-dbg \
    qtsensors-qmlplugins-dbg \
    qtsvg-plugins-dbg \
    qtsystems-qmlplugins-dbg \
    qttools-plugins-dbg \
    qtwebsockets-qmlplugins-dbg \
    qtwebchannel-qmlplugins-dbg \
    qtquickcontrols-qmlplugins-dbg \
    \
    wireshark \
    nfs-utils-client \
    lmsensors-sensord lmsensors-sensorsdetect \
    \
    qemu \
"

#    geany-plugins
#    valgrind
