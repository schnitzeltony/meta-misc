DESCRIPTION = "This recipe presets xfce user default configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r4"

inherit allarch

SRC_URI = " \
    file://.config \
    file://.local \
    file://.gnome2 \
    file://.gimp-2.8 \
    file://sonnenuntergang_08.jpg \
    file://Xfce-touch \
"

do_install() {
    # default user configration -> /etc/skel
    install -d ${D}${sysconfdir}/skel/Desktop
    cp -r ${WORKDIR}/.config ${D}${sysconfdir}/skel/
    cp -r ${WORKDIR}/.local ${D}${sysconfdir}/skel/
    cp -r ${WORKDIR}/.gimp-2.8 ${D}${sysconfdir}/skel/
    cp -r ${WORKDIR}/.gnome2 ${D}${sysconfdir}/skel/

    # gtk-theme for touch
    install -d ${D}${datadir}/themes
    cp -r ${WORKDIR}/Xfce-touch ${D}${datadir}/themes
    chmod -R 644 ${D}${datadir}/themes/Xfce-touch/                                                                                                                          
    chmod 0755 ${D}${datadir}/themes/Xfce-touch/                                                                                                                          
    chmod 0755 ${D}${datadir}/themes/Xfce-touch/gtk-2.0/
    chmod 0755 ${D}${datadir}/themes/Xfce-touch/gtk-3.0/                                                                                                                    

    # background
    install -d ${D}${datadir}/backgrounds
    install -m 0644 ${WORKDIR}/sonnenuntergang_08.jpg ${D}${datadir}/backgrounds/ 
}

FILES_${PN} += "${datadir}/backgrounds ${datadir}/themes"
