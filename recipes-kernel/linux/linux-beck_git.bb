DESCRIPTION = "Linux kernel for Beck IPC Hardware"

require recipes-kernel/linux/linux.inc
require recipes-kernel/linux/linux-dtb.inc


COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150)"

PV = "4.9.18"

SRCREV_pn-${PN} = "82c7be97cce616209d32ea2220247b3bce7196ea"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
