PACKAGECONFIG_DISTRO = " \
    examples \
    accessibility \
    icu \
    sql-sqlite \
    fontconfig \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'gtkstyle', '', d)} \
"

PACKAGECONFIG_GL = "gles2"
