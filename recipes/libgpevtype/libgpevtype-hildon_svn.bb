# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Data interchange library for hildonised GPE"
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "libmimedir libeventdb libtododb"

SRC_URI = "svn://projects.linuxtogo.org/svn/gpe/trunk/base;module=libgpevtype;rev=9931"

inherit pkgconfig gpe autotools

EXTRA_OECONF = "--enable-hildon"

do_stage () {
        autotools_stage_all
}
