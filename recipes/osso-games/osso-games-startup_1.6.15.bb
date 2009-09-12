# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Startup Screen for osso-games"
HOMEPAGE = "http://maemo.org "
SECTION = "apps"
LICENSE = "unknown"
DEPENDS = "libhildon gtk+ osso-gnome-vfs2 glib-2.0 dbus-glib libosso gconf libhildonfm libhildonmime maemo-launcher"
PR = "r2"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/o/${PN}/${PN}_${PV}-2+0m5.tar.gz"

inherit autotools pkgconfig

do_configure_prepend(){
    for i in `grep -r -l Werror *`;
    do sed -i s:-Werror::g $i;done
    touch gtk-doc.make
}
do_stage(){
autotools_stage_all
}
