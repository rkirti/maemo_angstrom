# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Free implementation of the object exchange library"
HOMEPAGE = "www.openobex.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "bluez4 bluez-libs obexd bluez-hcidump bluez-dtl1-workaround" 
PR = "r3"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/libo/${PN}/${PN}_${PV}osso5.tar.gz"

S = "${WORKDIR}/${PN}-${PV}osso5"

inherit autotools pkgconfig

# Temporary fix to stop it from checking the system
# files instead of staging
EXTRA_OECONF +=" --disable-usb" 

do_stage(){
    autotools_stage_all
}
