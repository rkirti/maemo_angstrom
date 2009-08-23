# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE     = "LGPL"
PR          = "r0"
DESCRIPTION = "libgpewidget contains a collection of widgets and other common code shared by many GPE applications."
SECTION = "gpe/libs"
PRIORITY    = "optional"
DEPENDS     = "gtk+ libxrender gtk-doc intltool-native sdk-default-icons hildon-icons"
PROVIDES    = "libgpewidget"


inherit autotools pkgconfig gtk-icon-cache

SRC_URI     = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/libg/libgpewidget/libgpewidget_2.8+maemo+svn20081212-3.tar.gz" 

S = "${WORKDIR}/libgpewidget-2.8+maemo+svn20081212"

EXTRA_OECONF = "--enable-hildon"

do_stage () {
	oe_libinstall -C .libs -so libgpewidget ${STAGING_LIBDIR}
	autotools_stage_includes
}

RDEPENDS = "sdk-default-icons"
RPROVIDES = "libgpewidget"

FILES_${PN} += "${datadir}/libgpewidget/*"
