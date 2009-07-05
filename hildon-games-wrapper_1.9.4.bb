# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Wrappers for D-BUS and other libraries for games"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1 "
SECTION = "misc"
DEPENDS = "dbus gconf"
PR = "r3"

SRC_URI = " http://repository.maemo.org/pool/fremantle/free/h/${PN}/${PN}_${PV}-3+0m5.tar.gz  \
            file://hildon-games-wrapper/mer-changes.patch;patch=1"

# A test workaround to fix the "No GNU_HASH"
# in elf binary issue            
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	oe_runmake PREFIX=${prefix}
}

do_install() {
	oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}


FILES_${PN} += "/usr/games/wrapper/*"
