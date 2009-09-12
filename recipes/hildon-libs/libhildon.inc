DESCRIPTION = "Hildon widget library"
LICENSE = "GNU Lesser General Public License-version 2.1"
DEPENDS = "gconf-dbus esound gtk+"

inherit autotools pkgconfig lib_package

EXTRA_OECONF = "--with-maemo-gtk=yes --disable-gtk-doc"

do_stage() {
        autotools_stage_all
}
