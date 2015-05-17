SUMMARY = "Example external Linux kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

# When you inherit module.bbclass, module packages are automatically named
# with the "kernel-module-" prefix, as required by the oe-core build
# environment.
inherit module

PR = "r0"
PV = "0.1"

SRC_URI = "git://github.com/mvista/hello-mod-src.git;protocol=git;tag=master"

S = "${WORKDIR}/git"
