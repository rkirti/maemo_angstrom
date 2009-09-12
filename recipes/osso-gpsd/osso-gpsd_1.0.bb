# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "GPS daemon for OSSO based on gpsd"
HOMEPAGE = "unknown"
SECTION = "comm"
LICENSE = "BSD"
DEPENDS = "dbus-glib"
PR = "r29"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/o/${PN}/${PN}_${PV}-29.tar.gz"

inherit autotools gtk-icon-cache

do_stage(){
    autotools_stage_all
}

FILES_${PN} += "${datadir}/icons \
                 ${datadir}/dbus-1"
FILES_${PN}-doc += "${datadir}/osso-help/"
