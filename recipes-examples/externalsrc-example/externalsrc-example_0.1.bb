DESCRIPTION = "Example how to build sources out of tree"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
HOMEPAGE = ""

DEPENDS = "glib-2.0"


inherit pkgconfig autotools

# Allows to avoid fetching, unpacking and patching, since our code is already cloned by repo
inherit externalsrc

EXTERNALSRC_pn-${PN} = "${BSPDIR}/../source-example"
EXTERNALSRC_BUILD_pn-${PN} = "${BSPDIR}/../source-example"

PR = "r0"
