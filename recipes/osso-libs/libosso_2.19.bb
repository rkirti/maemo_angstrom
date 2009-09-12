# Copyright (C) 2009 Kirtika B Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
# NOTE: outo is now optional in libosso.
# libosso builds without outo. TO-DO- add outo recipes
DESCRIPTION = "Nokia OSSO IPC library"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
SECTION_${PN}-doc = "doc"
SECTION_${PN}-dev = "devel"
LICENSE = "GNU Lesser Public License-version 2.1"
PR = "r1"

SRC_URI = " \
            http://repository.maemo.org/pool/maemo5.0beta/free/libo/${PN}/${PN}_${PV}-1.tar.gz \
            file://${PN}/no-inlining.patch;patch=1;pnum=0 \
            file://${PN}/mer-changes.patch;patch=1 \
          "

# 28/05/09 18:51:21  FIXME No outo for now, so all these are senseless ATM
PACKAGES += "${PN}-outo ${PN}-outo-dev ${PN}-outo-dbg ${PN}-outo-bin-dbg ${PN}-outo-bin"

FILES_${PN}-outo = "${libdir}/outo/lib*.so"
FILES_${PN}-outo-dev = "${libdir}/outo/*.la ${libdir}/outo/*.a"
FILES_${PN}-outo-dbg = "${libdir}/outo/.debug/lib*.so"
FILES_${PN}-outo-bin-dbg = "${libdir}/outo/.debug/*bin"
FILES_${PN}-outo-bin = "${libdir}/outo/*bin ${libdir}/outo/mimedummy.doc"

require libosso.inc
