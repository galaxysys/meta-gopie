DESCRIPTION = "4 wins"
SECTION = "opie/games"
LICENSE = "GPLv2"
AUTHOR = "Anders Widell, Steve Dunham, Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-Win4.html"


SRC_URI = "http://sources.openembedded.org/win4_V1.0.1.tar.gz \
           file://win4.patch"

S = "${WORKDIR}/win4_V${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://Win4.cpp;beginline=4;endline=12;md5=865e24c089f008b0e12624a42687cac4"

APPNAME = "win4"
APPTYPE = "binary"
APPDESKTOP = "${S}"


do_compile_prepend() {
	oe_runmake -C images
}

do_install () {
	install -d ${D}${palmtopdir}/apps/Games/
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/${APPNAME}.desktop ${D}${palmtopdir}/apps/Games
}


inherit opie

SRC_URI[md5sum] = "0817e2606cd87fe2cbead6b7104f7425"
SRC_URI[sha256sum] = "00b2384e225d6a1cbda4994c63103ac229269bb2946537e9357655e5c5b84333"
