# Copyright (C) 2009 Kirtika Ruchandani <kirtibr@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "HTML rendering library"
HOMEPAGE = "unknown"
LICENSE = "GPL"
SECTION = "x11/libs"
DEPENDS = "gtk+ gail"
PR = "r0"

SRC_URI =  "http://ftp.gnome.org/pub/GNOME/sources/gtkhtml/3.24/gtkhtml-3.24.4.tar.gz \
           file://gtkhtml/gtkhtml_050_check_string.diff;patch=p1 \
           file://gtkhtml/gtkhtml_090_dependency_removal.diff;patch=p1 \
           file://gtkhtml/gtkhtml_100_dependency_removal_cleaning.diff;patch=p1 \
           file://gtkhtml/gtkhtml_110_panning.diff;patch=p1 \
           file://gtkhtml/gtkhtml_120_text_selection.diff;patch=p1 \
           file://gtkhtml/gtkhtml_140_const_patch.diff;patch=p1 \
           file://gtkhtml/gtkhtml_150_image_magnification.diff;patch=p1 \
           file://gtkhtml/gtkhtml_160_get_motion_hints.diff;patch=p1 \
           file://gtkhtml/gtkhtml_170_text_selection_with_proper_doubleclick.diff;patch=p1 \
           file://gtkhtml/gtkhtml_180_dont_click_link_when_panning.diff;patch=p1 \
           file://gtkhtml/gtkhtml_190_proper_adjustment_values.diff;patch=p1 \
           file://gtkhtml/gtkhtml_200_textslave_proper_disposal.diff;patch=p1 \
           file://gtkhtml/gtkhtml_210_try_a11y.diff;patch=p1 \
           file://gtkhtml/gtkhtml_220_link_visited.diff;patch=p1 \
           file://gtkhtml/gtkhtml_230_remove_libart.diff;patch=p1 \
           file://gtkhtml/gtkhtml_240_last_search_selected_area.diff;patch=p1 \
           file://gtkhtml/gtkhtml_250_back_out_of_regex_search.diff;patch=p1 \
           file://gtkhtml/gtkhtml_260_dolt_fix.diff;patch=p1 \
           file://gtkhtml/gtkhtml_270_content_type_fix.diff;patch=p1 \
           file://gtkhtml/gtkhtml_280_pop_element_by_type_crash_fix.diff;patch=p1 \
           file://gtkhtml/gtkhtml_290_set_image_max_size.diff;patch=p1 \
           file://gtkhtml/gtkhtml_300_coverity_findings.diff;patch=p1 \
           file://gtkhtml/gtkhtml_310_some_workarounds_to_avoid_crash.diff;patch=p1  "

S="${WORKDIR}/gtkhtml-${PV}"

inherit autotools pkgconfig
EXTRA_OECONF = "--disable-gtk-doc"
	
ORBIT_IDL = "${STAGING_BINDIR_NATIVE}/orbit-idl-2"

do_configure_append(){
    find ${S} -name Makefile | xargs sed -i s:'-I$(includedir)':'-I.':g
    find ${S} -name Makefile | xargs sed -i s:'-I${prefix}/include':'-I.':g
    find ${S} -name Makefile | xargs sed -i 's|ORBIT_IDL =.*|ORBIT_IDL = ${ORBIT_IDL}|'
}


do_stage(){
    autotools_stage_all
}

FILES_${PN} += "${datadir}/gtkhtml-3.14/*"
