# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Cyberlink for C AV library"
HOMEPAGE = "http://maemo.org"
LICENSE = "Nokia copyright"
#Hack to stop incorrect package naming
SECTION = "misc"
DEPENDS = "clinkc"
PR = "r15"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/c/${PN}/${PN}_${PV}-15.tar.gz"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}
