# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "GPE file manager- hildonised version"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS = "libgpewidget gnome-vfs dbus-glib"
RDEPENDS = "gpe-icons"
RRECOMMENDS = "gnome-vfs-plugin-file gnome-vfs-plugin-smb gnome-vfs-plugin-ftp gnome-vfs-plugin-computer gnome-vfs-plugin-network gnome-vfs-plugin-sftp gnome-vfs-plugin-http"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=gpe-filemanager;rev=9931"

inherit autotools gtk-icon-cache

EXTRA_OECONF += " --enable-hildon"

FILES_${PN} += " ${datadir}/gpe \
                 ${datadir}/dbus-1"
