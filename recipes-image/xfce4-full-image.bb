require xfce4-base-image.bb

export IMAGE_BASENAME = "xfce4-full-image"

IMAGE_INSTALL += " \
	packagegroup-xfce-extended \
	packagegroup-xfce-multimedia \
	xdg-user-dirs-gtk \
	lxdm \
	\
	midori \
	firefox \
	epdfview \
	gimp \
	gnome-bluetooth \
	gnome-disk-utility \
	florence \
	xarchiver \
	gedit \
	parole \
	\
	strace \
	\
	devilspie2 \
	\
	xfce4-default-touch-config \
	\
	bash-completion \
	xfce4-closebutton-plugin \
	glade3 \
	libxfce4ui-glade \
	geany \
	\
	python-pygtk-demo \
"


#	gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm
#	slim

#	evince

#	ntp
#	cherokee

#	gateone
#	chromium
#	orage
