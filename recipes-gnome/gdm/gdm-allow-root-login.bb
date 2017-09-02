DESCRIPTION = "Allow root login for GDM"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit allarch
ALLOW_EMPTY_${PN} = "1"

pkg_postinst_${PN}() {
#!/bin/sh
grep "AllowRoot" $D/etc/gdm/custom.conf
if [ $? -eq 0 ]; then
    echo "NOTE:: custom.conf already has 'AllowRoot' configured - not patching"
else
	sed -i -e 's:\[security\]:\[security\]\nAllowRoot=true:' $D/etc/gdm/custom.conf
fi
}

RDEPENDS_${PN} = "gdm"
