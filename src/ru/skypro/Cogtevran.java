package ru.skypro;

public class Cogtevran extends Person{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Cogtevran(String name, int magicSkill, int distanceTeleportation, int smart, int wise, int witty, int creativity) {
        super(name, magicSkill, distanceTeleportation);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return "Cogtevran{" + "Name: " + getName() + ", Magic skill: " + getMagicSkill() + ", Distance teleportation " + getDistanceTeleportation() +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
