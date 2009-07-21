# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Clipboard Manager"
HOMEPAGE = "http://maemo.org"
LICENSE = "unknown"
SECTION = "x11"
DEPENDS = "libx11 gconf glib-2.0 upstart"
PR = "r4"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/c/${PN}/${PN}_${PV}-4+0m5.tar.gz"

inherit autotools pkgconfig

do_install_append(){
    install -d ${D}${sysconfdir}/X11 ${D}${sysconfdir}/gconf2xsettings.d
    install -d ${D}${sysconfdir}/X11/replace/Xsession.post
    install -m 0644  ${S}/keys ${D}${sysconfdir}/gconf2xsettings.d
    install -m 0755  ${S}/debian/clipboard-manager.xsession ${D}${sysconfdir}/X11/replace/Xsession.post
}
