LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83911cd16344df650433edf1b35fd956"

SRC_URI = " \
    git://github.com/schnitzeltony/sdl2box.git;branch=master \
    file://0001-use-pkg-config-to-find-sdl2.patch \
"

SRCREV= "469a02ee59ffd8b5e40cc2cb85ed8955b146f0c1"
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
