DESCRIPTION = "Linux kernel for Beck IPC Hardware"
KERNEL_IMAGETYPE = "zImage"

require recipes-kernel/linux/linux.inc
require recipes-kernel/linux/linux-dtb.inc


COMPATIBLE_MACHINE = "(sc145-db150)"

PV = "4.9.13"
PR = "r0"
SRCREV_pn-${PN} = "c29e52f4aa3d42338c3234d73a19723e9267a46a"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
