# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Tool to generate gtkrc cache files on the fly"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "GPL"
DEPENDS = "gtk+"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/h/${PN}/${PN}_${PV}-1-recomp1.tar.gz"

S = "${WORKDIR}/${PN}-${PV}-1"

inherit autotools pkgconfig
