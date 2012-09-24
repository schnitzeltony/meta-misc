DESCRIPTION = "Devilspie2 is a window matching utility, allowing the user to perform scripted actions on windows as they are created"
HOMEPAGE = "http://www.gusnan.se/devilspie2"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=00aefaa50aad75c21367df66102d542c \
                    file://GPL3.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "gtk+ glib-2.0 libwnck lua5.1 virtual/libx11"

SRC_URI = "http://www.gusnan.se/devilspie2/download/devilspie2_${PV}-src.tar.gz"
SRC_URI[md5sum] = "2e3583fdfacea7dfaf57205d1d5bd971"
SRC_URI[sha256sum] = "69e7ea03843f51fd8ac61b41ceb35621af910b5f478f4ee0732a57762d2620d9"

inherit pkgconfig

do_compile() {
    export GTK2=1
    oe_runmake CC="${CC}" CPPFLAGS="${CPPFLAGS}" LDFLAGS=" -ldl -lm ${LDFLAGS}"
}

do_install() {
    oe_runmake DESTDIR="${D}" PREFIX="${prefix}" install
}

