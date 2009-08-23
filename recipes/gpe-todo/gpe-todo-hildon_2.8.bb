# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPL"
DESCRIPTION = "GPE to-do list"
DEPENDS = "libtododb libgpepimc libgpewidget libhildon libhildonfm libosso gtk+ "
 
SECTION = "gpe"
PRIORITY = "optional"


inherit autotools pkgconfig gtk-icon-cache

SRC_URI="http://repository.maemo.org/extras-devel/pool/diablo/free/source/g/gpe-todo/gpe-todo_2.8+maemo+svn20081212-3.tar.gz"

S = "${WORKDIR}/gpe-todo-2.8+maemo+svn20081212"

FILES_${PN} += "${datadir}/gpe-todo/*"
