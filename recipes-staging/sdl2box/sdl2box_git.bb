LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83911cd16344df650433edf1b35fd956"

SRC_URI = " \
    git://github.com/schnitzeltony/sdl2box.git;branch=master \
    file://0001-use-pkg-config-to-find-sdl2.patch \
"

SRCREV= "a66f86061fb9b2626f5a5bde316d909a042034a0"
PV = "0.0.0+git${SRCPV}"

inherit pkgconfig

DEPENDS = "libsdl2"

S = "${WORKDIR}/git"

CLEANBROKEN = "1"


LDFLAGS += "-lSDL2"

do_install() {
	install -d ${D}/${bindir}
	install -m 0755 ${S}/${PN} ${D}/${bindir}
}
