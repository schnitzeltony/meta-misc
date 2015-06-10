require xfce4-tiny-image.bb

export IMAGE_BASENAME = "xfce4-qt5-dev-image"

GLES_NO_SHLIB_omap3 = "libgles-omap3"

XFCE_DM = "sddm"

DEPENDS = "gdb-cross-${TARGET_ARCH}"

MACHINE_SPECIFICS = ""
MACHINE_SPECIFICS_mx6 = "imx-gpu-viv-tools imx-gpu-viv-tools-apitrace imx-gpu-viv-demos"

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
    make cmake git git-bash-completion \
    gcc-symlinks g++-symlinks cpp-symlinks ccache gdb gdbserver \
    \
    geany \
    \
    midori \
    wireshark \
    \
    kde-world \
    lxqt-world \
    plasma-workspace-dbg \
    \
    mesa-demos \
    glmark2 \
    eglinfo-x11 \
    qt5-opengles2-test \
    \
    ${MACHINE_SPECIFICS} \
"
