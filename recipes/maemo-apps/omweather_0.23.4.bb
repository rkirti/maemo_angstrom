# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "World Weather on Nokia 770/N800/N810. This applet uses weather.com"
HOMEPAGE = "https://garage.maemo.org/projects/omweather/ "
LICENSE = "GPL"
SECTION = "apps"
#liblocation dep removed for the meanwhile
DEPENDS = "libxml2 curl pango osso-gnome-vfs2 gtk+ libosso libconic libxcomposite libxdamage sqlite3 hildon-desktop"
PR = "r0"

SRC_URI = "http://repository.maemo.org/extras-devel/pool/fremantle/free/source/o/${PN}/${PN}_${PV}.tar.gz"

inherit autotools pkgconfig gtk-icon-cache

FILES_${PN}-doc += "${datadir}/osso-help"
FILES_${PN}     += "${datadir}/dbus-1 \
                    ${libdir}/hildon-desktop/*"

do_stage(){
    autotools_stage_all
}

