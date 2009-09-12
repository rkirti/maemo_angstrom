# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Weather plugin for hildon home"
HOMEPAGE = "http://maemo.org"
SECTION = "x11"
LICENSE = "GNU Lesser General Public License-version 2.1"
DEPENDS = "hildon-desktop osso-af-settings"
PR = "r3"

SRC_URI = "svn://stage.maemo.org/svn/maemo/projects/haf/trunk;module=hildon-home-weather;rev=18844;proto=https"

S = "${WORKDIR}/hildon-home-weather"

inherit autotools pkgconfig

FILES_${PN} += "${libdir}/hildon-desktop/*"
