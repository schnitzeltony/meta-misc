# we had a PRINC here (?= in case mainline adds same)
PE ?= "1"

SYSTEMD_UPDATE_STARTSTOP = "disable"

# enable autologin
do_install_append() {
	sed -i 	's,# autologin=.*,autologin=operator,g' \
		${D}${sysconfdir}/lxdm/lxdm.conf
}

pkg_preinst_${PN}_append () {
if [ "x$D" = "x" ]; then
    # backup configuration
    if [ -e "${localstatedir}/lib/lxdm/lxdm.conf" ]; then
        echo 'lxdm: backup configuration'
        cp ${localstatedir}/lib/lxdm/lxdm.conf ${localstatedir}/lib/lxdm/lxdm.conf.old
    fi
fi
}

pkg_postinst_${PN}_append () {
if [ "x$D" = "x" ]; then
    # restore configuration
    if [ -e "${localstatedir}/lib/lxdm/lxdm.conf.old" ]; then
        echo 'lxdm: restore configuration'
        cp ${localstatedir}/lib/lxdm/lxdm.conf.old ${localstatedir}/lib/lxdm/lxdm.conf
        rm ${localstatedir}/lib/lxdm/lxdm.conf.old
    fi
fi
}

RDEPENDS_${PN} += "operator-user"
