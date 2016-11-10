SYSTEMD_UPDATE_STARTSTOP = "disable"

# enable autologin
do_install_append() {
	sed -i 	's:^User=.*:User=operator:' ${D}${sysconfdir}/sddm.conf
}

pkg_preinst_${PN}_append () {
if [ "x$D" = "x" ]; then
    # backup configuration
    if [ -e "${localstatedir}/lib/sddm/state.conf" ]; then
        echo 'sddm: backup configuration'
        cp ${localstatedir}/lib/sddm/state.conf ${localstatedir}/lib/sddm/state.conf.old
    fi
fi
}

pkg_postinst_${PN}_append () {
if [ "x$D" = "x" ]; then
    # restore configuration
    if [ -e "${localstatedir}/lib/sddm/state.conf.old" ]; then
        echo 'sddm: restore configuration'
        cp ${localstatedir}/lib/sddm/state.conf.old ${localstatedir}/lib/sddm/state.conf
        rm ${localstatedir}/lib/sddm/state.conf.old
    fi
fi
}

RDEPENDS_${PN} += "operator-user"
