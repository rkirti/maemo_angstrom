# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Screenshot tool"
HOMEPAGE = "http://maemo.org"
SECTION = "apps/graphics"
LICENSE = "GPL"
DEPENDS = "gtk+"
PR = "r2"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/s/${PN}/${PN}_${PV}-2.tar.gz"

inherit autotools

do_install(){
    install -m755 -d ${D}${bindir}
    install -m755 screenshot-tool ${D}${bindir}/
}
