DESCRIPTION = "Unclutter hides the cursor from display after a specified period of inactivity"
HOMEPAGE = "http://sourceforge.net/projects/unclutter/"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://README;md5=7c9b6681ac4b35194de7d5f3585702b6"
DEPENDS = "virtual/libx11"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${PN}/${PN}/source_${PV}/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c4464367b2db1d15fe36a8752e917c8"
SRC_URI[sha256sum] = "3a53575fe2a75a34bc9a2b0ad92ee0f8a7dbedc05d8783f191c500060a40a9bd"

inherit pkgconfig

do_compile() {
    oe_runmake CC="${CC}" CFLAGS="${CFLAGS}" LDOPTIONS="${LDFLAGS}"
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${mandir}/man1/
    oe_runmake BINDIR="${D}${bindir}" MANPATH="${D}${mandir}" INSTPGMFLAGS= install install.man
}

