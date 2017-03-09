require recipes-core/images/core-image-minimal.bb

LICENSE = "MIT"

DESCRIPTION = "Small console image for evaluaton purposes."

IMAGE_FEATURES += "package-management ssh-server-dropbear"

IMAGE_INSTALL += "busybox-httpd"
