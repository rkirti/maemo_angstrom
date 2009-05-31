# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Wrapper library for openobex"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "base"
DEPENDS = "libglib libopenobex1"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/o/${PN}/${PN}_${PV}+0m5.tar.gz"
S="${WORKDIR}/${PN}-${PV}+0m5"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}

