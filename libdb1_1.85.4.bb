# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Berkeley database library"
HOMEPAGE = "unknown"
LICENSE = "UCB BSD license"
SECTION = "libs"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/libd/${PN}/${PN}_${PV}-osso8.tar.gz \
           file://libdb1/makefile.patch;patch=1;pnum=0 "


S = "${WORKDIR}/${PN}-${PV}/PORT/linux"

do_compile() {
	oe_runmake PREFIX=${prefix} libdir=${libdir} includedir=${includedir} D=${D} 
}

do_install() {
	oe_runmake PREFIX=${prefix}  libdir=${libdir} includedir=${includedir} D=${D} DESTDIR=${D} install
}



