# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Maemo launcher for any GTK+ app."
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "apps"
DEPENDS = " gtk+2.0 fontconfig pango dbus gtkhtml3.14-dev clinkc-dev libosso libosso-gnomevfs2 libhildonmime libhildonhelp-dev libhildonfm2 libhildondesktop libhildon1"
PR = "r0"


SRC_URI = "http://repository.maemo.org/pool/maemo5.0prealpha1/free/m/${PN}/${PN}_${PV}.orig.tar.gz \
           file://maemo-launcher/mer-changes.patch;patch=1 "


inherit autotools pkgconfig

