require recipes-image/xfce4/xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-qt-image"

IMAGE_INSTALL += " \
	qt4-tools \
	\
	qtbase-tools \
	qtbase-examples \
	qtbase-doc \
	qtbase-plugins \
	qtquickcontrols-qmlplugins \
	qtdeclarative-tools \
	qtdeclarative-qmlplugins \
	qtgraphicaleffects-qmlplugins \
	\
	qt-creator \
	qt4-designer \
	make cmake \
	gcc-symlinks g++-symlinks cpp-symlinks ccache gdb \
"
