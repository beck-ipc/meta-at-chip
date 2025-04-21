DESCRIPTION = "Linux kernel for Beck IPC Hardware"

DEPENDS += "lzop-native"

require recipes-kernel/linux/linux.inc

COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150|sc165-cti1*|sc145-cti1*)"

PV = "4.9.18"

SRCREV:pn-${PN} = "c33d8ebb06f13ae31c3cb00f1306778cf02761dc"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v4.9-beck; \
            file://0001-Port-patch-replace-Sun-Solaris-style-flag-on-section.patch \
            file://defconfig"

S = "${WORKDIR}/git"
