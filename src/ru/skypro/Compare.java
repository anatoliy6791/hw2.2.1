package ru.skypro;

public class Compare {
    public void compareGrifendors(Grifendor grifendors1, Grifendor grifendors2) {
        int sum1 = grifendors1.getMagicSkill() + grifendors1.getDistanceTeleportation() + grifendors1.getNobility() + grifendors1.getHonor() + grifendors1.getBravery();
        int sum2 = grifendors2.getMagicSkill() + grifendors2.getDistanceTeleportation() + grifendors2.getNobility() + grifendors2.getHonor() + grifendors2.getBravery();
        if (sum1 > sum2) {
            System.out.println("Лучший гриффиндорец: " + grifendors1.getName());
        } else if (sum1 < sum2) {
            System.out.println("Лучший гриффиндорец: " + grifendors2.getName());
        } else {
            System.out.println("Эти гриффиндорцы равны");
        }
    }

    public void compareSlizerin(Slizerin slizerim1, Slizerin slizerim2) {
        int sum1 = slizerim1.getMagicSkill() + slizerim1.getDistanceTeleportation() + slizerim1.getAmbition() + slizerim1.getCunning() + slizerim1.getDetermination()+slizerim1.getResourcefulness()+slizerim1.getThirstForPower();
        int sum2 = slizerim2.getMagicSkill() + slizerim2.getDistanceTeleportation() + slizerim2.getAmbition() + slizerim2.getCunning() + slizerim2.getDetermination()+slizerim2.getResourcefulness()+slizerim2.getThirstForPower();
        if (sum1 > sum2) {
            System.out.println("Лучший студент слизерина: " + slizerim1.getName());
        } else if (sum1 < sum2) {
            System.out.println("Лучший студент слизерина: " + slizerim2.getName());
        } else {
            System.out.println("Эти студенты слизерина равны");
        }
    }
    public void comparePuffenduy(Puffenduy puffenduy1, Puffenduy puffenduy2) {
        int sum1 = puffenduy1.getMagicSkill() + puffenduy1.getDistanceTeleportation() + puffenduy1.getDiligence() + puffenduy1.getHonesty() + puffenduy1.getLoyalty();
        int sum2 = puffenduy2.getMagicSkill() + puffenduy2.getDistanceTeleportation() + puffenduy2.getDiligence() + puffenduy2.getHonesty() + puffenduy2.getLoyalty();
        if (sum1 > sum2) {
            System.out.println("Лучший студент Пуффендуя: " + puffenduy1.getName());
        } else if (sum1 < sum2) {
            System.out.println("Лучший студент Пуффендуя: " + puffenduy2.getName());
        } else {
            System.out.println("Эти студенты Пуффендуя равны");
        }
    }
    public void compareCogtevran(Cogtevran cogtevran1, Cogtevran cogtevran2) {
        int sum1 = cogtevran1.getMagicSkill() + cogtevran1.getDistanceTeleportation() + cogtevran1.getSmart() + cogtevran1.getWise() + cogtevran1.getWitty()+cogtevran1.getCreativity();
        int sum2 = cogtevran2.getMagicSkill() + cogtevran2.getDistanceTeleportation() + cogtevran2.getSmart() + cogtevran2.getWise() + cogtevran2.getWitty()+cogtevran2.getCreativity();
        if (sum1 > sum2) {
            System.out.println("Лучший студент Когтеврана: " + cogtevran1.getName());
        } else if (sum1 < sum2) {
            System.out.println("Лучший студент Когтеврана: " + cogtevran2.getName());
        } else {
            System.out.println("Эти студенты Когтеврана равны");
        }
    }

    public void comparePerson (Person person1, Person person2) {
        int sum1 = person1.getMagicSkill()+person1.getDistanceTeleportation();
        int sum2 = person2.getMagicSkill() + person2.getDistanceTeleportation();
        if (sum1 > sum2) {
            System.out.println("Лучший студент Хогвартса: " + person1.getName());
        } else if (sum1 < sum2) {
            System.out.println("Лучший студент Хогвартса: " + person2.getName());
        } else {
            System.out.println("Эти студенты Хогвартса равны");
        }
    }

}
