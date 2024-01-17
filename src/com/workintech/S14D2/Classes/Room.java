package com.workintech.S14D2.Classes;

public class Room {
    private Ceiling ceiling;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public Room(Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }
}
