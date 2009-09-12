# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "libgpewidget contains a collection of widgets and other common code shared by many GPE applications."
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "gtk+ libxrender gtk-doc intltool-native sdk-default-icons hildon-icons"
RDEPENDS = "sdk-default-icons"
PROVIDES = "libgpewidget"
RPROVIDES = "libgpewidget"
PR = "r0"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=libgpewidget;rev=9931 \
           file://pkgconfig.patch;patch=1;pnum=0"

inherit autotools pkgconfig gtk-icon-cache

EXTRA_OECONF = "--enable-hildon"

do_stage () {
        oe_libinstall -C .libs -so libgpewidget ${STAGING_LIBDIR}
        autotools_stage_includes
}

FILES_${PN} += "${datadir}/libgpewidget/*"
