# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "X11 Xomap custom library."
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "unknown"
DEPENDS = "x11proto-xsp quilt libx11 libxext"
PR = "r4"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/libx/${PN}/${PN}_${PV}-4.1.tar.gz"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}
