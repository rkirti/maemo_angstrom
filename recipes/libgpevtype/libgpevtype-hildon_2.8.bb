# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Data interchange library for hildonised GPE"
SECTION = "gpe/libs"
PRIORITY = "optional"
LICENSE = "LGPL"
DEPENDS = "libmimedir libeventdb libtododb"

inherit pkgconfig gpe autotools

SRC_URI = "http://repository.maemo.org/extras-devel/pool/diablo/free/source/libg/libgpevtype/libgpevtype_2.8+maemo+svn20081212-3.tar.gz"

S = "${WORKDIR}/libgpevtype-2.8+maemo+svn20081212"

do_stage () {
	autotools_stage_all
}


