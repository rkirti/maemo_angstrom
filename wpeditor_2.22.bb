# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "WordPad text editor library"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1 "
SECTION = "libs"
DEPENDS = "gtk+ glib-2.0"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/w/${PN}/${PN}_${PV}-0+0m5.tar.gz "

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}
