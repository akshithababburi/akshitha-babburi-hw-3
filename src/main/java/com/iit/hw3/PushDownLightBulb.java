package com.iit.hw3;

import com.iit.oodp.PushDownButton;

public class PushDownLightBulb implements PushDownButton {

    public boolean isOn;

    @Override
    public void pushButton() {
        isOn = !isOn;
        if (isOn)
            System.out.println("Push button light is on");
        else
            System.out.println("Push button light is off");
    }
}
