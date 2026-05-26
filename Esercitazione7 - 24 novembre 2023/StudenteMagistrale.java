package prg.es07;

import prg.es05.Date;
import prg.es07.Studente;

public class StudenteMagistrale extends Studente {
    private final String corsoTriennale;
    public static final int maxCFU = 120;

    public StudenteMagistrale() {
        this("-", "-", -1, new Date(1, 1, 1970), 00000, "-", 0.0, "-");
    }

    public StudenteMagistrale(String nome, String cognome, int eta, Date dataIscrizione, long matricola, String corsoDiLaurea, double tassa, String corsoTriennale) {
        super(nome, cognome, eta, dataIscrizione, matricola, corsoDiLaurea, tassa);
        this.corsoTriennale = corsoTriennale;
    }

    public String toString() {
        return this.getNome() + " " + this.getCognome() + " " + this.getEta() + " " + this.getDataIscrizione().print2() + " " + this.getMatricola() + " " + this.getCorsoDiLaurea() + " " + this.getCorsoTriennale();
    }

    public String getCorsoTriennale() {
        return this.corsoTriennale;
    }
}
