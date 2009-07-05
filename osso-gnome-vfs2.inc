# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Patched version of gnome-vfs"
HOMEPAGE = "gnome.org"
LICENSE = "GPL"
SECTION = "base"
DEPENDS = "glib-2.0 gconf libxml2 zlib gnome-common dbus-glib samba hal krb5 openssl"



inherit autotools pkgconfig

do_configure_prepend(){
    for i in `grep -r -l Werror *`;
    do sed -i s:-Werror::g $i;done
    touch gtk-doc.make     
}

do_stage(){
    autotools_stage_all
}

EXTRA_OECONF += " --disable-gtk-doc --disable-deprecated"
