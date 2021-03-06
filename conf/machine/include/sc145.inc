
MACHINEOVERRIDES =. "mx6:mx6ul:"

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa7.inc


MACHINE_FEATURES += " uboot serial rtc"

IMAGE_FSTYPES ?= " ubifs"

FLASH_ERASEBLOCK = "0x10000"
# For NOR flash we need the cleanmarkers so override the defaults
EXTRA_IMAGECMD_jffs2 = "-p -l -e ${FLASH_ERASEBLOCK}"

UBI_VOLNAME ?= "rootfs"
MKUBIFS_ARGS = " -c 1000 -e 65408 -m 1"
UBINIZE_ARGS = " -p 64KiB -m 1 -O64"

SERIAL_CONSOLE ?= "115200 ttymxc3"
USE_VT ?= "0"
UBOOT_ENTRYPOINT := "0x80800000"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-beck"
PREFERRED_VERSION_linux-beck ?= "4.9%"
KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
KERNEL_IMAGETYPE := "uImage"

# install images to filesystem
IMAGE_INSTALL_append = " kernel-image-uimage kernel-devicetree"

# U-Boot configuration
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot-beck"
SPL_BINARY = ""
UBOOT_MAKE_TARGET = "qspi-u-boot.imx"
UBOOT_BINARY = "qspi-u-boot.imx"
UBOOT_CONFIG ??= "qspi"
UBOOT_CONFIG[sd] = "beck_sc145_sd_defconfig"
UBOOT_CONFIG[qspi] = "beck_sc145_defconfig,,qspi-u-boot.imx"
