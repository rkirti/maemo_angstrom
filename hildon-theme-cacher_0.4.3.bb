# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Tool to generate gtkrc cache files on the fly"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "gtk2.0"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/h/${PN}/${PN}_${PV}-1-recomp1.tar.gz"


inherit autotools pkgconfig

S="${WORKDIR}/${PN}-${PV}-1"













