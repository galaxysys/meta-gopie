require ${PN}.inc

inherit opie_git
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/tools/pimconverter;name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps"
