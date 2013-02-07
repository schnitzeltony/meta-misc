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
	orage \
	xfce4-orageclock-plugin \
	\
	strace \
	\
	devilspie2 \
	\
	xfce4-default-touch-config \
	\
	xfce4-closebutton-plugin \
	glade3 \
	libxfce4ui-glade \
	geany \
	\
	python-pygtk-demo \
	xfce4-vala \
"


#	geany-plugins
#	bash-completion
#	gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm

#	evince

#	ntp
#	cherokee

#	gateone
#	chromium
