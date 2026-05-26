package prg.es02;

/**
 * Represents a square.
 */
public class Quadrato {
    /** An integer value that represents the square of a square. */
    public int lato;
    
    /** Constructs an empty Quadrato object. */
    public Quadrato() { 
        System.out.println("Un oggetto generico di classe Quadrato è stato creato.");
    }

    /** Constructs a new Quadrato object by considering an integer value: lato.
     * @param l An integer value that represents the side of the square.
     */
    public Quadrato(int l) {
        lato = l;
        System.out.println("L'oggetto di classe Quadrato (avente lato pari a " + l + ") è stato creato correttamente.");
    }

    /** @return The perimeter of the Quadrato object (integer). */
    public int perimetro() {
        return lato * 4;
    }

    /** @return The surface of the Quadrato object (integer). */
    public int area() {
        return lato * lato;
    }
}
