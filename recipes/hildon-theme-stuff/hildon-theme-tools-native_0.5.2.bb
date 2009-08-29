
PR = "r0"

require hildon-theme-tools_0.5.2.bb

DEPENDS += "gtk+-native"

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/h/hildon-theme-tools/hildon-theme-tools_${PV}-1.tar.gz"

inherit native


do_stage() {
	autotools_stage_all
}
