# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Maemo launcher for any GTK+ app."
HOMEPAGE = "http://maemo.org"
SECTION = "apps"
LICENSE = "GPL"
DEPENDS = " gtk+ fontconfig pango dbus gtkhtml3.14 clinkc libosso osso-gnome-vfs2 libhildonmime libhildonhelp libhildonfm hildon-desktop libhildon"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0prealpha1/free/m/${PN}/${PN}_${PV}.orig.tar.gz \
           file://${PN}-${PV}/mer-changes.patch;patch=1 "

inherit autotools pkgconfig
