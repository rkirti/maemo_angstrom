# Copyright (C) 2009 Kirtika B Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Nokia OSSO connectivity library & Bluetooth connectivity applications"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "GPL"
DEPENDS = "libosso libhildon bluez-libs"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/o/${PN}/${PN}_${PV}.tar.gz"

inherit autotools pkgconfig

do_configure_prepend() {
        # remove Werror from OSSO_CFLAGS
        sed -i s:-Werror::g configure.ac
}

do_stage() {
        autotools_stage_all
}
