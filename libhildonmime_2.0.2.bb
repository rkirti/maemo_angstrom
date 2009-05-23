# Copyright (C) 2009 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Nokia Hildon mime library"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "base"
DEPENDS = "libosso gnome-vfs"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/libh/${PN}/${PN}_${PV}-1.tar.gz"

EXTRA_OECONF += "--with-compile-warnings=no"

inherit autotools pkgconfig lib_package

do_configure_prepend() {
	# remove Werror from OSSO_CFLAGS
	sed -i s:-Werror::g configure.in
}

do_stage() {
	autotools_stage_all
}







