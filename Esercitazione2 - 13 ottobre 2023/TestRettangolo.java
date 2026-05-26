package prg.es02;

import prg.es02.Rettangolo;

public class TestRettangolo {
    public static void main(String args[]) {
        Rettangolo r = new Rettangolo();
        r.base = 3;
        r.altezza = 4;
        int p = r.perimetro();
        int a = r.area();
        System.out.println("Il perimetro del rettangolo di base " + r.base + " e altezza " + r.altezza + " è " + p + ". La sua area è " + a + ".");

        System.out.println("Adesso usiamo un altro costruttore - che prende in input la base e l'altezza del nostro rettangolo (entrambi dati di tipo intero) - per creare un altro oggetto.");

        Rettangolo r1 = new Rettangolo(2, 5);
        int p1 = r1.perimetro();
        int a1 = r1.area();
        System.out.println("Il perimetro del rettangolo di base " + r1.base + " e altezza " + r1.altezza + " è " + p1 + ". La sua area è " + a1 + ".");
    }
}
