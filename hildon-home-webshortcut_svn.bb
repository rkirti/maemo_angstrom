# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Webshortcut plugin for hildon home"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "x11"
DEPENDS = "libhildon libosso libconic libhildonfm hildon-desktop osso-af-settings"
PR = "r3"

SRC_URI = "svn://stage.maemo.org/svn/maemo/projects/haf/trunk;module=hildon-home-webshortcut;rev=18844;proto=https"

S = "${WORKDIR}/hildon-home-webshortcut"

inherit autotools pkgconfig

do_configure_prepend(){
    for i in `grep -r -l Werror *`;
        do sed -i s:-Werror::g $i;
    done
}


FILES_${PN}  += "${libdir}/hildon-desktop/*"
