package prg.es03;

import prg.es03.Calcolatrice;

public class TestMatematica {
    public static void main(String args[]) {
        Calcolatrice miaCalcolatrice = new Calcolatrice();

        double v1[] = miaCalcolatrice.generaVettore(3);
        double v2[] = miaCalcolatrice.generaVettore(3);
        double v3[] = miaCalcolatrice.generaVettore(5);

        double v4[] = miaCalcolatrice.sommaVettori(v1, v2);
        double v5[] = miaCalcolatrice.sommaVettori(v1, v3);

        double v6[] = miaCalcolatrice.concatenaVettori(v1, v3);

        System.out.println("Stampo la somma fra v1 e v2, v1 e v3, e infine la concatenazione di v1 e v3.");
        System.out.print("v4: \t");
        miaCalcolatrice.stampaVettore(v4);
        System.out.println();
        
        System.out.print("v5: \t");
        miaCalcolatrice.stampaVettore(v5);
        System.out.println();

        System.out.print("v6: \t");
        miaCalcolatrice.stampaVettore(v6);
        System.out.println();

        double m1[][] = miaCalcolatrice.generaMatrice(3, 5);
        double m2[][] = miaCalcolatrice.generaMatrice(3, 5);
        double m3[][] = miaCalcolatrice.generaMatrice(3, 5);

        double m4[][] = miaCalcolatrice.sommaMatrici(m1, m2);
        double m5[][] = miaCalcolatrice.sommaMatrici(m1, m3);

        System.out.println("Stampo la somma fra m1 e m2, e poi la somma fra m1 e m3.");
        System.out.println("m4:");
        miaCalcolatrice.stampaMatrice(m4);
        System.out.println();

        System.out.println("m5:");
        miaCalcolatrice.stampaMatrice(m5);
    }
}
