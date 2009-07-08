# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Wrapper for supporting dbus callbacks in notification actions"
HOMEPAGE = "http://maemo.org "
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "libs"
DEPENDS = "libnotify"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/h/${PN}/${PN}_${PV}-1-recomp1.tar.gz"

S = "${WORKDIR}/${PN}-${PV}-1"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}
