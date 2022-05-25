package ru.skypro;

public class Person {
    private String name;
    private int magicSkill;
    private int distanceTeleportation;

    public Person(String name, int magicSkill, int distanceTeleportation) {
        this.name = name;
        this.magicSkill = magicSkill;
        this.distanceTeleportation = distanceTeleportation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicSkill() {
        return magicSkill;
    }

    public void setMagicSkill(int magicSkill) {
        this.magicSkill = magicSkill;
    }

    public int getDistanceTeleportation() {
        return distanceTeleportation;
    }

    public void setDistanceTeleportation(int distanceTeleportation) {
        this.distanceTeleportation = distanceTeleportation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", magicSkill=" + magicSkill +
                ", distanceTeleportation=" + distanceTeleportation +
                '}';
    }
}

