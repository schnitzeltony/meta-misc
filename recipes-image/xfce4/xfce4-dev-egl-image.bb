require xfce4-dev-image.bb

export IMAGE_BASENAME = "xfce4-egl-dev-image"

GLES_NO_SHLIB_omap3 = "libgles-omap3"

XFCE_DM = "sddm"

MACHINE_SPECIFICS = ""
MACHINE_SPECIFICS_mx6 = "imx-gpu-viv-tools imx-gpu-viv-tools-apitrace imx-gpu-viv-demos"

IMAGE_INSTALL += " \
    kde-world \
    packagegroup-lxqt-base lxqt-default-config \
    qterminal-world \
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
