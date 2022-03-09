package com.iit.oodp;

public class PushDownLamp {
    private PushDownButton pushDownButton;

    public PushDownLamp(PushDownButton button) {
        this.pushDownButton = button;
    }

    public void operateLamp() {
        pushDownButton.pushButton();
    }

}
