# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Desktop env. based on the GNOME platform"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "x11"
DEPENDS = " libhildon libosso osso-gnome-vfs2 osso-af-settings libhildonfm libhildonhelp libxtst libxi libxml2 esound libxdamage sqlite3 mce-dev"
PR = "r1"

##Temporary: to be fixed later
SRC_URI = "file://hd-trial.tar.gz"

EXTRA_OECONF = "--enable-debug=no --disable-gtk-doc"

S = "${WORKDIR}/hd-ins_in_usr"

inherit autotools pkgconfig

FILES_${PN} += "${datadir}/applications/hildon-marquee/* \ 
                ${datadir}/* "

FILES_${PN}-dbg += "${libdir}/hildon-desktop/policies/.debug"

do_install_append(){
    install -d ${D}${datadir}/applications ${D}${datadir}/applications/hildon-marquee
    install -m 0644 ${S}/data/*.desktop  ${D}${datadir}/applications/hildon-marquee
}




do_stage(){
    autotools_stage_all
}

# Avoid rm_work for the meanwhile
# to check image contents 
do_rm_work(){
    :
}
