package prg.es05;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {
        System.out.println("L'oggetto di classe Persona è stato creato correttamente.");
    }

    public Persona(String n, String c, int e) {
        this.nome = n;
        this.cognome = c;
        this.eta = e;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", " + eta;
    }

    public boolean equals(Persona p) {
        if (p.getNome().equals(nome) && p.getCognome().equals(cognome) && p.getEta() == eta) {
            return true;
        } else {
            return false;
        }
    }
}
