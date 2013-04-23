require recipes-images/angstrom/systemd-image.bb

CONMANPKGS = ""

export IMAGE_BASENAME = "console-base-image-no-nm"

# to be removed again later?
IMAGE_FEATURES += "package-management"

# add some analysing tools
IMAGE_INSTALL += " \
	evtest \
	systemd-analyze \
"
