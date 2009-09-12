# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Public language files for hildon-libs."
HOMEPAGE = "http://maemo.org"
SECTION = "misc"
LICENSE = "unknown"
DEPENDS = "gettext-native"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/h/${PN}/${PN}_${PV}+r6710+0m5.tar.gz"

S = "${WORKDIR}/${PN}-${PV}+r6710+0m5"

require hildon-l10n.inc

TEXT_DOMAIN = "hildon-libs"
