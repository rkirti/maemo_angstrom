# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Hildon Icons"
HOMEPAGE = "http://maemo.org"
SECTION = "x11"
LICENSE = "unknown"

SRC_URI = "http://ftp.de.debian.org/debian/pool/main/h/${PN}/${PN}_${PV}.debian.orig.tar.gz  \
           file://hildon-icons/mer-changes.patch;patch=1"

S = "${WORKDIR}/${PN}-${PV}.debian.orig"

inherit gtk-icon-cache

do_install(){
    install -d ${D}${datadir}/icons ${D}${datadir}/icons/hildon
    install -m 0755  ${S}/index.theme ${D}${datadir}/icons/hildon
        sh ${S}/install-theme.sh ${S}/icons ${D}${datadir}/icons/hildon
        sh ${S}/make-mime-symlinks.sh ${D}${datadir}/icons/hildon/scalable
}

PACKAGES = "${PN}"

FILES_${PN} = "${datadir}/icons/*"
