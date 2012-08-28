DESCRIPTION = "LXDM is the lightweight display manager"
HOMEPAGE = "http://blog.lxde.org/?p=531"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
SRC_URI = " \
	git://lxde.git.sourceforge.net/gitroot/lxde/${BPN};protocol=git;branch=master \
	file://0001-data-Makefile.am-fix-typo-to-make-lxdm.conf-target-v.patch \
	file://0001-pam-use-common-instead-of-system-auth.patch \
	file://lxdm.service.in \
	file://lxdm.conf \
"

SRCREV = "7de2bf06f9c777d299e70e84ffd92d2e5f39d810"
PV = "0.4.2+git${SRCPV}"

DEPENDS = "cairo consolekit dbus gdk-pixbuf glib-2.0 gtk+ virtual/libx11 libxcb pango"

inherit autotools gettext systemd

S = "${WORKDIR}/git"

do_compile_append() {
	sed -i -e 's,bg=,# bg=,g' ${S}/data/lxdm.conf.in
	oe_runmake -C ${S}/data lxdm.conf
}

do_install_append() {
	install -d ${D}${systemd_unitdir}/system
	sed -e 's,%sbindir%,${sbindir},g' \
		< ${WORKDIR}/lxdm.service.in \
		> ${D}${systemd_unitdir}/system/lxdm.service
	install -d ${D}${localstatedir}/lib/lxdm
	install -m 644 ${WORKDIR}/lxdm.conf ${D}${localstatedir}/lib/lxdm
}

pkg_postinst_${PN} () {
if [ "x$D" != "x" ]; then
    exit 1
fi
langs=""
for lang in `locale -a | grep _`; do
    if [ "x$langs" = "x" ]; then
        langs="$lang"
    else
        langs="$langs $lang"
    fi
done
sed -i "s:last_langs=.*$:last_langs=$langs:g" ${localstatedir}/lib/lxdm/lxdm.conf
}

SYSTEMD_PACKAGES = "${PN}-systemd"
SYSTEMD_SERVICE = "lxdm.service"

RDEPENDS_${PN} = "pam-plugin-loginuid eglibc-utils"
