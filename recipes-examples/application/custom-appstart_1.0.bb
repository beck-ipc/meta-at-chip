DESCRIPTION = "Application launch example, turns on backlight"
SECTION = "application"
PRIORITY = "optional"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=ee1e1cf013da8b22d51195047794472f"

RDEPENDS_${PN} = "i2c-tools"

SRC_URI = "file://StartApplication.sh \
           "

INITSCRIPT_NAME = "StartApplication.sh"
INITSCRIPT_PARAMS = "defaults 80"

inherit update-rc.d

do_compile () {
}

do_install () {
	install -d ${D}/etc/init.d
	install -m755 ${WORKDIR}/StartApplication.sh ${D}/etc/init.d
#	install -d ${D}/opt/bitmaps
#	install -m644 ${WORKDIR}/logo.ppm ${D}/opt/bitmaps/
}

FILES_${PN} += "/etc /opt/bitmaps"
