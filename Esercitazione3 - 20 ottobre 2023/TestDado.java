package prg.es03;

import prg.es03.Dado;

public class TestDado {
    public static void main(String args[]) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < 100; i++) {
            result1 = d1.lancia();
            result2 = d2.lancia();

            if ((result1 + result2) == 12) {
                System.out.println("In questo lancio (" + (i + 1) + ") è uscito 12.");
            }

            c[result1 + result2 - 1]++;
        }

        System.out.println();

        for (int j = 0; j < c.length; j++) {
            System.out.print(j + 1 + "\t");
            System.out.println(c[j]);
        }
    }
}
