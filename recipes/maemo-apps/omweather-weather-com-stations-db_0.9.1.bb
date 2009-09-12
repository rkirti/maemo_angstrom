# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Stations database and source lib for weather.com for Other Maemo Weather"
HOMEPAGE = "https://garage.maemo.org/projects/omweather/ "
SECTION = "apps"
LICENSE = "GPL"
DEPENDS = "libxml2 gtk+"
PR = "r0"

SRC_URI = "http://repository.maemo.org/extras-devel/pool/fremantle/free/source/o/${PN}/${PN}_${PV}.tar.gz"

inherit autotools pkgconfig gtk-icon-cache

do_stage(){
    autotools_stage_all
}

FILES_${PN} += "${datadir}/omweather \
                    ${libdir}/omweather/*"
