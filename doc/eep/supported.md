# remote device

## A5-02-05

### Parameter

* TEMPERATURE_CELSIUS (read)

## A5-04-01

### Parameter

* HUMIDITY_PERCENT (read)
* TEMPERATURE_CELSIUS (read)

## A5-08-02

### Parameter

* SUPPLY_VOLTAGE_V (read)
* ILLUMINATION_LUX (read)
* TEMPERATURE_CELSIUS (read)
* MOTION (read)
* OCCUPANCY_BUTTON (read)

## D2-01-08

### Parameter

* ENERGY_WS (read)
* POWER_W (read)
* SWITCH (read / write)

This was tested with ["Funktionsstecker FS1" of "Telefunken Smart Building"](http://www.telefunken-sb.de/produkte/aufputz/funktionsstecker.html).

To communicate with that smart plug the local EnOcean device must be teached-in to the smart plug. You have to clear the smart plug known communication partner and teach-in the openHAB system. If the plug does not known a communication partner, the device sends a UTE request, that will be responded by the openHAB binding automatically, if the item is created for. The local ID of the item is used. So you MUST use only one local ID per remote ID for that device type. The binding is using addressed telegrams for that device, so you could use the same local ID for multiple remote IDs.

## F6-02-01

### Parameter

* BUTTON_DIM_A (read)
* BUTTON_DIM_B (read)

## F6-02-02

### Parameter

* BUTTON_DIM_A (read)
* BUTTON_DIM_B (read)

## F6-10-00

### Parameter

* WINDOW_HANDLE_POSITION (read)

## F6-10-01

### Parameter

* WINDOW_HANDLE_POSITION (read)

# local device

## F6-02-01

### Parameter

* BUTTON_DIM_A (write)
* BUTTON_DIM_B (write)

## F6-02-02

### Parameter

* BUTTON_DIM_A (write)
* BUTTON_DIM_B (write)

