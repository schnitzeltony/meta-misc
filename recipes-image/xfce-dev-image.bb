require xfce-base-image.bb

export IMAGE_BASENAME = "xfce-dev-image"

IMAGE_FEATURES += "dev-pkgs dbg-pkgs staticdev-pkgs doc-pkgs"

IMAGE_INSTALL += " \
	packagegroup-xfce-extended \
	lxdm \
	\
	firefox \
	epdfview \
	xarchiver unzip xz tar bzip2 \
	gedit \
	\
	strace \
	gcc python perl php vala lua5.1 php json-glib \
	gdb valgrind \
	make cmake \
	automake autoconf libtool binutils elfutils gnu-config m4 patch pkgconfig quilt \
	git subversion \
	glade3 dialog \
	xfce4-dev-tools libxfce4ui-glade\
	texinfo \
	ncurses \
	gawk \
	chrpath \
	ccache \
"
