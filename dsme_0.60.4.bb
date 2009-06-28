# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Device state management entity for service monitoring, process watchdog and inactivity tracking"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "misc"
DEPENDS = "glib-2.0 dbus dbus-glib upstart"

PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/d/${PN}/${PN}_${PV}+0m5.tar.gz  \
           file://dsme/mer-changes.patch;patch=1"

S= "${WORKDIR}/${PN}-${PV}+0m5"

inherit autotools pkgconfig

do_configure(){
    :
}

do_make(){
    oe_runmake
}


#FIXME :  Get the issue with the () flags 
#for install solved.
do_install(){
    install -d ${D}${libdir}  ${D}${includedir} ${D}${includedir}/dsme ${D}${sysconfdir}/dsme ${D}${base_sbindir} ${D}${libdir}/dsme
 
    install -m 755  ${S}/libdsme.so.0.2.0 ${D}${libdir}
    ln -sf ${D}${libdir}/libdsme.so.0.2.0 ${D}${libdir}/libdsme.so
    install -m 0755 ${S}/dsme ${D}${base_sbindir}
 
    install -m 755  ${S}/libdsme_dbus_if.so.0.2.0 ${D}${libdir}
    ln -sf ${D}${libdir}/libdsme_dbus_if.so.0.2.0 ${D}${libdir}/libdsme_dbus_if.so

    install -m 0644  ${S}/include/dsme/protocol.h ${D}${includedir}/dsme
    install -m 0644  ${S}/include/dsme/messages.h ${D}${includedir}/dsme
    install -m 0600  ${S}/lifeguard.uids ${D}${sysconfdir}/dsme
    

    install -m 0755  ${S}/util/batttest  ${D}${sbindir}
    install -m 0755  ${S}/util/dsmetool ${D}${sbindir}
    install -m 0755  ${S}/util/bootstate ${D}${sbindir}
    install -m 0755  ${S}/util/waitfordsme ${D}${sbindir}
    install -m 0755  ${S}/util/dsmetest ${D}${sbindir}
    install -m 0755  ${S}/util/kicker ${D}${sbindir}
    install -m 0755  ${S}/util/thermaltool ${D}${sbindir}
    install -m 0755  ${S}/util/dsmetool-session ${D}${sbindir}
     
    
    
    install -m 755  ${S}/modules/libstartup.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libstartup.so.0.0.0 ${D}${libdir}/dsme/libstartup.so


    install -m 644  ${S}/modules/processwd.h ${D}${includedir}/dsme 


    install -m 755  ${S}/modules/libprocesswd.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libprocesswd.so.0.0.0 ${D}${libdir}/dsme/libprocesswd.so





    install -m 755  ${S}/modules/libhwwd.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libhwwd.so.0.0.0 ${D}${libdir}/dsme/libhwwd.so




    install -m 644  ${S}/modules/state.h ${D}${includedir}/dsme 
    install -m 644  ${S}/modules/state_states.h ${D}${includedir}/dsme 
 
    install -m 755  ${S}/modules/liblifeguard.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/liblifeguard.so.0.0.0 ${D}${libdir}/dsme/liblifeguard.so

  
    install -m 755  ${S}/modules/libstate.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libstate.so.0.0.0 ${D}${libdir}/dsme/libstate.so

 
    install -m 755  ${S}/modules/librunlevel.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/librunlevel.so.0.0.0 ${D}${libdir}/dsme/librunlevel.so


    install -m 644  ${S}/modules/dsme_dbus_if.h ${D}${includedir}/dsme 

    install -m 755  ${S}/modules/libdbusproxy.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libdbusproxy.so.0.0.0 ${D}${libdir}/dsme/libdbusproxy.so

    install -m 755  ${S}/modules/libalarmtracker.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libalarmtracker.so.0.0.0 ${D}${libdir}/dsme/libalarmtracker.so

    install -m 755  ${S}/modules/libthermalmanager.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libthermalmanager.so.0.0.0 ${D}${libdir}/dsme/libthermalmanager.so


    install -m 755  ${S}/modules/libemergencycalltracker.so.0.0.0 ${D}${libdir}/dsme
    ln -sf ${D}${libdir}/dsme/libemergencycalltracker.so.0.0.0 ${D}${libdir}/dsme/libemergencycalltracker.so

 




#    oe_libinstall -so  ${S}/modules/libdbusproxy ${D}${libdir}/dsme 
#    oe_libinstall -so  ${S}/modules/libalarmtracker ${D}${libdir}/dsme 
#    oe_libinstall -so  ${S}/modules/libthermalmanager ${D}${libdir}/dsme 
#    oe_libinstall -so  ${S}/modules/libemergencycalltracker ${D}${libdir}/dsme 
    
}



do_stage(){
    autotools_stage_all
}



