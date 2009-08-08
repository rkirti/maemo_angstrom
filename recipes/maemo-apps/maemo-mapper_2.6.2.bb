# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Maemo Mapper App for geographical mapping and driving directions"
HOMEPAGE = "https://garage.maemo.org/projects/maemo-mapper/"
LICENSE = "GPL"
SECTION = "apps"
DEPENDS = "libhildon libhildonfm libhildonhelp libosso gtk+ osso-gnome-vfs2 glib-2.0 dbus-glib  sqlite3 libconic gdbm osso-af-settings"

PR = "r0"

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/m/${PN}/${PN}_${PV}-os2008.tar.gz"

inherit autotools pkgconfig gtk-icon-cache

FILES_${PN} += "${datadir}/dbus-1/"

