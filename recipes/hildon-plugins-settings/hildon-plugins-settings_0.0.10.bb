# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Applets to control the hildon desktop plugins"
HOMEPAGE = "http://maemo.org"
SECTION = "x11"
LICENSE = "GNU Lesser General Public License-version 2.1"
DEPENDS = "libosso osso-af-settings hildon-control-panel hildon-desktop libhildon dbus-glib libhildonhelp"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/h/${PN}/${PN}_${PV}-1.tar.gz  \
           file://hildon-plugins-settings/mer-changes.patch;patch=1"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}

FILES_${PN} += "/usr/lib/hildon-control-panel/*"

# A test workaround to fix the "No GNU_HASH"
# in elf binary issue
TARGET_CC_ARCH += "${LDFLAGS}"
