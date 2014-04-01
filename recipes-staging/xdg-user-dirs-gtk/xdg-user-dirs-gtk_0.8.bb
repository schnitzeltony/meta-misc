DESCRIPTION = "tool to manage well known user directories (Gtk extension)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRC_URI = "${GNOME_MIRROR}/${BPN}/${PV}/${BPN}-${PV}.tar.gz"
DEPENDS = "gtk+ xdg-user-dirs intltool-native"

inherit autotools gettext

SRC_URI[md5sum] = "9d2b5902314c0eaa32beea4a5951acf2"
SRC_URI[sha256sum] = "7fd38a9cac771b4e5424a80a9ff0f60ef9936f0502f1ab0f2e16c9bcbc3063ad"
