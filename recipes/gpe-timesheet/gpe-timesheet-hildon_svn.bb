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

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=gpe-timesheet;rev=9931"

inherit autotools pkgconfig gettext

EXTRA_OECONF += " --enable-hildon "

do_compile() {
        oe_runmake PREFIX=${prefix}
}
do_install() {
        oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}

FILES_${PN} += "${datadir}/gpe ${datadir}/application-registry"
