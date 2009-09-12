# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Nokia Hildon File Manager Library"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "GNU Lesser General Public License-version 2.1"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/libh/${PN}/${PN}_${PV}+0m5.tar.gz \
           file://libhildonfm/mer-changes.patch;patch=1;pnum=0"

S = "${WORKDIR}/libhildonfm-2.11+0m5"

require libhildonfm.inc
