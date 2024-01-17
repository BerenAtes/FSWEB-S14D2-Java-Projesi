package com.workintech.S14D2.Classes;

public class Bedroom extends Room {
    private String name;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4, String name, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(ceiling, wall1, wall2, wall3, wall4);
        this.name = name;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void createBedroom() {
        this.getWall1().create();
        super.getWall2().create();
        super.getWall3().create();
        super.getWall4().create();
        super.getCeiling().create();

        bed.make();
        carpet.lying();
        wardrobe.add();
        lamp.turnOn();
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", lamp=" + lamp +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
