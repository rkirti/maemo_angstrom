# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "A Hildon theme"
HOMEPAGE = "Unknown"
SECTION = "ui"
LICENSE = "Creative Commons"
DEPENDS = "sapwood hildon-theme-cacher hildon-theme-layout-4"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0prealpha1/free/h/${PN}/${PN}_${PV}-1.cs2007q3.tar.gz"

inherit autotools pkgconfig

do_compile () {
        oe_runmake LAYOUT_DIR="${STAGING_DATADIR}/hildon-theme-layout-4"
}

FILES_${PN} += "/usr/share/* "
