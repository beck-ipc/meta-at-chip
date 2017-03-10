
MACHINEOVERRIDES =. "mx6:mx6ul:"

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa7.inc

MACHINE_FEATURES += " serial rtc"

IMAGE_FSTYPES ?= " ubifs"

FLASH_ERASEBLOCK = "0x10000"
# For NOR flash we need the cleanmarkers so override the defaults
EXTRA_IMAGECMD_jffs2 = "-p -l -e ${FLASH_ERASEBLOCK}"

UBI_VOLNAME ?= "RootFs"
MKUBIFS_ARGS = " -c 480 -e 65472 -m 1"
UBINIZE_ARGS = " -p 64KiB -m 1 -O64"

SERIAL_CONSOLE ?= "19200 ttymxc00"
USE_VT ?= "0"
UBOOT_ENTRYPOINT = "0x80008000"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-beck"
PREFERRED_VERSION_linux-beck ?= "4.9%"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

# install images to filesystem
IMAGE_INSTALL_append = " kernel-image-zimage"


# U-Boot dummy configuration to make buildsystem happy
UBOOT_SUFFIX = "img"
SPL_BINARY = "SPL"
UBOOT_MAKE_TARGET = ""
UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd] = "mx6ul_14x14_evk_config,sdcard"
UBOOT_CONFIG[qspi1] = "mx6ul_14x14_evk_qspi1_config"
UBOOT_CONFIG[mfgtool] = "mx6ul_14x14_evk_config"
