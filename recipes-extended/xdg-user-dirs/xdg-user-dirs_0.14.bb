DESCRIPTION = "xdg-user-dirs is a tool to help manage user directories like the desktop folder and the music folder"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRC_URI = "http://user-dirs.freedesktop.org/releases/${BPN}-${PV}.tar.gz"

inherit autotools gettext

do_install_append () {
	install -d ${D}${sysconfdir}/skel/.config/
	mv ${D}${sysconfdir}/xdg/user-dirs.defaults ${D}${sysconfdir}/skel/.config/user-dirs.dirs
}

SRC_URI[md5sum] = "dc496ecde0e6a1e959bd8a38643f28fd"
SRC_URI[sha256sum] = "5f4e84f57c113f642ffdd646126855f45f1da955103119dbd2382edb516e6255"
