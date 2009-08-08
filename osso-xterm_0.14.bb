#Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
#Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "X terminal emulator for OS-2008"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "vte dbus gconf dbus-glib glib-2.0 libhildon libosso tablet-browser-interface"
PR = "r0"
PROVIDES="osso-xterm"

SRC_URI = " http://repository.maemo.org/pool/fremantle/free/o/${PN}/${PN}_${PV}.mh22+0m5.tar.gz "

S="${WORKDIR}/${PN}-${PV}.mh22+0m5"

inherit autotools pkgconfig gtk-icon-cache

#FIXME the .service needs to be included in a better way
#Even including it so explicitly doesn't work.
FILES_{PN} +="\
              ${datadir}/icons/* \
              ${datadir}/dbus-1/services/osso-xterm.service \
              ${datadir}/dbus-1/ "

            
        
