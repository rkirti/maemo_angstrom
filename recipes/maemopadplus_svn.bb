# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Tree-based note/sketch/checklist application"
HOMEPAGE = "https://garage.maemo.org/projects/maemopadplus/"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "misc"
DEPENDS = "libhildon libhildonfm gtk+ osso-gnome-vfs2 glib-2.0 dbus-glib libosso sqlite3 wpeditor tablet-browser-interface"
PR="r95"
SRC_URI = " svn://garage.maemo.org/svn/maemopadplus;module=trunk;rev=95;proto=https"

S="${WORKDIR}/trunk/unified" 


inherit autotools pkgconfig gtk-icon-cache 

FILES_${PN} += "${datadir}/icons/hicolor/ \
                ${datadir}/dbus-1" 

