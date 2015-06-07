FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://bashrc \
"

do_install_append() {
    install -m 0644 ${WORKDIR}/bashrc ${D}${sysconfdir}/bashrc
}

