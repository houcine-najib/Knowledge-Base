#!/bin/bash

# include predefined functions

. /usr/lib/tuned/functions

# exectued at profile load
start() {

echo "Profile Traning got loaded" >> /tmp/tuned.log

}

# exectued at profile unload
stop() {

echo  "Profile Training got unloaded" >> /tmp/tuned.log

}

process $@
