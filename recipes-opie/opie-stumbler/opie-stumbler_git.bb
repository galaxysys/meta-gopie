require ${PN}.inc

inherit opie_git

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opiestumbler;name=first \
           ${OPIE_GIT};protocol=git;subpath=apps \
	   file://opiestumbler.png"
