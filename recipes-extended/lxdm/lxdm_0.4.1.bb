DESCRIPTION = "xdg-user-dirs is a tool to help manage user directories like the desktop folder and the music folder"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
SRC_URI = " \
	${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz \
	file://lxdm.service.in \
"

inherit autotools gettext systemd

do_install_append() {
    install -d ${D}${systemd_unitdir}/system
    sed -e 's,%sbindir%,${sbindir},g' \
        < ${WORKDIR}/lxdm.service.in \
        > ${D}${systemd_unitdir}/system/lxdm.service
}

SYSTEMD_PACKAGES = "${PN}-systemd"
SYSTEMD_SERVICE = "lxdm.service"

SRC_URI[md5sum] = "8da1cfc2be6dc9217c85a7cf51e1e821"
SRC_URI[sha256sum] = "9e0d0a5672fcf31a18de8178ce73eab1723d6ae7097dfe41e9fe2c46e180cf08"
