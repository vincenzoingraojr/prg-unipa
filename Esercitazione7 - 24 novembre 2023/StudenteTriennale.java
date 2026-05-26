package prg.es07;

import prg.es05.Date;
import prg.es07.Studente;

public class StudenteTriennale extends Studente {
    private final String scuolaSuperiore;
    public static final int maxCFU = 180;

    public StudenteTriennale() {
        this("-", "-", -1, new Date(1, 1, 1970), 00000, "-", 0.0, "-");
    }

    public StudenteTriennale(String nome, String cognome, int eta, Date dataIscrizione, long matricola, String corsoDiLaurea, double tassa, String scuolaSuperiore) {
        super(nome, cognome, eta, dataIscrizione, matricola, corsoDiLaurea, tassa);
        this.scuolaSuperiore = scuolaSuperiore;
    }

    @Override
    public String toString() {
        return getNome() + " " + getCognome() + " " + getEta() + " " + getDataIscrizione().print2() + " " + getMatricola() + " " + getCorsoDiLaurea() + " " + getScuolaSuperiore() + " " + getCFUConseguiti();
    }

    public String getScuolaSuperiore() {
        return this.scuolaSuperiore;
    }
}
