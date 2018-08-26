LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.txt;md5=84dd1d737b963502e05a5a066dc56901"

SRC_URI = " \
    git://github.com/schnitzeltony/sdl2rendercopyex.git \
"

SRCREV= "f5bf339076b6d4c7ca50cff1cb43e28ce71d1b94"
PV = "0.0.0+git${SRCPV}"

inherit pkgconfig

DEPENDS = "libsdl2 libsdl2-image"

S = "${WORKDIR}/git"

CLEANBROKEN = "1"

do_compile_prepend() {
    sed -i 's:\"arrow.png\":\"${datadir}/${BPN}/arrow.png\":g' ${S}/15_rotation_and_flipping.cpp
}

do_install() {
	install -d ${D}/${datadir}/${BPN}
	install -m 0755 ${S}/arrow.png ${D}/${datadir}/${BPN}

	install -d ${D}/${bindir}
	install -m 0755 ${S}/${PN} ${D}/${bindir}
}
