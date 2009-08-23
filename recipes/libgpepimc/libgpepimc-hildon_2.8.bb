LICENSE     = "LGPL"
PR          = "r0"
DESCRIPTION = "Common code for GPE PIMs (hildon UI version)"
SECTION = "gpe/libs"
PRIORITY    = "optional"
DEPENDS     = "libgpewidget-hildon gtk+ sqlite"
PROVIDES    = "libgepepimc"
RPROVIDES   = "libgepepimc"

SRC_URI     = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/libg/libgpepimc/libgpepimc_2.8+maemo+svn20081212-3.tar.gz"

EXTRA_OECONF = "--enable-hildon"
S = "${WORKDIR}/libgpepimc-2.8+maemo+svn20081212"

inherit pkgconfig autotools

headers = "pim-categories.h pim-categories-ui.h"

do_stage () {
	oe_libinstall -so libgpepimc ${STAGING_LIBDIR}

	mkdir -p ${STAGING_INCDIR}/gpe
	for h in ${headers}; do
		install -m 0644 ${S}/gpe/$h ${STAGING_INCDIR}/gpe/$h
	done
}

