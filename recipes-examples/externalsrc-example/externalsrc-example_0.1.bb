LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "glib-2.0"


inherit pkgconfig autotools

# Allows to avoid fetching, unpacking and patching, since our code is already cloned by repo
inherit externalsrc

#SRC_URI = "git://github.com/sdklsdj.git;protocol=https;branch=master"
#SRCREV = "somerevision"

EXTERNALSRC_pn-${PN} = "${BSPDIR}/source-example"
EXTERNALSRC_BUILD_pn-${PN} = "${BSPDIR}/source-example"

#S = "${EDISONREPO_TOP_DIR}/linux-kernel"
#B = "${WORKDIR}/${BP}"

PR = "r0"
