DESCRIPTION = "Linux kernel for Beck IPC Hardware"
KERNEL_IMAGETYPE = "zImage"

require recipes-kernel/linux/linux.inc


COMPATIBLE_MACHINE = "(sc145-db150)"

PV = "4.9.13"
PR = "r0"
SRCREV_pn-${PN} = "c34101cdc6acb0c056d07c0bc9e7c1df4758f76e"

SRC_URI += "git://git.kernelconcepts.de/linux-beck.git;protocol=git;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
