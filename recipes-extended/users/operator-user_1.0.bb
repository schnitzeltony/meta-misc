DESCRIPTION = "This recipe adds a user 'operator' without password"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit useradd

USERNAME = "operator"
USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM_${PN} = "${USERNAME}"
USERADD_PARAM_${PN} = "-m -c Operator -d /home/${USERNAME} -s /bin/bash -g ${USERNAME} ${USERNAME}"

pkg_postinst_${PN}() {
if [ "x$D" != "x" ]; then
	exit 1
fi
passwd -d ${USERNAME}
}

ALLOW_EMPTY_${PN} = "1"
