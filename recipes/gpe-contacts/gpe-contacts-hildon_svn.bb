# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildonised GPE contacts manager"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS = "libgpevtype libgpepimc libcontactsdb libgpepimc libgpewidget libmimedir libhildon libhildonfm libosso dbus"

RDEPENDS = "gpe-icons"

inherit autotools gpe

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=gpe-contacts;rev=9931"

FILES_${PN} += " ${datadir}/gpe ${datadir}/gpe-contacts"

EXTRA_OECONF += " --enable-hildon "

