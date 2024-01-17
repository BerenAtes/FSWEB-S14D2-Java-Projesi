package com.workintech.S14D2.Classes;
import com.workintech.S14D2.Enums.Paintcolor;

public class Ceiling {
    private int height;
    private Paintcolor paintedColor;

    public Ceiling(int height, Paintcolor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public Paintcolor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("height:"+ this.height + "paintingColor:" + this.paintedColor);
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedColor=" + paintedColor +
                '}';
    }
}
