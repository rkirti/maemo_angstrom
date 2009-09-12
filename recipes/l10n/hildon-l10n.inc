# .inc file to be required by all hildon localization packages
#Ideally ${LANG} and ${TEXT_DOMAIN} should be passed on from the recipe.
#Language set here temporarily.
DEPENDS += "gettext-native"

inherit autotools

do_configure(){
    :
}
do_compile(){
        mkdir -p ${S}/po/${LANG}
    ${STAGING_BINDIR_NATIVE}/msgfmt --statistics -c -o po/${LANG}/${TEXT_DOMAIN}.mo po/${LANG}.po
}
do_install () {
    install -m 0755 -d ${D}${datadir}/locale/${LANG}/LC_MESSAGES
    install -m 0755 ${S}/po/${LANG}/*   ${D}${datadir}/locale/${LANG}/LC_MESSAGES/
}

PACKAGES = "${PN}"

FILES_${PN} = "${datadir}/locale/*"

LANG = "en_GB"
