DESCRIPTION = "Beck IPC Linux@CHIP Web Demo"
SECTION = "application"
PRIORITY = "optional"
LICENSE = "CLOSED"

RDEPENDS_${PN} = "php php-cli php-cgi lighttpd-module-fastcgi lighttpd-module-cgi"

S = "${WORKDIR}/git"
SRCREV = "abe529be6c3c19d12388042c09ca51eb609acf58"
PV = "1.0+git${SRCPV}"

SRC_URI = "git://github.com/beck-ipc/at-chip-webdemo.git;protocol=https \
           file://lighttpd.conf \
          "

do_compile () {
}

do_install () {
	install -d ${D}/www/pages
	install -m644 ${S}/index.html ${D}/www/pages/
	install -m644 ${S}/favicon.ico ${D}/www/pages/
	install -m644 ${S}/style.css ${D}/www/pages/
	install -d ${D}/www/pages/js
	install -m644 ${S}/js/*.js ${D}/www/pages/js/
	install -d ${D}/www/pages/php
	install -m644 ${S}/php/*.php ${D}/www/pages/php/
	install -d ${D}/www/pages/images
	install -m644 ${S}/images/beck.png ${D}/www/pages/images/
	install -d ${D}/${sysconfdir}
	install -m644 ${WORKDIR}/lighttpd.conf ${D}/${sysconfdir}/
}

FILES_${PN} += "/www/pages ${sysconfdir}"

