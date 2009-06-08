# Recipe taken from the Poky experimental meta-maemo set

DESCRIPTION = "Development Files for system UI"
HOMEPAGE = "http://maemo.org"
LICENSE = "GNU Lesser General Public License-version 2.1"
SECTION = "base"
#No dependencies
DEPENDS = ""
PR = "r0"

SRC_URI = "http://repository.maemo.org/pool/fremantle/free/o/${PN}/${PN}_${PV}.tar.gz \
           file://osso-systemui-dbus-dev/no-doxygen.patch;patch=1"

inherit pkgconfig


do_stage() {
    install -d ${STAGING_INCDIR}/systemui
    install -m 0644 ${S}/include/systemui/*.h ${STAGING_INCDIR}/systemui/
}

