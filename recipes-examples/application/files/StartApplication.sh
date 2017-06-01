#!/bin/sh
echo "Starting application..."

# enable backlight

i2cset -y 3 0x17 0x00 0xfc
 

# run application

