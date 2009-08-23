# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildonised GPE calendar"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS_prepend = "coreutils-native virtual/libintl intltool-native "
DEPENDS = "libsoundgen libmimedir libgpevtype  libeventdb libgpepimc libgpewidget libtododb libxsettings-client libhandoff libsoup gnutls libgcrypt libhildon libhildonfm libosso"

RDEPENDS = "gpe-icons"
PR="r2"
inherit autotools gtk-icon-cache

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/g/gpe-calendar/gpe-calendar_2.8+maemo+svn20081212-3.tar.gz"
S = "${WORKDIR}/gpe-calendar-2.8+maemo+svn20081212"


do_compile() {
	oe_runmake PREFIX=${prefix}
}

do_install() {
	oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}


FILES_${PN} += "${datadir}/gpe ${datadir}/application-registry"
