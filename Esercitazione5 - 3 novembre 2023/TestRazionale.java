package prg.es05;

import java.util.Scanner;

import prg.es05.Razionale;

public class TestRazionale {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un intero che sara\' il numeratore del primo numero razionale (r1): ");
        int n1 = scanner.nextInt();

        System.out.println("Inserisci un intero che sara\' il denominatore del primo numero razionale (r1): ");
        int d1 = scanner.nextInt();

        Razionale r1 = new Razionale(n1, d1);

        System.out.println("Inserisci un intero che sara\' il numeratore del secondo numero razionale (r2): ");
        int n2 = scanner.nextInt();

        System.out.println("Inserisci un intero che sara\' il denominatore del secondo numero razionale (r2): ");
        int d2 = scanner.nextInt();

        Razionale r2 = new Razionale();
        r2.setNum(n2);
        r2.setDen(d2);

        Razionale s, d, m, q;

        s = r1.somma(r2);
        d = r1.sottrai(r2);
        m = r1.moltiplica(r2);
        q = r1.dividi(r2);

        System.out.println("La somma tra r1 e r2 e\': " + s);
        System.out.println("La differenza tra r1 e r2 e\': " + d);
        System.out.println("Il prodotto tra r1 e r2 e\': " + m);
        System.out.println("Il quoziente tra r1 e r2 e\': " + q);
    }
}
