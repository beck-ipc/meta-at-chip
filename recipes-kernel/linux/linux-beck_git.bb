DESCRIPTION = "Linux kernel for Beck IPC Hardware"

require recipes-kernel/linux/linux.inc
require recipes-kernel/linux/linux-dtb.inc


COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150|sc165-cti1*|sc145-cti1*)"

PV = "4.9.18"

SRCREV_pn-${PN} = "607d840bd74b6f09b8280d3cc810edda63069ee0"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
