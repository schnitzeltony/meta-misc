PACKAGECONFIG ??= "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'kms fbdev wayland egl', '', d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'x11', '', d)} \
                   ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'launch', '', d)} \
                   libinput \
                  "
