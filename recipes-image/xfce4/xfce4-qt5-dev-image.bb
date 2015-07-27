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
    make cmake \
    pkgconfig automake autoconf \
    gdb gdbserver \
    git git-bash-completion \
    python-shell python-subprocess \
    \
    geany \
    \
    midori \
    wireshark \
    \
    kde-world \
    packagegroup-lxqt-base \
    qterminal-world \
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
    plasma-workspace-dbg plasma-workspace-dev \
    libpng12-dev libpng12-dbg \
    \
    mesa-demos \
    glmark2 \
    eglinfo-x11 \
    qt5-opengles2-test \
    cinematicexperience \
    \
    ${MACHINE_SPECIFICS} \
"

# TBD: Allow empty for the following in meta-qt5
# qtgraphicaleffects-qmlplugins-dbg
