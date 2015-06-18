PACKAGECONFIG_FONTS = "fontconfig"

PACKAGECONFIG_DISTRO += " \
    examples \
    accessibility \
    icu \
    sql-sqlite \
"

# meta-fsl-arm takes care the others don't yet
#PACKAGECONFIG_GL = "gl"
PACKAGECONFIG_GL = "gles2"
