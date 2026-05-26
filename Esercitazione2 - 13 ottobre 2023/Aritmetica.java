package prg.es02;

public class Aritmetica {
    public static void main(String args[]) {
        int a = 5, b = 3;
        int r1 = a / b;
        System.out.println("Il risultato della divisione fra " + a + " e " + b + " è " + r1 + ".");

        char c = 'a';
        short s = 5000;
        int r2 = c * s;
        System.out.println("Il risultato della moltiplicazione fra " + c + " e " + s + " è " + r2 + ".");

        int i = 6;
        float f = 3.14F;
        float r3 = i + f;
        System.out.println("Il risultato della somma fra " + i + " e " + f + " è " + r3 + ".");

        float r4 = r1 - r2 - r3;
        System.out.println("Il risultato della differenza fra " + r1 + ", " + r2 + " e " + r3 + " è " + r4 + ".");
    }
}
