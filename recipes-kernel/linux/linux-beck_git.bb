DESCRIPTION = "Linux kernel for Beck IPC Hardware"

require recipes-kernel/linux/linux.inc
require recipes-kernel/linux/linux-dtb.inc


COMPATIBLE_MACHINE = "(sc145-db150)"

PV = "4.9.18"

SRCREV_pn-${PN} = "c28233e0b6c1b8d452e5ce527feeda79602a8b71"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
