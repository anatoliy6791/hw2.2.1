package ru.skypro;

public class Puffenduy extends Person{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int magicSkill, int distanceTeleportation, int diligence, int loyalty, int honesty) {
        super(name, magicSkill, distanceTeleportation);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" + "Name: " + getName() + ", Magic skill: " + getMagicSkill() + ", Distance teleportation " + getDistanceTeleportation() +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
