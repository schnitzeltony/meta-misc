require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-full-image"

IMAGE_INSTALL += " \
	xdg-user-dirs-gtk \
	lxdm \
	\
	midori \
	epdfview \
	gimp \
	gnome-bluetooth \
	gnome-disk-utility \
	florence \
	xarchiver \
	\
	strace \
	\
	libgles-omap3-x11demos \
"


#	gdm gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm
#	slim

#	evince
#	firefox

#	ntp
#	cherokee

#	gedit
#	gateone
#	chromium
#	orage
