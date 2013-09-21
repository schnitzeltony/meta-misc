PRINC := "${@int(PRINC) + 1}"

# avoid openssh dragged in by dev/dbg-package
RDEPENDS_${PN}-dev = ""
RRECOMMENDS_${PN}-dbg = ""
