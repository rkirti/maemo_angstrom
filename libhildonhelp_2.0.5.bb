# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hildon HelpLib for application developers"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "misc"
DEPENDS = "gtk+ libosso libhildon gtkhtml3.14 libxml2"
PR = "r0"

SRC_URI = "http://ftp.debian.org/pool/main/libh/${PN}/${PN}_${PV}.orig.tar.gz \
           file://libhildonhelp/plus-sign.patch;patch=1;pnum=0  "

inherit autotools pkgconfig

do_configure_prepend(){
    touch gtk-doc.make
}    

do_stage(){
    autotools_stage_all
}
