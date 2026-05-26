package prg.es04;

import java.util.Scanner;

import prg.es04.Punto;

public class TestPunto {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Inserisci l'ascissa del primo punto: ");
        double x1 = scanner.nextDouble();

        System.out.println("Inserisci l'ordinata del primo punto: ");
        double y1 = scanner.nextDouble();

        System.out.println("Inserisci l'ascissa del secondo punto: ");
        double x2 = scanner.nextDouble();

        System.out.println("Inserisci l'ordinata del secondo punto: ");
        double y2 = scanner.nextDouble();
    
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto();
        p2.setCoords(x2, y2);
    
        System.out.println("Ecco la distanza fra i due punti: " + p1.distance(p2) + ".");

        System.out.println("Ecco il punto medio del segmento che unisce i due punti: " + p1.m(p2) + ".");
    
        System.out.println("I due punti sono uguali? " + p1.equals(p2) + ".");
    }
}
