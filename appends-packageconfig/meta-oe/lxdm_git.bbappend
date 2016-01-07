# we had a PRINC here (?= in case mainline adds same)
PE ?= "1"

# enable autologin
do_install_append() {
	sed -i 	's,# autologin=.*,autologin=operator,g' \
		${D}${sysconfdir}/lxdm/lxdm.conf
}

pkg_preinst_${PN} () {
# backup configuration
if [ -e ${localstatedir}/lib/lxdm/lxdm.conf ]; then
	echo 'lxdm: backup configuration'
	cp ${localstatedir}/lib/lxdm/lxdm.conf ${localstatedir}/lib/lxdm/lxdm.conf.old
fi
}

pkg_postinst_${PN}_append () {
# restore configuration
if [ -e ${localstatedir}/lib/lxdm/lxdm.conf.old ]; then
	echo 'lxdm: restore configuration'
	cp ${localstatedir}/lib/lxdm/lxdm.conf.old ${localstatedir}/lib/lxdm/lxdm.conf
	rm ${localstatedir}/lib/lxdm/lxdm.conf.old
fi

# systemd_postinst is last - force override to avoid restarting during update
# copied from systemd.bbclass & modified
OPTS=""

if [ -n "$D" ]; then
    OPTS="--root=$D"
fi

if type systemctl >/dev/null 2>/dev/null; then
	systemctl $OPTS ${SYSTEMD_AUTO_ENABLE} ${SYSTEMD_SERVICE}

fi

# avoid systemd append
exit
}

RDEPENDS_${PN} = "operator-user"
