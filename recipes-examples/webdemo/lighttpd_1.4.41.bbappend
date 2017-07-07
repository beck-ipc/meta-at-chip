
FILES_${PN}_remove += "/www ${sysconfdir}"
FILES_${PN} += "${sysconfdir}/lighttpd.d ${sysconfdir}/init.d ${sysconfdir}/rc*"
FILES_${PN} += "/www/logs /www/var"
INSANE_SKIP_${PN} = "installed-vs-shipped"
