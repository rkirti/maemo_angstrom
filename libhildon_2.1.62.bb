# Copyright (C) 2009  Kirtika B Ruchandani <kirtibr@gmail.com> 
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildon widget library"
HOMEPAGE = "http://live.gnome.org/Hildon"
LICENSE = "GNU Lesser General Public License-version 2.1 "
SECTION = "base"
DEPENDS = "gconf-dbus esound gtk+ gtk-doc libpng libxt libxi libcanberra"
PR = "r1"


SRC_URI = "http://repository.maemo.org/pool/fremantle/free/libh/${PN}/${PN}_${PV}-1+0m5.tar.gz"


require libhildon.inc
