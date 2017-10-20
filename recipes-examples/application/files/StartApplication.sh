#!/bin/sh
echo "Starting application..."

# enable backlight

i2cset -y 3 0x17 0x00 0xfc

# export gpio

echo 496 > /sys/class/gpio/export
echo 497 > /sys/class/gpio/export
echo 498 > /sys/class/gpio/export
echo 499 > /sys/class/gpio/export
echo 500 > /sys/class/gpio/export
echo 501 > /sys/class/gpio/export
echo 502 > /sys/class/gpio/export
echo 503 > /sys/class/gpio/export

echo out > /sys/class/gpio/gpio496/direction
echo out > /sys/class/gpio/gpio497/direction
echo out > /sys/class/gpio/gpio498/direction
echo out > /sys/class/gpio/gpio499/direction
echo out > /sys/class/gpio/gpio500/direction
echo out > /sys/class/gpio/gpio501/direction
echo out > /sys/class/gpio/gpio502/direction
echo out > /sys/class/gpio/gpio503/direction

# run Qt application example if present
cd /usr/share/qt5/examples/gui/analogclock && ./analogclock -platform linuxfb &

