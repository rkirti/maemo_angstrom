DESCRIPTION = "Common code for GPE PIMs (hildon UI version)"
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "libgpewidget-hildon gtk+ sqlite"
PROVIDES = "libgepepimc"
RPROVIDES = "libgepepimc"
PR = "r0"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=libgpepimc;rev=9931"

inherit pkgconfig autotools

EXTRA_OECONF = "--enable-hildon"

do_stage () {
        oe_libinstall -so libgpepimc ${STAGING_LIBDIR}
        mkdir -p ${STAGING_INCDIR}/gpe
        for h in ${headers}; do
                install -m 0644 ${S}/gpe/$h ${STAGING_INCDIR}/gpe/$h
        done
}

headers = "pim-categories.h pim-categories-ui.h"
