#!/bin/bash

# include predefined functions

. /usr/lib/tuned/functions

# exectued at profile load
start() {

echo "Profile Traning got loaded" >> /tmp/tuned.log
# 
disable_bluetooth
enable_wifi_powersave

# exectued at profile unload
stop() {
#
echo  "Profile Training got unloaded" >> /tmp/tuned.log

# Power Saving Disbale
enable_bluetooth
disable_wifi_powersave
}
process $@
