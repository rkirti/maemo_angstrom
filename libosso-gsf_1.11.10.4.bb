# Copyright (C) 2009 Kirtika B Ruchandani <kirtibr@gmail.com> 
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Patched version of libgsf"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "glib-2.0 zlib"
PR = "r0"


SRC_URI = "http://repository.maemo.org/pool/diablo/free/libo/${PN}/${PN}_${PV}-1.tar.gz"

inherit autotools pkgconfig

do_configure(){
    oe_runconf
}

do_stage() {
	autotools_stage_all
}


