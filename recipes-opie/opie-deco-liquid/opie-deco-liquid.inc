DESCRIPTION = "Liquid window decoration style for Opie"
SECTION = "opie/decorations"
LICENSE = "GPLv2"
# FIXME stopgap until split archives have license files included
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
DEPENDS = "libqtaux2"
APPNAME = "liquid"


S = "${WORKDIR}/liquid"

inherit opie
