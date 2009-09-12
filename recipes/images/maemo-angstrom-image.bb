GPE_EXTRA_THEMES = "gpe-theme-industrial"

GPE_EXTRA_INSTALL_none = ""
GPE_EXTRA_INSTALL_bigscreen = "task-gpe-games ${GPE_EXTRA_THEMES}"
GPE_EXTRA_INSTALL_smallscreen = "task-gpe-games ${GPE_EXTRA_THEMES}"

GUI_MACHINE_CLASS ?= "none"
GPE_EXTRA_INSTALL += "${GPE_EXTRA_INSTALL_${GUI_MACHINE_CLASS}}"

#ship more stuff with devices with >16MB of flash
GPE_BIGFLASH_INSTALL := '${@base_conditional("ROOT_FLASH_SIZE", "16", "", "\
    task-gpe-connectivity \
    gpe-theme-clearlooks \
    figment \
",d)}'

GPE_EXTRA_INSTALL += "${GPE_BIGFLASH_INSTALL}"

XSERVER ?= "xserver-kdrive-fbdev"

DEPENDS = "${MACHINE_TASK_PROVIDER} \
           task-gpe-base \
           task-gpe-apps \
           task-gpe-pim \
           task-gpe-settings \
           task-gpe-games \
           virtual/xserver"

PANGO_EXTRA_MODULES = " pango-module-arabic-fc \
                        pango-module-arabic-lang \
                        pango-module-basic-fc \
                        pango-module-basic-x \
                        pango-module-hangul-fc \
                        pango-module-hebrew-fc \
                        pango-module-indic-fc \
                        pango-module-indic-lang \
                        pango-module-khmer-fc \
                        pango-module-syriac-fc \
                        pango-module-thai-fc \
                        pango-module-tibetan-fc "

MAEMO_L10N_PACKAGES  =  "   hildon-application-manager-l10n-public  \
                            hildon-common-strings-l10n-public \
                            hildon-control-panel-l10n-public \
                            hildon-fm-l10n-public \
                            hildon-input-method-l10n-public \
                            hildon-libs-l10n-public \
                            maemo-af-desktop-l10n-public \
                            osso-applet-tasknavigator-l10n-public \
                            osso-system-lock-l10n-public \
                            osso-uri-l10n-public \
                            osso-games-l10n-public  "

LIBPNG_MAEMO_PACKAGES = "libpng3 \
                         libpng12 "


LOCALE_PACKAGES = " glibc-localedata-i18n \
                    locale-base-en-gb"

DEBUG_PACKAGES =  " hildon-desktop-dbg \
                    ltrace \
                    gdb" 

TESTING_APPS =    "inotify-tools\ 
                   omweather \
                   omweather-weather-com-stations-db \
                   osso-xterm \
                   maemo-mapper \
                   maemopadplus \
                   modest \
                   modest-locale-en-gb \
                   libtinymail \
                   libtinymailui-gtk \
                   libnotify \
                   gdbm \
                   python-hildondesktop \
                   hildon-desktop-python-loader \
                   mobile-application-service "

HILDONISED_GPE = " libgpewidget-hildon \
                   libgpepimc-hildon \
                   libgpevtype-hildon \
                   libtododb-hildon \
                   gpesyncd \
                   gpe-synctool \
                   gpe-icons \
                   gpe-filemanager-hildon \
                   gpe-contacts-hildon \
                   gpe-timesheet-hildon  \
                   gpe-todo-hildon "
#     gpe-calendar-hildon 

IMAGE_INSTALL = "    ${MACHINE_TASK_PROVIDER} \
    task-gpe-base \
    task-gpe-pim \
    task-gpe-settings \
    task-gpe-apps \
    ${XSERVER} \
    ${GPE_EXTRA_INSTALL}\
    x11vnc \
    gconf \
    gconf-dbus \
    hildon-desktop \
    ipkg \
    osso-gnome-vfs2 \
    osso-gnomevfs-extra \
    screenshot-tool \
    sapwood \
    osso-af-utils \
# Fails at rootfs time, so temporarily removed
#   osso-af-settings \
    marquee-plugins \
    maemopad \
    maemo-launcher \
    matchbox \
    matchbox-wm \
    mobile-application-service \
    pango \
    libosso \
    libhildonfm \
    libhildonhelp \
    libhildon \
    libhildonmime \
    libosso-gsf \
    hildon-control-panel \
    hildon-home-weather \
    hildon-home-webshortcut \
    hildon-icons \
    hildon-notify \
    hildon-plugins-settings \
    hildon-thumbnail \
    hildon-theme-tools \
    hildon-theme-cacher \
    hildon-theme-cacher \
    hildon-theme-layout-4 \
    hildon-theme-plankton \
    gtkhtml3.14 \
    clipboard-manager \
    ${PANGO_EXTRA_MODULES} \
    ${LIBPNG_MAEMO_PACKAGES} \
    ${LOCALE_PACKAGES} \
    ${MAEMO_L10N_PACKAGES} \
    ${TESTING_APPS} \
    ${HILDONISED_GPE} \
    ${DEBUG_PACKAGES} "

#ROOTFS_POSTPROCESS_COMMAND += "zap_root_password; "

inherit image
