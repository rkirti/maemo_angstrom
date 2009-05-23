# Copyright (C) 2009 Kirtika B Ruchandani <kirtibr@gmail.com> 
# Released under the MIT license (see COPYING.MIT for the terms)
# NOTE: outo is now optional in libosso.
# libosso builds without outo. TO-DO- add outo recipes

DESCRIPTION = "Nokia OSSO IPC library"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser Public License-version 2.1"
SECTION = "base"
SECTION_${PN}-doc = "doc"
SECTION_${PN}-dev = "devel"

PR = "r1"


require libosso.inc


SRC_URI = " \
            http://repository.maemo.org/pool/diablo/free/libo/${PN}/${PN}_${PV}-1.tar.gz \
            file://gcc431.patch;patch=1 \
          "

PACKAGES += "${PN}-outo ${PN}-outo-dev ${PN}-outo-dbg ${PN}-outo-bin-dbg ${PN}-outo-bin"

FILES_${PN}-outo = "${libdir}/outo/lib*.so"
FILES_${PN}-outo-dev = "${libdir}/outo/*.la ${libdir}/outo/*.a"
FILES_${PN}-outo-dbg = "${libdir}/outo/.debug/lib*.so"
FILES_${PN}-outo-bin-dbg = "${libdir}/outo/.debug/*bin"
FILES_${PN}-outo-bin = "${libdir}/outo/*bin ${libdir}/outo/mimedummy.doc"
