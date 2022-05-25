package ru.skypro;

public class PrintService {
    public void print(Grifendor[] grifendors) {
        System.out.println("grifendors.length = " + grifendors.length);
        for (int i = 0; i < grifendors.length; i++) {
            Grifendor grifendor = grifendors[i];
            System.out.println(grifendor);
        }
    }
    public void  print(Puffenduy[] puffenduys) {
        System.out.println("puffenduys.length = " + puffenduys.length);
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy puffenduy = puffenduys[i];
            System.out.println(puffenduy);
        }
    }

    public void print(Cogtevran[] cogtevrans) {
        System.out.println("cogtevrans.length = " + cogtevrans.length);
        for (int i = 0; i < cogtevrans.length; i++) {
            Cogtevran cogtevran = cogtevrans[i];
            System.out.println(cogtevran);
        }
    }
    public void print(Slizerin[] slizerins) {
        System.out.println("slizerins.length = " + slizerins.length);
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(slizerin);
        }
    }

}
