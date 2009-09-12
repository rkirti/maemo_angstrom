# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "GnomeVFS filechooser backend for GTK+"
HOMEPAGE = "unknown"
SECTION = "base"
LICENSE = "GNU Lesser General Public License-version 2.0"
DEPENDS = "glib-2.0 osso-gnome-vfs2 gtk+"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/g/${PN}/${PN}_${PV}-1+0m5.tar.gz \
           file://gvfsfilechooser/mer-changes.patch;patch=1"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}

FILES_${PN} += " /usr/lib/gtk-2.0/2.10.0/filesystems/* "
