package prg.es07;

import prg.es05.Date;
import prg.es05.Persona;

public class Professore extends Persona {
    private Date dataAssunzione;
    private String ruolo;
    private String dipartimento;
    private double stipendio;

    public Professore() {
        this("-", "-", -1, new Date(1, 1, 1970), "-", "-", 0.00);
    }

    public Professore(String nome, String cognome, int eta, Date dataAssunzione, String ruolo, String dipartimento, double stipendio) {
        super(nome, cognome, eta);
        this.dataAssunzione = dataAssunzione;
        this.ruolo = ruolo;
        this.dipartimento = dipartimento;
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return getNome() + " " + getCognome() + " " + getEta() + " " + getDataAssunzione().print2() + " " + getRuolo() + " " + getDipartimento() + " " + getStipendio();
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    public void setDataAssunzione(int d, int m, int y) {
        this.dataAssunzione = new Date(d, m, y);
    }

    public Date getDataAssunzione() {
        return this.dataAssunzione;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return this.ruolo;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    } 

    public String getDipartimento() {
        return this.dipartimento;
    }
}
