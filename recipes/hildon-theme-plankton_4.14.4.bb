# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A Hildon theme"
HOMEPAGE = "Unknown"
LICENSE = "Creative Commons"
SECTION = "ui"
DEPENDS = "sapwood hildon-theme-cacher hildon-theme-layout-4"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0prealpha1/free/h/${PN}/${PN}_${PV}-1.cs2007q3.tar.gz"


inherit autotools pkgconfig


FILES_${PN} += "/usr/share/* " 
