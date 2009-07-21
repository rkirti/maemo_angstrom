# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Berkeley database library"
HOMEPAGE = "unknown"
LICENSE = "UCB BSD license"
SECTION = "libs"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/libd/${PN}/${PN}_${PV}-osso8.tar.gz \
           file://libdb1/makefile.patch;patch=1;pnum=0 "


S = "${WORKDIR}/${PN}-${PV}/PORT/linux"


do_compile() {
	oe_runmake PREFIX=${prefix} libdir=${libdir} includedir=${includedir} D=${D} 
}


do_install() {
	oe_runmake PREFIX=${prefix}  libdir=${libdir} includedir=${includedir} D=${D} DESTDIR=${D} install
}

#FIXME Check if there is a better way to do this
do_stage(){
    install -d ${STAGING_INCDIR}/db 
	install    -m 644 libdb.a ${STAGING_LIBDIR}
	install    -m 644 libdb.so.1.85.4 ${STAGING_LIBDIR}
    ln -s ${STAGING_LIBDIR}/libdb.so.1.85.4 ${STAGING_LIBDIR}/libdb1.so 
    install -m 644 include/mpool.h ${STAGING_INCDIR}/db/mpool.h
	install -m 644 include/db.h ${STAGING_INCDIR}/db/db.h
}

