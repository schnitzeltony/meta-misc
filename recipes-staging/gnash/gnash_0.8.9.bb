DESCRIPTION = "Gnash is a GNU Flash movie player that supports many SWF v8 features"
HOMEPAGE = "http://www.gnu.org/software/gnash"
LICENSE = "GPLv3"
DEPENDS = "giflib cairo pango libtool gtk+ libsdl-mixer zlib boost jpeg pango curl freetype \
           speex virtual/egl gst-plugins-base"

SRC_URI = "ftp://ftp.gnu.org/gnu/${PN}/${PV}/${P}.tar.bz2"

inherit autotools pkgconfig

EXTRA_OECONF = " \
    --with-sysroot=${STAGING_DIR_TARGET}/${prefix} \
    --enable-gui=gtk \
    --enable-renderer=cairo,gles \
    --with-plugins-install=system \
    --enable-plugins \
    --disable-testsuite \
    --with-npapi-plugindir=${libdir}/mozilla/plugins \
    --with-pango-lib=${STAGING_LIBDIR} \
"

EXTRA_OECONF_append_omap3 = " \
    --enable-hwaccel=omap \
"

EXTRA_OECONF_append_omap4 = " \
    --enable-hwaccel=omap \
"

PACKAGES =+ " gnash-browser-plugin libgnashamf libgnashbackend libgnashbase libgnashgeo libgnashgui libgnashplayer libgnashserver "

FILES_gnash-browser-plugin= "${libdir}/mozilla/plugins/*"
FILES_libgnashamf = "${libdir}/gnash/libgnashamf-${PV}.so"
FILES_libgnashbackend = "${libdir}/gnash/libgnashbackend-${PV}.so"
FILES_libgnashbase = "${libdir}/gnash/libgnashbase-${PV}.so"
FILES_libgnashgeo = "${libdir}/gnash/libgnashgeo-${PV}.so"
FILES_libgnashgui = "${libdir}/gnash/libgnashgui-${PV}.so"
FILES_libgnashplayer = "${libdir}/gnash/libgnashplayer-${PV}.so"
FILES_libgnashserver = "${libdir}/gnash/libgnashserver-${PV}.so"

RDEPENDS_${PN}-browser-plugin += "${PN}"

acpaths = " -Imacros"

# Boost lacks defines for lots of archs
TARGET_CC_ARCH_append = " -I${STAGING_INCDIR}/cairo -I${STAGING_INCDIR}/libxml2 -DHAVE_POLL_H ${@[' -D_BIG_ENDIAN', ' -D_LITTLE_ENDIAN'][d.getVar('SITEINFO_ENDIANNESS', d, 1) == 'le']}"

do_install_append() {
	oe_runmake DESTDIR=${D} install-plugin
}

SRC_URI[md5sum] = "5b2be6b04a1bcc5fb404cc377034499e"
SRC_URI[sha256sum] = "f90dbdc6f03d787b239b9edacbea077b46d69ae9d85f08af23f256af389c48bd"
