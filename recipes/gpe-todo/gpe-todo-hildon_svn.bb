# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "GPE to-do list"
SECTION = "gpe"
PRIORITY = "optional"
LICENSE = "GPL"
DEPENDS = "libtododb libgpepimc libgpewidget libhildon libhildonfm libosso gtk+ "

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=gpe-todo;rev=9931"

inherit autotools pkgconfig gtk-icon-cache

EXTRA_OECONF = "--enable-hildon"

FILES_${PN} += "${datadir}/gpe-todo/*"
