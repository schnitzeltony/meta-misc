DESCRIPTION = "LXDM is the lightweight display manager"
HOMEPAGE = "http://wiki.lxde.org/en/LXDM"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
SRC_URI = " \
	git://lxde.git.sourceforge.net/gitroot/lxde/${BPN};protocol=git;branch=master \
	file://0001-data-Makefile.am-fix-typo-to-make-lxdm.conf-target-v.patch \
	file://0001-pam-use-common-instead-of-system-auth.patch \
	file://lxdm.service.in \
"

SRCREV = "7de2bf06f9c777d299e70e84ffd92d2e5f39d810"
PV = "0.4.2+git${SRCPV}"

DEPENDS = "virtual/libx11 glib-2.0 gtk+ consolekit libpam"

inherit autotools gettext systemd

S = "${WORKDIR}/git"

EXTRA_OECONF = "--enable-debug"

do_compile_append() {
	sed -i -e 's,bg=,# bg=,g' ${S}/data/lxdm.conf.in
	oe_runmake -C ${S}/data lxdm.conf
}

do_install_append() {
	install -d ${D}${systemd_unitdir}/system
	sed -e 's,%sbindir%,${sbindir},g' \
		< ${WORKDIR}/lxdm.service.in \
		> ${D}${systemd_unitdir}/system/lxdm.service
}

SYSTEMD_PACKAGES = "${PN}-systemd"
SYSTEMD_SERVICE = "lxdm.service"

RDEPENDS_${PN} = "librsvg pango pam-plugin-loginuid"
