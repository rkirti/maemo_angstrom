require gtk+.inc
# disable per default - this uses as little patches as possible
DEFAULT_PREFERENCE = "-10" 




PR = "r5"

DEPENDS += "cairo jasper"

SRC_URI = "http://download.gnome.org/sources/gtk+/2.14/gtk+-${PV}.tar.bz2 \
           file://xsettings.patch;patch=1 \
           file://run-iconcache.patch;patch=1 \
           file://hardcoded_libtool.patch;patch=1 \
           file://no-demos.patch;patch=1 \
           file://toggle-font.diff;patch=1;pnum=0 \
           file://smallscreen_filechooser.patch;patch=1 \
          "

EXTRA_OECONF = "--with-libtiff --disable-xkb --disable-glibtest --enable-display-migration gio_can_sniff=yes"

LIBV = "2.10.0"

PACKAGES_DYNAMIC = "gtk-module-* gdk-pixbuf-loader-* gtk-immodule-* gtk-printbackend-*"

python populate_packages_prepend () {
	import os.path

	prologue = bb.data.getVar("postinst_prologue", d, 1)

	gtk_libdir = bb.data.expand('${libdir}/gtk-2.0/${LIBV}', d)
	loaders_root = os.path.join(gtk_libdir, 'loaders')
	immodules_root = os.path.join(gtk_libdir, 'immodules')
	printmodules_root = os.path.join(gtk_libdir, 'printbackends');
	modules_root = bb.data.expand('${libdir}/gtk-2.0/modules/',d)

	do_split_packages(d, loaders_root, '^libpixbufloader-(.*)\.so$', 'gdk-pixbuf-loader-%s', 'GDK pixbuf loader for %s', prologue + 'gdk-pixbuf-query-loaders > /etc/gtk-2.0/gdk-pixbuf.loaders', extra_depends='')
	do_split_packages(d, immodules_root, '^im-(.*)\.so$', 'gtk-immodule-%s', 'GTK input module for %s', prologue + 'gtk-query-immodules-2.0 > /etc/gtk-2.0/gtk.immodules', extra_depends='')
	do_split_packages(d, printmodules_root, '^libprintbackend-(.*)\.so$', 'gtk-printbackend-%s', 'GTK printbackend module for %s', extra_depends='')
	do_split_packages(d, modules_root, '^lib(.*)\.so$', 'gtk-module-%s', 'GTK module for %s', extra_depends='')

        if (bb.data.getVar('DEBIAN_NAMES', d, 1)):
                bb.data.setVar('PKG_${PN}', 'libgtk-2.0', d)
}


do_stage_append() {
 
 	# this tool is required by gnome-keyring 2.26.0 to get built
 	# it is written in Python and use only Python xml
 	install -d ${STAGING_BINDIR_NATIVE}
 	install -m 0755 ${S}/gtk/gtk-builder-convert ${STAGING_BINDIR_NATIVE}
 
}

# gail is part of gtk+ since gtk+-2.13.0 (targetting >=GNOME 2.23):
PROVIDES = "virtual/gail"
RPROVIDES_${PN} = "libgailutil18"
RCONFLICTS_${PN} = "libgailutil18"
RREPLACES_${PN} = "libgailutil18"
RPROVIDES_${PN}-dev = "libgailutil-dev"
RCONFLICTS_${PN}-dev = "libgailutil-dev"
RREPLACES_${PN}-dev = "libgailutil-dev"
RPROVIDES_${PN}-doc = "libgailutil-doc"
RCONFLICTS_${PN}-doc = "libgailutil-doc"
RREPLACES_${PN}-doc = "libgailutil-doc"
RPROVIDES_${PN}-dbg = "libgailutil-dbg"
RCONFLICTS_${PN}-dbg = "libgailutil-dbg"
RREPLACES_${PN}-dbg = "libgailutil-dbg"
# FIXME: replace locales as well
