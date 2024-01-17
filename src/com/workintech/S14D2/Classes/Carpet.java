package com.workintech.S14D2.Classes;

import com.workintech.S14D2.Enums.Paintcolor;

public class Carpet {
    private int width;
    private int height;
    private Paintcolor color;

    public Carpet(int width, int height, Paintcolor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Paintcolor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
