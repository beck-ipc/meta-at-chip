DESCRIPTION = "A basic image launching a Qt5 demo application"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"

inherit core-image distro_features_check populate_sdk_qt5

#REQUIRED_DISTRO_FEATURES = "x11"

TOOLCHAIN_TARGET_TASK_append = " qtbase-doc"


IMAGE_INSTALL += " i2c-tools custom-appstart qtbase-examples qtbase-plugins packagegroup-fonts-truetype"
