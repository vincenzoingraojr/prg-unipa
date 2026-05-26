package prg.es05;

import prg.es05.Date;

public class Studente {
    private String nome, cognome;
    private Date data;
    private long matricola;

    public Studente() {
        System.out.println("L'oggetto di classe Studente è stato creato correttamente.");
    }

    public Studente(String nome, String cognome, Date data, long matricola) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setData(data);
        this.setMatricola(matricola);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setMatricola(long matricola) {
        if (matricola > 1000) {
            this.matricola = matricola;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Date getData() {
        return data;
    }

    public String toString() {
        return nome + " " + cognome + " (" + matricola + "), " + data.toString();
    }
}
