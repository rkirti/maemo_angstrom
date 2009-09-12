# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Hildonised GPE calendar"
SECTION = "gpe"
LICENSE = "GPL"
DEPENDS_prepend = "coreutils-native virtual/libintl intltool-native "
DEPENDS = "libsoundgen libmimedir libgpevtype  libeventdb libgpepimc libgpewidget libtododb libxsettings-client libhandoff libsoup gnutls libgcrypt libhildon libhildonfm libosso"
RDEPENDS = "gpe-icons"
PR = "r2"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=gpe-calendar;rev=9931"

inherit autotools gtk-icon-cache

do_compile() {
        oe_runmake PREFIX=${prefix}
}
do_install() {
        oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}

FILES_${PN} += "${datadir}/gpe ${datadir}/application-registry"
