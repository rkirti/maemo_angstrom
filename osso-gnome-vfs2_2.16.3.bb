# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Patched version of gnome-vfs"
HOMEPAGE = "gnome.org"
LICENSE = "GPL"
SECTION = "base"
PR = "r2"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/o/${PN}/${PN}_${PV}-2osso3+0m5.tar.gz \
           file://osso-gnome-vfs2/mer-changes.patch;patch=1 \
           file://osso-gnome-vfs2/no-g-gnuc-function.patch;patch=1;pnum=0 "


require  osso-gnome-vfs2.inc

FILES_${PN} += "/usr/lib/gnome-vfs-2.0/include/* \
                /usr/share/dbus-1/services/gnome-vfs-daemon.service \
                /usr/lib/gnome-vfs-2.0/modules/* "

