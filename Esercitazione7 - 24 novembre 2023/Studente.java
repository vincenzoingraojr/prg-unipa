package prg.es07;

import prg.es05.Date;
import prg.es05.Persona;

public class Studente extends Persona {
    private Date dataIscrizione;
    final private long matricola;
    private String corsoDiLaurea;
    private double tassa;
    private int cfuConseguiti;

    public Studente() {
        this("-", "-", -1, new Date(1, 1, 1970), 00000, "-", 0.00);
    }

    public Studente(String nome, String cognome, int eta, Date dataIscrizione, long matricola, String corsoDiLaurea, double tassa) {
        super(nome, cognome, eta);
        this.dataIscrizione = dataIscrizione;
        this.matricola = matricola;
        this.corsoDiLaurea = corsoDiLaurea;
        this.tassa = tassa;
    }

    @Override
    public String toString() {
        return getNome() + " " + getCognome() + " " + getEta() + " " + getDataIscrizione().print2() + " " + getMatricola() + " " + getCorsoDiLaurea();
    }

    public void setDataIscrizione(int d, int m, int y) {
        this.dataIscrizione = new Date(d, m, y);
    }

    public Date getDataIscrizione() {
        return this.dataIscrizione;
    }
    
    public long getMatricola() {
        return this.matricola;
    }

    public void setCorsoDiLaurea(String corsoDiLaurea) {
        this.corsoDiLaurea = corsoDiLaurea;
    }

    public String getCorsoDiLaurea() {
        return this.corsoDiLaurea;
    }

    public void registraCFU(int cfu) {
        this.cfuConseguiti += cfu;
    }

    public int getCFUConseguiti() {
        return this.cfuConseguiti;
    }
}
