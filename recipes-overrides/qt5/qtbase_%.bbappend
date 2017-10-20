PACKAGECONFIG_GL_imxpxp   = ""

QT_CONFIG_FLAGS_APPEND_append = " -no-opengl -linuxfb -no-eglfs"
QT_CONFIG_FLAGS_APPEND_remove = "-eglfs"

QT_CONFIG_FLAGS_append = " ${QT_CONFIG_FLAGS_APPEND}"

