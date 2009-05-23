# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Nokia internet connectivity library"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "base"
DEPENDS = "dbus gconf icd2-osso-ic"
PR = "r3"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/libc/${PN}/${PN}_${PV}.tar.gz"

inherit autotools pkgconfig

do_configure_prepend(){
    #Remove all Werror flags
    sed -i s:-Werror::g configure.ac
    sed -i s:-Werror::g tests/Makefile.am
       
    #Horrible hack follows. The dpkg-parsechangelog
    #command in the first line used in AC_INIT breaks thing
    #so do a manual replacement of that line
    sed -i '1,2d' configure.ac
    sed -i '1i AC_INIT([${PN}],[${PV}])' configure.ac

}

do_stage() {
	autotools_stage_all
}

