# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Text editor application for editing plain-text documents."
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "apps"
DEPENDS = "libhildon gtk+ osso-gnome-vfs2 glib-2.0 dbus-glib libosso libconbtui libhildonhelp libhildonfm osso-af-settings"
# This is imp. Only r3 (rev. in pre-alpha repo) works. Later ones dont build
PR = "r3"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0prealpha1/free/m/${PN}/${PN}_${PV}-3.tar.gz"

inherit autotools pkgconfig gtk-icon-cache

FILES_${PN} += "${datadir}/icons/*  \
                ${datadir}/hildon-help/* \
                ${datadir}/dbus-1/* "
