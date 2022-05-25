package ru.skypro;

public class Grifendor extends Person{
    private int nobility;
    private int honor;
    private int bravery;

    public Grifendor(String name, int magicSkill, int distanceTeleportation, int nobility, int honor, int bravery) {
        super(name, magicSkill, distanceTeleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Grifendor{" + "Name: " + getName() + ", Magic skill: " + getMagicSkill() + ", Distance teleportation " + getDistanceTeleportation() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}


