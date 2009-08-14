# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Public Language Files for osso-games"
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "misc"
DEPENDS = "gettext-native"

PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/o/${PN}/${PN}_${PV}+r6710+0m5.tar.gz "

S="${WORKDIR}/${PN}-${PV}+r6710+0m5"
TEXT_DOMAIN = "osso-games"

require hildon-l10n.inc

