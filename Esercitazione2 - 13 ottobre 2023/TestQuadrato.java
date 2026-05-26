package prg.es02;

import prg.es02.Quadrato;

public class TestQuadrato {
    public static void main(String args[]) {
        Quadrato q = new Quadrato();
        q.lato = 5;
        int p = q.perimetro();
        int a = q.area();
        System.out.println("Il perimetro del quadrato di lato " + q.lato + " è " + p + ". La sua area è " + a + ".");

        System.out.println("Adesso usiamo un altro costruttore - che prende in input un lato (dato di tipo intero) - per creare un altro oggetto.");

        Quadrato q1 = new Quadrato(7);
        int p1 = q1.perimetro();
        int a1 = q1.area();
        System.out.println("Il perimetro del quadrato di lato " + q1.lato + " è " + p1 + ". La sua area è " + a1 + ".");
    }
}
