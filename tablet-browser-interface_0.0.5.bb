# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Dev package for browser services"
HOMEPAGE = "http://maemo.org"
LICENSE = "Mozilla Public License"
SECTION = "base"
PR = "r4"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/t/${PN}/${PN}_${PV}-4.tar.gz"

inherit autotools

do_stage(){
    autotools_stage_all
}
