# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Assortment of small programs for the application framework"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "libx11 dbus libosso libxsp libpng12 libgtk2.0 x11proto-core x11proto-input libxi libgconf2 esound libjpeg62 libcanberra" 

PR = "r3"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/o/${PN}/${PN}_${PV}-3+0m5.tar.gz \
           file://osso-af-utils/mer-changes.patch;patch=1"

require osso.inc

inherit autotools pkgconfig gtk-icon-cache

FILES_${PN} += "${datadir}/icons/"


