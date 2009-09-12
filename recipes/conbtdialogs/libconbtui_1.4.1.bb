# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "DBUS API for invoking various dialogs"
HOMEPAGE = "http://maemo.org"
SECTION = "x11/apps"
LICENSE = "GNU Lesser General Public License-version 2.1"
#No build dependencies specified in package's debian/control
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0alpha/free/libc/${PN}/${PN}_${PV}.tar.gz "

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}

#Just to stay  consistent with Maemo packaging
PACKAGES = "conbtdialogs-dev"

FILES_conbtdialogs-dev = "/usr/*"
