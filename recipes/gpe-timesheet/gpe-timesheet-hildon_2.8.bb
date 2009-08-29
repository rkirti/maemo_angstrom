# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildonised GPE time tracker"
SECTION = "gpe"
PRIORITY = "optional"
LICENSE = "GPL"
DEPENDS_prepend = "coreutils-native virtual/libintl intltool-native "
DEPENDS = "libtododb libgpewidget libhildon libhildonfm libosso"
RDEPENDS = "gpe-icons"
PR = "r0"

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/g/gpe-timesheet/gpe-timesheet_2.8+maemo+svn20081212-3.tar.gz "

S="${WORKDIR}/gpe-timesheet-2.8+maemo+svn20081212"

inherit autotools pkgconfig gettext


do_compile() {
	oe_runmake PREFIX=${prefix}
}

do_install() {
	oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}


FILES_${PN} += "${datadir}/gpe ${datadir}/application-registry"
