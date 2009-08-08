# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Extra support for osso-gnome-vfs in form of an OBEX GnomeVFS module & small library to retrieve the capabilities object from a remote devices."
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "glib-2.0 libopenobex1 osso-gwobex osso-gnome-vfs2 dbus-glib osso-gwconnect expat"
PR = "r3"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/o/${PN}/${PN}_${PV}-3.tar.gz \
           file://osso-gnomevfs-extra/mer-changes.patch;patch=1 "


require  osso-gnome-vfs2.inc

FILES_${PN} += "${libdir}/gnome-vfs-2.0/modules/*"
