pkg_postinst_${PN}_append () {
# opkg does not set ownerships/permissions correcly so do that at first start/update
if [ "x$D" != "x" ]; then
    exit 1
fi
# see configure.log for more details
chown root:root ${libdir}/${BPN}-1/polkit-agent-helper-1
chmod 4755 ${libdir}/${BPN}-1/polkit-agent-helper-1

chown root:root ${bindir}/pkexec
chmod 4755 ${bindir}/pkexec

chown polkitd:polkitd ${sysconfdir}/${BPN}-1/rules.d
chmod 700 ${sysconfdir}/${BPN}-1/rules.d

chown polkitd:polkitd ${datadir}/${BPN}-1/rules.d
chmod 700 ${datadir}/${BPN}-1/rules.d
}

