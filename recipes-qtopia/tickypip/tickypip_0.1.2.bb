DESCRIPTION = "Tickypip"
SECTION = "opie/games"
LICENSE = "GPL"
AUTHOR = "Christian Hammond"
HOMEPAGE = "http://www.chipx86.com/projects/tickypip/"
RRECOMMENDS_${PN} = "tickypip-levels"
PR = "r6"

SRC_URI = "http://www.openzaurus.org/download/3.5.4/sources/tickypip-0.1.2.tar.gz \
           file://path_fix.patch \
           file://tickypip.desktop \
           file://tickypip.png"

# No license files present in the source distribution, assume GPL based on LICENSE above and
# wayback archived copy of above web link
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

APPNAME = "tickypip"
APPTYPE = "binary"
APPDESKTOP = "${WORKDIR}"

QMAKE_PROFILES = "tickypip.pro"
EXTRA_QMAKEVARS_POST += "DEFINES-=LOCAL_COMPILE DEFINES+=DATA_BASEDIR='\"${palmtopdir}\"'"

do_install () {
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${WORKDIR}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/images/*.png ${D}${palmtopdir}/pics/${APPNAME}/

# copy share
	install -d ${D}${palmtopdir}/share/${APPNAME}/levels
	install -m 0644 ${S}/levels/* ${D}${palmtopdir}/share/${APPNAME}/levels/
}


inherit opie

SRC_URI[md5sum] = "5a085296b1147fe970a256a9b2d0f91f"
SRC_URI[sha256sum] = "f3b5722c145ebeee3523b4941afdaf75d03a56f1922a9d3662dc1715aa24ca34"
