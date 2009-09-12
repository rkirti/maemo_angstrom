# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Desktop env. based on the GNOME platform"
HOMEPAGE = "http://maemo.org"
SECTION = "x11"
LICENSE = "GNU Lesser General Public License-version 2.1"
DEPENDS = " libhildon libosso osso-gnome-vfs2 osso-af-settings libhildonfm libhildonhelp libxtst libxi libxml2 esound libxdamage sqlite3 mce-dev"
PR = "r1"

##Temporary: to be fixed later
SRC_URI = "file://hd-trial.tar.gz"

S = "${WORKDIR}/hd-ins_in_usr"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-debug=no --disable-gtk-doc"

do_install_append(){
    install -d ${D}${datadir}/applications ${D}${datadir}/applications/hildon-marquee
    install -m 0644 ${S}/data/*.desktop  ${D}${datadir}/applications/hildon-marquee
}
do_stage(){
    autotools_stage_all
}

FILES_${PN} += "${datadir}/applications/hildon-marquee/* \
                ${datadir}/* "
FILES_${PN}-dbg += "${libdir}/hildon-desktop/policies/.debug"
