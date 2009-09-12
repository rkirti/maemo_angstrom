# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Email client for platforms with modest resources"
HOMEPAGE = "http://modest.garage.maemo.org"
SECTION = "mail"
LICENSE = "Nokia copyright"
DEPENDS = "gnome-common gtkhtml3.14 libconic libhildon dbus dbus-glib osso-af-settings hildon-notify gconf glib-2.0 osso-gnome-vfs2 libhildonmime libtinymail alarmd libnotify mce-dev maemo-launcher"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/m/${PN}/${PN}_${PV}-2008.43-1.tar.gz \
           file://modest-1.0/look-for-correct-gtkhtml.patch;patch=1 \
           file://modest-1.0/tinymail-api-changes.patch;patch=1 \
           file://modest-1.0/dont-forget-header.patch;patch=1 "

S = "${WORKDIR}/modest-1.0-2008.43"

inherit autotools pkgconfig gtk-icon-cache

do_stage(){
    autotools_stage_all
}

FILES_${PN} += "${datadir}/dbus-1/*"
