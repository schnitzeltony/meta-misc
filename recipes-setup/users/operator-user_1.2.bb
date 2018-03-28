DESCRIPTION = "This recipe adds a user 'operator' without password"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit allarch

USERNAME = "operator"
# space separated groups user shall be member of
USERGROUPS = "mpd audio video network datetime systemd-journal"

pkg_postinst_ontarget_${PN}() {
groupadd -f ${USERNAME}
useradd -m -c Operator -d /home/${USERNAME} -s /bin/bash -k /etc/skel -g ${USERNAME} ${USERNAME}
passwd -d ${USERNAME}
for usergroup in ${USERGROUPS}; do
	if grep -q ^${usergroup}: ${sysconfdir}/group; then
		usermod -a -G $usergroup ${USERNAME}
	fi
done
}

pkg_postrm_${PN}() {
userdel -rf ${USERNAME}
}

ALLOW_EMPTY_${PN} = "1"

# all those we are member of
RDEPENDS_${PN} = "polkit-group-rule-datetime polkit-group-rule-network audio-tweaks"
#pointercal-xinput

RPROVIDES_${PN} += "user-operator"
RREPLACES_${PN} += "user-operator"
RCONFLICTS_${PN} += "user-operator"

