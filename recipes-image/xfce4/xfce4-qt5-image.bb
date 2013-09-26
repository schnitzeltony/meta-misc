require recipes-image/xfce4/xfce4-full-image.bb

export IMAGE_BASENAME = "xfce4-qt5-image"

IMAGE_INSTALL += " \
	qtbase \
	qtscript \
	qtxmlpatterns \
	qtquickcontrols-qmlplugins \
	\
	qt-creator \
"
