package com.iit.oodp;

public class TableLamp {
    private Button button;

    public TableLamp(Button button) {
        this.button = button;
    }

    public void tableLampOn() {
        button.switchOn();
    }

    public void tableLampOff() {
        button.switchOff();
    }

}
