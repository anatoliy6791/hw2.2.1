package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Person[] persons = {new Person("Potter", 90, 90),
                new Person("Germiona", 100, 60),
                new Person("Ron", 60, 100),
                new Person("Захария Смит", 80, 50),
                new Person("Седрик Диггори", 90, 70),
                new Person("Чжоу Чанг", 90, 90),
                new Person("Падма Патил", 100, 60),
                new Person("Маркус Белби", 60, 100),
                new Person("Драко Малфой", 90, 90),
                new Person("Грэхэм Монтегю", 100, 60),
                new Person("Грегори Гойл", 60, 100),
        };
        Grifendor[] grifendors = {new Grifendor("Potter", 90, 90, 90, 90, 90),
                new Grifendor("Germiona", 100, 60, 80, 90, 70),
                new Grifendor("Ron", 60, 100, 60, 90, 50),
        };

            Puffenduy[] puffenduys = {new Puffenduy("Захария Смит", 80, 50, 70, 60, 75),
                    new Puffenduy("Седрик Диггори", 90, 70, 80, 40, 70),
                    new Puffenduy("Джастин Финч-Флетчли", 60, 100, 60, 90, 50),
            };

            Cogtevran[] cogtevrans = {new Cogtevran("Чжоу Чанг", 90, 90, 90, 90, 90, 40),
                    new Cogtevran("Падма Патил", 100, 60, 80, 90, 70, 50),
                    new Cogtevran("Маркус Белби", 60, 100, 60, 90, 50, 70),
            };

            Slizerin[] slizerins = {new Slizerin("Драко Малфой", 90, 90, 90, 90, 90, 40, 70),
                    new Slizerin("Грэхэм Монтегю", 100, 60, 80, 90, 70, 50, 50),
                    new Slizerin("Грегори Гойл", 60, 100, 60, 90, 50, 60, 30),
            };

        PrintService printService = new PrintService();
        printService.print(grifendors);
        printService.print(puffenduys);
        printService.print(cogtevrans);
        printService.print(slizerins);
        Compare compare = new Compare();
        compare.compareGrifendors(grifendors[1], grifendors[0]);
        compare.compareCogtevran(cogtevrans[1], cogtevrans[0]);
        compare.comparePuffenduy(puffenduys[2], puffenduys[0]);
        compare.compareSlizerin(slizerins[1],slizerins[2]);
        compare.comparePerson(persons[1],persons[6]);
    }
    }

