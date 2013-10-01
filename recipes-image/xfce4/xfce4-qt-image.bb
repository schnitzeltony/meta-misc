require recipes-image/xfce4/xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-qt-image"

IMAGE_INSTALL += " \
	qtbase-tools \
	qtscript \
	qtxmlpatterns \
	qtquickcontrols-qmlplugins \
	\
	qt-creator \
	qt4-tools \
	make cmake \
	gcc-symlinks g++-symlinks cpp-symlinks ccache gdb \
"
