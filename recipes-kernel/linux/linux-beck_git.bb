DESCRIPTION = "Linux kernel for Beck IPC Hardware"

DEPENDS += "rsync-native lzop-native"

require recipes-kernel/linux/linux.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

COMPATIBLE_MACHINE = "(sc145-db150|sc165-db150|sc165-cti1*|sc145-cti1*)"

PV = "5.10.240"

SRCREV:pn-${PN} = "be18925ab6b9a56a1e4d5e0c080e1bbd5d83a54a"

SRC_URI += "git://github.com/beck-ipc/kernel-at-chip.git;protocol=https;branch=v5.10.y-beck; \
            file://defconfig"

S = "${WORKDIR}/git"
