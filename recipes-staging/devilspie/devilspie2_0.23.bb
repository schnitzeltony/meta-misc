DESCRIPTION = "Devilspie2 is a window matching utility, allowing the user to perform scripted actions on windows as they are created"
HOMEPAGE = "http://www.gusnan.se/devilspie2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=00aefaa50aad75c21367df66102d542c \
                    file://GPL3.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gtk+ glib-2.0 libwnck lua5.1 virtual/libx11"

SRC_URI = " \
	http://www.gusnan.se/devilspie2/download/devilspie2_${PV}-src.tar.gz \
	file://0001-don-t-bypass-folder-option.patch \
	file://default.lua \
	file://devilspie2.desktop \
"
SRC_URI[md5sum] = "e4d342686faf826e51daec47c9a73056"
SRC_URI[sha256sum] = "86837b9b3ef15bf9ddc75e74fb8bdd2307327ffe65a10ac6c758684a8bde5da3"

inherit pkgconfig

do_compile() {
	export GTK2=1
	oe_runmake CC="${CC}" CPPFLAGS="${CPPFLAGS}" LDFLAGS=" -ldl -lm ${LDFLAGS}"
}

do_install() {
	oe_runmake DESTDIR="${D}" PREFIX="${prefix}" install
	install -d ${D}/${sysconfdir}/devilspie2
	install -m 644 ${WORKDIR}/default.lua ${D}/${sysconfdir}/devilspie2
	install -d ${D}/${sysconfdir}/xdg/autostart
	install -m 0644 ${WORKDIR}/devilspie2.desktop ${D}/${sysconfdir}/xdg/autostart
}
