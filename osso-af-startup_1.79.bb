# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Application framework startup scripts, services and base-apps"
HOMEPAGE = "http://maemo.org"
LICENSE = "GPLv2"
SECTION = "base"
DEPENDS = "osso-af-utils  osso-core-config dbus"

PR = "r2"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/o/${PN}/${PN}_${PV}-2+0m5.tar.gz"

inherit pkgconfig 


do_install () {
    install -m 0755 -d ${D}${sysconfdir}/osso-af-init ${D}${sysconfdir}/init.d ${D}${sysconfdir}/sudoers.d
    install -m 0755 ${S}/top-scripts/* ${D}${sysconfdir}/init.d/
    install -m 0755 ${S}/services/* ${D}${sysconfdir}/osso-af-init/
    install -m 0644 ${S}/osso-af-startup.sudoers ${D}${sysconfdir}/sudoers.d/osso-af-startup.sudoers
}

PACKAGES = "${PN}"

FILES_${PN} = "/etc/osso-af-init/* \
               /etc/sudoers.d/*    \
               /etc/init.d/* " 
