# Copyright kernel concepts GmbH 2017
# Based on u-boot-fslc*
# Copyright (C) 2012-2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-bsp/u-boot/u-boot.inc

SUMMARY = "U-Boot bootloader for Beck IPC devices"
DESCRIPTION = "U-Boot based on mainline U-Boot used by FSL Community BSP in \
order to provide support for additinal features and specific support for Beck IPC hardware."
HOMEPAGE = "https://github.com/beck-ipc/uboot-at-chip"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150|sc165-cti1*)"

PROVIDES += "u-boot"

PV = "v2015.04-linux-at-chip-sc145+gitr${SRCPV}"

SRCREV = "b7f7d989cf258115b9d3f130807acbf42462e581"
SRCBRANCH = "2015.04-rel_imx_3.14.38_6ul_ga-linux-at-chip-sc145"

SRC_URI = "git://github.com/beck-ipc/uboot-at-chip.git;protocol=https;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
