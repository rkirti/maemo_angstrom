# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Assortment of small programs for the application framework"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"

DEPENDS = "libx11 libdbus-1 libosso libxsp libpng12 libgtk2.0 x11proto-core x11proto-input libxi libgconf2 osso-esd libjpeg62" 
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/o/${PN}/${PN}_${PV}-1.tar.gz"

require osso.inc


