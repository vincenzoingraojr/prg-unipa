package prg.es02;

/**
 * Represents a rectangle.
 */
public class Rettangolo {
    /** An integer value that represents the base of a rectangle. */
    public int base;

    /** An integer value that represents the height of a rectangle. */
    public int altezza;

    /** Constructs an empty Rettangolo object. */
    public Rettangolo() { 
        System.out.println("Un oggetto generico di classe Rettangolo è stato creato.");
    }

    /** Constructs a new Rettangolo object by considering two integer values: base and altezza.
     * @param b An integer value that represents the base of the rectangle.
     * @param a An integer value that represents the height of the rectangle.
     */
    public Rettangolo(int b, int a) {
        base = b;
        altezza = a;
        System.out.println("L'oggetto di classe Rettangolo (avente base pari a " + base + " e altezza pari a " + altezza + ") è stato creato correttamente.");
    }

    /** @return The perimeter of the Rettangolo object (integer). */
    public int perimetro() {
        return (base + altezza) * 2;
    }

    /** @return The surface of the Rettangolo object (integer). */
    public int area() {
        return base * altezza;
    }
}
