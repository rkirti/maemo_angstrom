# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Maemo theming tools and layout "
HOMEPAGE = "http://maemo.org"
LICENSE = "Creative Commons"
SECTION = "ui"
DEPENDS = "hildon-theme-tools"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/h/${PN}/${PN}_${PV}-1.tar.gz"

inherit autotools pkgconfig


