DESCRIPTION = "A basic image with web browser session and demo application"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear x11-base"


inherit core-image

IMAGE_INSTALL += " packagegroup-x11-browser epiphany-session i2c-tools custom-appstart"
IMAGE_INSTALL += " lighttpd webdemo"
