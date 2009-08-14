# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Public language files for maemo-af-desktop"
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "misc"
DEPENDS = "gettext-native"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/m/${PN}/${PN}_${PV}+r6710+0m5.tar.gz"

S = "${WORKDIR}/${PN}-${PV}+r6710+0m5"

TEXT_DOMAIN = "maemo-af-desktop"
require hildon-l10n.inc


