# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Libpng used by Maemo"
HOMEPAGE = "http://www.libpng.org/pub/png/libpng.html"
LICENSE = "unknown"
SECTION = "libs"
DEPENDS = "zlib"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/libp/${PN}/${PN}_${PV}-1maemo1.tar.gz"

require libpng.inc

do_stage() {
	cp libpng.pc libpng12.pc
	install -m 644 png.h ${STAGING_INCDIR}/png.h
	install -m 644 pngconf.h ${STAGING_INCDIR}/pngconf.h
	oe_libinstall -so libpng ${STAGING_LIBDIR}/
	oe_libinstall -so libpng12 ${STAGING_LIBDIR}/
	ln -sf libpng12.so ${STAGING_LIBDIR}/libpng.so
}

do_rm_work(){
    :
}






