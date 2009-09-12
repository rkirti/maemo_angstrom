# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Database access for hildonised GPE to-do list"
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "libgpewidget libgpepimc sqlite"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=libtododb;rev=9931"

inherit pkgconfig gettext autotools

EXTRA_OECONF += " --enable-hildon"

do_compile() {
        oe_runmake PREFIX=${prefix}
}
do_install () {
        oe_runmake PREFIX=${prefix} DESTDIR=${D} install
}
do_stage () {
        oe_libinstall -so libtododb ${STAGING_LIBDIR}
        mkdir -p ${STAGING_INCDIR}/gpe
        for h in ${headers}; do
                install -m 0644 ${S}/gpe/$h ${STAGING_INCDIR}/gpe/$h
        done
}

headers = "todo-db.h"
