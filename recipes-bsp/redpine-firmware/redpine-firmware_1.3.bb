DESCRIPTION = "Firmware for Redpine wireless module from RS9113.NBZ.NL.GNU.LNX.1.3"
HOMEPAGE = ""
LICENSE = "CLOSED"

inherit bin_package

PACKAGE_ARCH = "all"

SRC_URI = "\
           file://RS9113_AP_BT_DUAL_MODE.rps \
           file://RS9113_WLAN_BT_DUAL_MODE.rps \
           file://RS9113_WLAN_QSPI.rps \
           file://RS9113_WLAN_ZIGBEE.rps \
           file://RS9113_ZIGBEE_COORDINATOR.rps \
           file://RS9113_ZIGBEE_ROUTER.rps \
"

S = "${WORKDIR}"

do_install(){
    install -d ${D}/lib/firmware/
    install -m644 ${S}/*.rps ${D}/lib/firmware/
}
