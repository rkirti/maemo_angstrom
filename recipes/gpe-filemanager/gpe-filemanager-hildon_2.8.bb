# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPE file manager- hildonised version"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS = "libgpewidget gnome-vfs dbus-glib"
RDEPENDS = "gpe-icons"
RRECOMMENDS = "gnome-vfs-plugin-file gnome-vfs-plugin-smb gnome-vfs-plugin-ftp gnome-vfs-plugin-computer gnome-vfs-plugin-network gnome-vfs-plugin-sftp gnome-vfs-plugin-http"

inherit autotools gtk-icon-cache

S="${WORKDIR}/gpe-filemanager-2.8+maemo+svn20081212"

EXTRA_OECONF += " --enable-hildon"


SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/g/gpe-filemanager/gpe-filemanager_2.8+maemo+svn20081212-3.tar.gz "


FILES_${PN} += " ${datadir}/gpe \
                 ${datadir}/dbus-1"
