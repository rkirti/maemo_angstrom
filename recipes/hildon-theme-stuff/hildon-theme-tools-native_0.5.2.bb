
PR = "r0"

require hildon-theme-tools_0.5.2.bb

SRC_URI = "http://repository.maemo.org/pool/maemo5.0beta/free/h/hildon-theme-tools/hildon-theme-tools_${PV}-1.tar.gz"

inherit native

do_configure() {
}

do_install() {
	install -d ${D}/${bindir}/
	install -m 755 scripts/hildon-theme-bootstrap ${D}/${bindir}/
	install -m 755 scripts/hildon-theme-mk-bundle ${D}/${bindir}/
	install -m 755 scripts/hildon-theme-rc-parser ${D}/${bindir}/
	install -m 755 scripts/hildon-theme-subst ${D}/${bindir}/
}

do_stage() {
	install -d ${STAGING_BINDIR_NATIVE}
	install -m 755 scripts/hildon-theme-bootstrap ${STAGING_BINDIR_NATIVE}/
	install -m 755 scripts/hildon-theme-mk-bundle ${STAGING_BINDIR_NATIVE}/
	install -m 755 scripts/hildon-theme-rc-parser ${STAGING_BINDIR_NATIVE}/
	install -m 755 scripts/hildon-theme-subst ${STAGING_BINDIR_NATIVE}/
}
