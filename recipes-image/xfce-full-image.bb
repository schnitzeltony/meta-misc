require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-full-image"

IMAGE_INSTALL += " \
	xdg-user-dirs-gtk \
	lxdm-systemd \
	\
	midori \
	epdfview \
	evince \
	firefox \
	gimp \
	gedit \
	gnome-bluetooth \
	gnome-disk-utility \
	florence \
	xarchiver \
	\
	strace \
	\
	ntp-systemd \
	cherokee-systemd \
	\
	libgles-omap3-x11demos \
"


#	gdm-systemd gdm-allow-root-login angstrom-gdm-xfce-hack
#	lightdm-gtk-greeter lightdm-systemd

#	gateone
#	chromium
#	dhcp-relay-systemd
#	slim
#	orage
