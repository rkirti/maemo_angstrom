# Copyright (C) 2009 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Nokia Hildon mime library"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "GNU Lesser General Public License-version 2.1"
DEPENDS = "libosso gnome-vfs"
PR = "r1"

SRC_URI = " http://repository.maemo.org/pool/maemo5.0beta/free/libh/${PN}/${PN}_${PV}-1+0m5.tar.gz \
             file://libhildonmime/mer-changes.patch;patch=1 "

inherit autotools pkgconfig lib_package

EXTRA_OECONF += "--with-compile-warnings=no"

do_configure_prepend() {
        # remove Werror from OSSO_CFLAGS
        sed -i s:-Werror::g configure.in
}
do_stage() {
        autotools_stage_all
}
