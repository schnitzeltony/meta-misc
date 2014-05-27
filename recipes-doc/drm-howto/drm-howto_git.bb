DESCRIPTION = "API Documentations, HowTos and Tutorials"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://modeset.c;endline=6;md5=12fcd17440f5bb1416fc3e32c056c2a1 \
    file://modeset-double-buffered.c;endline=6;md5=f84999709b3115a91a76dec5a232095d \
    file://modeset-vsync.c;endline=6;md5=14e022a2bdfc054ecfe93f8b27d47f58 \
"

DEPENDS = "libdrm"

inherit pkgconfig

SRC_URI = "git://github.com/schnitzeltony/docs.git;protocol=git;branch=master"

SRCREV = "4836eda0da9650c71c62b20f11c35ce288f9eb2f"
PV = "0.0.0+git${SRCPV}"
S = "${WORKDIR}/git/drm-howto"

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/modeset ${D}${bindir}
	install -m 0755 ${S}/modeset-double-buffered ${D}${bindir}
	install -m 0755 ${S}/modeset-vsync ${D}${bindir}
}
