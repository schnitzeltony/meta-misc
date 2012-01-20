FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PRINC = "1"

pkg_postinst_dbus_append() {
	# as user of opkg and not r/o rootfs I still need runtime alignments
	if [ -z "$D" ]; then
		chown messagebus:messagebus ${localstatedir}/run/dbus ${localstatedir}/lib/dbus
		chown root:messagebus ${libexecdir}/dbus-daemon-launch-helper
		chmod 4755 ${libexecdir}/dbus-daemon-launch-helper
	fi
}
