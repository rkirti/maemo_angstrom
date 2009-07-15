# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Public Language Files for osso-applet-tasknavigator"
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "misc"
DEPENDS = "gettext-native"

PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/o/${PN}/${PN}_${PV}+r5892.tar.gz "

S="${WORKDIR}/${PN}-${PV}+r5892"
TEXT_DOMAIN = "osso-applet-tasknavigator"

require hildon-l10n.inc

