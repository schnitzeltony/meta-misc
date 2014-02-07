require recipes-image/xfce4/xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-qt5-test-image"

GLES_NO_SHLIB_omap3 = "libgles-omap3"

IMAGE_INSTALL += " \
	qtbase-tools \
	qtbase-fonts \
	qtbase-plugins \
	qtdeclarative-tools \
	qtdeclarative-qmlplugins \
	qtscript \
	qtgraphicaleffects-qmlplugins \
	qtquickcontrols-qmlplugins \
	qtsvg-plugins \
	\
	mesa-driver-swrast \
	xserver-xorg-extension-glx \
"
