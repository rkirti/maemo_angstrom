# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Tools for developing hildon themes"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base/ui"
DEPENDS = "libgtk2.0"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/h/${PN}/${PN}_${PV}-1.tar.gz"

inherit autotools pkgconfig


