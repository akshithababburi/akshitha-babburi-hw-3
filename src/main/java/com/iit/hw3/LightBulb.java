package com.iit.hw3;

import com.iit.oodp.Button;

public class LightBulb implements Button {
    @Override
    public void switchOn() {
        System.out.println("Lightbulb on");
    }

    @Override
    public void switchOff() {
        System.out.println("Lightbulb off");
    }
}
