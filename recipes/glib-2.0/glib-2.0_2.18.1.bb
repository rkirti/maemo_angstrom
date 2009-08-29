#We need to have glib with maemo changes, so this ensures
#only this version is compiled.
DEFAULT_PREFERENCE = "20"

PR = "r11"

SRC_URI = "\
           http://www.cse.iitm.ac.in/~rkirti/glib2.0_2.18.1-1maemo4+0m5.tar.gz \
           file://maemo-glib/mer-changes.patch;patch=1 \
           "

S="${WORKDIR}/glib2.0-${PV}"


require maemo-glib.inc

do_configure_prepend(){
    touch gtk-doc.make
}

