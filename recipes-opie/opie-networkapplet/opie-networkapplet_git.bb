require ${PN}.inc

PV = "${OPIE_GIT_PV}"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/applets/networkapplet \
	   ${OPIE_GIT};protocol=git;subpath=pics"