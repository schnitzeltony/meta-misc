require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-qt5-dev-image"

GLES_NO_SHLIB_omap3 = "libgles-omap3"

IMAGE_INSTALL += " \
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
    qt5-creator \
    make cmake git \
    gcc-symlinks g++-symlinks cpp-symlinks ccache gdb \
"

# for test temporary
IMAGE_INSTALL += "kde-world lxqt-world"
