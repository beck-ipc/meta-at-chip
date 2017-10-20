DESCRIPTION = "A basic image launching a Qt5 demo application"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"


inherit core-image

IMAGE_INSTALL += " i2c-tools custom-appstart qtbase-examples packagegroup-fonts-truetype"
