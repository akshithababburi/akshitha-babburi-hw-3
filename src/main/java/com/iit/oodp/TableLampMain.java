package com.iit.oodp;

import com.iit.hw3.LightBulb;

public class TableLampMain {
    public static void main(String[] args) {
        Button b = new LightBulb();
        TableLamp lamp = new TableLamp(b);
        lamp.tableLampOff();
        lamp.tableLampOn();
    }
}
