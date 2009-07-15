# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Backend to flash based hildon home applet"
HOMEPAGE = "unknown"
LICENSE = "GPLv2"
SECTION = "misc"
DEPENDS = "libxml2"
PR = "r6"


#FIXME: Get a proper SRC_URI for this
SRC_URI = " http://ftp.grokthis.net/mirrors/ubuntu/pool/universe/m/mobile-application-service/mobile-application-service_0.9-6.tar.gz \
            file://mas/dont-forget-string-header.patch;patch=1"

inherit autotools pkgconfig 

do_stage(){
    autotools_stage_all
}

PACKAGES= "${PN} ${PN}-doc"

FILES_${PN} = "${sbindir} \
               ${libdir}/"


