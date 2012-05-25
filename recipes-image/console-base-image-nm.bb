require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = "networkmanager network-manager-applet"

export IMAGE_BASENAME = "console-base-image-nm"

# to be removed again later?
IMAGE_FEATURES += "package-management"

