package com.iit.oodp;

import com.iit.hw3.PushDownLightBulb;

public class PushDownLampMain {
    public static void main(String[] args) {
        PushDownButton b = new PushDownLightBulb();
        PushDownLamp lamp = new PushDownLamp(b);
        lamp.operateLamp();
        lamp.operateLamp();
        lamp.operateLamp();
        lamp.operateLamp();
    }
}
