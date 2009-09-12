# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Database access for hildonised GPE to-do list"
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "libgpewidget libgpepimc sqlite"

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/libt/libtododb/libtododb_2.8+maemo+svn20081212-3.tar.gz "

S = "${WORKDIR}/libtododb-2.8+maemo+svn20081212"

inherit pkgconfig gettext autotools

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
