# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "CyberLink for C UPnP library support"
HOMEPAGE = "unknown"
SECTION = "base"
LICENSE = "BSD"
DEPENDS = "curl libxml2"
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0alpha/free/c/${PN}/${PN}_${PV}.orig.tar.gz \
           file://${PN}-${PV}/mer-changes.patch;patch=1;pnum=0 \
           file://no-doxygen.patch;patch=1"

S = "${WORKDIR}/${PN}"

inherit autotools pkgconfig

do_stage(){
    autotools_stage_all
}

FILES_${PN}-dbg += "${datadir}/doc/clinkc-2.0-0/samples/.debug"
