PACKAGECONFIG = "wayland launch fbdev"

EXTRA_OECONF += "WESTON_NATIVE_BACKEND=fbdev-backend.so"
