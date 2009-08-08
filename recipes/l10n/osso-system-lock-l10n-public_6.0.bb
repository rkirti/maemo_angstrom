# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Public Language Files for osso-system-lock"
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "misc"
DEPENDS = "gettext-native"

PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/o/${PN}/${PN}_${PV}+r6710+0m5.tar.gz "

S="${WORKDIR}/${PN}-${PV}+r6710+0m5"
TEXT_DOMAIN = "osso-system-lock"

require hildon-l10n.inc


