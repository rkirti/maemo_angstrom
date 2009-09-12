# Copyright (C) 2009 Kirtika B Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Headers needed for libconic"
HOMEPAGE = "http://maemo.org"
SECTION = "base"
LICENSE = "GNU Lesser General Public License-version 2.1 "
DEPENDS = "dbus gconf"
PR = "r1"

SRC_URI = "http://repository.maemo.org/pool/diablo/free/i/${PN}-dev/${PN}-dev_${PV}.tar.gz"

S = "${WORKDIR}/${PN}-dev-${PV}"

inherit autotools pkgconfig

do_configure_prepend() {
 #Horrible hack follows. The dpkg-parsechangelog
  #command in the first line used in AC_INIT breaks thing
  #so do a manual replacement of that line
  sed -i '1,2d' configure.ac
  sed -i '1i AC_INIT([${PN}],[${PV}])' configure.ac
}
do_stage(){
    autotools_stage_all
}
