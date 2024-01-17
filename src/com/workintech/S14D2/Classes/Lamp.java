package com.workintech.S14D2.Classes;

import com.workintech.S14D2.Enums.LampStyle;

public class Lamp {
    private LampStyle style;
    private boolean battery;
    private int globRating;

    public Lamp(LampStyle style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampStyle getLampStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
