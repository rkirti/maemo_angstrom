# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "OBEX Server and Client"
LICENSE = "GPLv2"
DEPENDS = "openobex glib-2.0 dbus bluez4"

SRC_URI = "http://www.kernel.org/pub/linux/bluetooth/obexd-${PV}.tar.gz \
           file://obexd/maemo-changes.patch;patch=1"

inherit autotools_stage

FILES_${PN} += "${datadir}/dbus-1/"
