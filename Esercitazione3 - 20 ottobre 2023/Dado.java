package prg.es03;

public class Dado {
    public int lancia() {
        int numero = (int) (((Math.random() * 10) % 6) + 1);
        return numero;
    }
}
