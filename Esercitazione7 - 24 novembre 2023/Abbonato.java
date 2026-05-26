package prg.es07;

import prg.es05.Persona;

public class Abbonato extends Persona {
    private double sconto;

    public Abbonato() {
        this("", "", -1, 5.00);
    }

    public Abbonato(String nome, String cognome, int eta, double sconto) {
        super(nome, cognome, eta);

        this.sconto = sconto;
    }

    public void setSconto(double s) {
        this.sconto = s;
    }

    public double getSconto() {
        return this.sconto;
    }

    public double acquista(double importo) {
        return importo - (importo * (sconto / 100));
    }
}
