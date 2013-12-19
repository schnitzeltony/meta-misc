require recipes-image/xfce4/xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-qt-image"

GLES_NO_SHLIB_omap3 = "libgles-omap3"

IMAGE_INSTALL += " \
	qt4-tools \
	\
	qtbase-tools \
	qtbase-examples \
	qtbase-fonts \
	qtbase-plugins \
	qtbase-doc \
	qtdeclarative-tools \
	qtdeclarative-qmlplugins \
	qtscript \
	qtgraphicaleffects-qmlplugins \
	qtquickcontrols-qmlplugins \
	${GLES_NO_SHLIB} \
	\
	qt-creator \
	qt4-designer \
	make cmake \
	gcc-symlinks g++-symlinks cpp-symlinks ccache gdb \
"
