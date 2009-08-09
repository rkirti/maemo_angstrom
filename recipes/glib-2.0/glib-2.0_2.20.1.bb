#We need to have glib with maemo changes, so this ensures
#only this version is compiled.
DEFAULT_PREFERENCE = "20"

PR = "r11"

SRC_URI = "\
           http://repository.maemo.org/pool/fremantle/free/g/glib2.0/glib2.0_${PV}.orig.tar.gz \ 
           file://maemo-glib/mer-changes.patch;patch=1 \
           "

S="${WORKDIR}/glib2.0-${PV}"


require maemo-glib.inc

do_configure_prepend(){
    touch gtk-doc.make
}

