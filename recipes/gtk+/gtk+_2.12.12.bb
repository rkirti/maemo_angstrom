# 01/06/09 15:33:17  Kirtika B Ruchandani <kirtibr@gmail.com> 
# Temporary recipe for Maemo GTK for testing 
# Copied over from the 2.12.11 bb file and modified

require gtk+.inc

# Temporary addition for testing
# to get rid of the vagaries of the 
# standalone gdk-pixbuf recipe
PROVIDES = "gdk-pixbuf"
RPROVIDES = "gdk-pixbuf"

PR = "r104"

DEPENDS += "cairo"

#Maemo specific requirement
DEFAULT_PREFERENCE ="10"

S="${WORKDIR}/gtk+2.0-2.12.12"

#FIXME : Patches currently used are only to get the build working. After testing on the device,
#uncomment the required patches

SRC_URI = "http://repository.maemo.org/pool/maemo5.0alpha/free/g/gtk+2.0/gtk+2.0_${PV}-1maemo12+0m5.tar.gz \
           file://gtk+2.0-2.12.12/mer-changes.patch;patch=1 \
           file://gtk+2.0-2.12.12/mkinstalldirs \
           file://gtk+2.0-2.12.12/no-demos.patch;patch=1 \
           file://gtk+2.0-2.12.12/xsettings.patch;patch=1 \
#          file://gtk+2.0-2.12.12/run-iconcache.patch;patch=1 \
#          file://gtk+2.0-2.12.12/hardcoded_libtool.patch;patch=1 \
           file://gtk+2.0-2.12.12/cellrenderer-cairo.patch;patch=1;pnum=0 \
           file://gtk+2.0-2.12.12/png-use-old-symbol.patch;patch=1;pnum=0 \
           file://gtk+2.0-2.12.12/entry-cairo.patch;patch=1;pnum=0 "
#           file://gtk+2.0-2.12.12/toggle-font.diff;patch=1;pnum=0 \
#           file://gtk+2.0-2.12.12/scrolled-placement.patch;patch=1;pnum=0 \
# temporary
#           file://gtk+2.0-2.12.12/gtklabel-resize-patch;patch=1 \
#           file://gtk+2.0-2.12.12/menu-deactivate.patch;patch=1 \
#           file://gtk+2.0-2.12.12/combo-arrow-size.patch;patch=1;pnum=0 \
# die die die
#           file://gtk+2.0-2.12.12/pangoxft2.10.6.diff;patch=1"

EXTRA_OECONF = "--with-libtiff --with-gdktarget=x11 --disable-xkb --disable-gtk-doc --with-maemo=yes --with-libpng --with-libjpeg --with-x "


#Used for the gdk-pixbuf stuff
EXTRA_OECONF += "--with-included-loaders=png,tga --disable-gtk-doc"


LIBV = "2.10.0"

PACKAGES_DYNAMIC = "gdk-pixbuf-loader-* gtk-immodule-* gtk-printbackend-*"

do_configure_prepend(){
    touch gtk-doc.make
}

python populate_packages_prepend () {
	import os.path

	prologue = bb.data.getVar("postinst_prologue", d, 1)

	gtk_libdir = bb.data.expand('${libdir}/gtk-2.0/${LIBV}', d)
	loaders_root = os.path.join(gtk_libdir, 'loaders')
	immodules_root = os.path.join(gtk_libdir, 'immodules')
	printmodules_root = os.path.join(gtk_libdir, 'printbackends');

	do_split_packages(d, loaders_root, '^libpixbufloader-(.*)\.so$', 'gdk-pixbuf-loader-%s', 'GDK pixbuf loader for %s', prologue + 'gdk-pixbuf-query-loaders > /etc/gtk-2.0/gdk-pixbuf.loaders')
	do_split_packages(d, immodules_root, '^im-(.*)\.so$', 'gtk-immodule-%s', 'GTK input module for %s', prologue + 'gtk-query-immodules-2.0 > /etc/gtk-2.0/gtk.immodules')
	do_split_packages(d, printmodules_root, '^libprintbackend-(.*)\.so$', 'gtk-printbackend-%s', 'GTK printbackend module for %s')

        if (bb.data.getVar('DEBIAN_NAMES', d, 1)):
                bb.data.setVar('PKG_${PN}', 'libgtk-2.0', d)
}

# check for TARGET_FPU=soft and inform configure of the result so it can disable some floating points
require gtk-fpu.inc
EXTRA_OECONF += "${@get_gtk_fpu_setting(bb, d)}"


