require ${PN}.inc

inherit opie_git
PR = "r1"

SECTION = "opie/applications"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/apps/${APPNAME};name=first \
           ${OPIE_GIT};protocol=git;subpath=pics \
           ${OPIE_GIT};protocol=git;subpath=apps"
