# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Cron like daemon functionality"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "base"
DEPENDS = "dbus dbus-glib glib-2.0 libconic osso-systemui-dbus-dev dsme mce-dev "
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/a/${PN}/${PN}_${PV}.tar.gz  \
           file://alarmd-patches/mer-changes.patch;patch=1"


inherit autotools pkgconfig

PARALLEL_MAKE = ""
EXTRA_OEMAKE = "LIBTOOL=arm-${DISTRO}-linux-gnueabi-libtool"




do_configure_prepend(){
    for i in `grep -l -r Werror *`;
        do sed -i s:-Werror::g $i;
    done
}


# FIXME Ugly hack follows
# Need to know why that file is created with
# 0 value for permisions
do_install_prepend(){
    chmod --recursive 777 ${S}/.pc
}



do_install(){
    install -d ${D}${bindir} ${D}${libdir} ${D}${includedir}  ${D}${libdir}/alarmd
    install -m 0755 ${S}/.libs/alarmd ${D}${bindir}
    install -m 0755 ${S}/.libs/alarmtool ${D}${bindir}
    install -m 0755 ${S}/.libs/apitest ${D}${bindir}
    install -m 0755 ${S}/.libs/dbustest ${D}${bindir}
    oe_libinstall -so libalarm ${D}${libdir}
    oe_libinstall -so libretu ${D}${libdir}/alarmd
    oe_libinstall -so libgtimeout ${D}${libdir}/alarmd
    install -m 0644 ${S}/include/*.h ${D}${includedir}
}

do_stage(){
    install -d ${STAGING_INCDIR} ${STAGING_LIBDIR}   
    oe_libinstall -so libalarm    ${STAGING_LIBDIR}
    oe_libinstall -so libretu     ${STAGING_LIBDIR}
    oe_libinstall -so libgtimeout ${STAGING_LIBDIR}
    install -m 0644 ${S}/include/*.h ${STAGING_INCDIR}
}

PACKAGES += " alarmtool libalarm0"

#Keeping in tune with Maemo packaging
FILES_${PN} += "${libdir}/libretu.so \ 
                ${libdir}/libgtimeout.so"
FILES_alarmtool = "${bindir}/alarmtool"

FILES_libalarm  = "${libdir}/libalarm.so.*"


