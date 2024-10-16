DESCRIPTION = "Linux kernel for Beck IPC Hardware"

require recipes-kernel/linux/linux.inc


COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150|sc165-cti1*|sc145-cti1*)"

PV = "4.9.18"

SRCREV_pn-${PN} = "a84d6c12056580f2e814b869288c62500ae384a4"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
