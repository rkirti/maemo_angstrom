# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildonised GPE contacts manager"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS = "libgpevtype libgpepimc libcontactsdb libgpepimc libgpewidget libmimedir libhildon libhildonfm libosso dbus"

RDEPENDS = "gpe-icons"

inherit autotools gpe

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/g/gpe-contacts/gpe-contacts_2.8+maemo+svn20081212-3.tar.gz"

S="${WORKDIR}/gpe-contacts-2.8+maemo+svn20081212"

FILES_${PN} += " ${datadir}/gpe ${datadir}/gpe-contacts"



