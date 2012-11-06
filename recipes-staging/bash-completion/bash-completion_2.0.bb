SUMMARY = "Programmable completion for bash"
DESCRIPTION = "bash-completion is a collection of shell functions that take advantage of the programmable completion feature of bash."
HOMEPAGE = "http://bash-completion.alioth.debian.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "http://bash-completion.alioth.debian.org/files/bash-completion-${PV}.tar.bz2 \
           file://0001-completions-Makefile.am-symlinks-depends-on-DATA-to-.patch"
SRC_URI[md5sum] = "0d903f398be8c8f24bc5ffa6f86127f8"
SRC_URI[sha256sum] = "e5a490a4301dfb228361bdca2ffca597958e47dd6056005ef9393a5852af5804"

inherit allarch autotools
