package prg.es03;

public class Persona {
    public String nome;
    public String cognome;
    public int eta;

    public Persona() {
        System.out.println("L'oggetto di classe Persona è stato creato correttamente.");
    }

    public Persona(String n, String c, int e) {
        nome = n;
        cognome = c;
        eta = e;
    }

    public String toString() {
        return nome + " " + cognome + ", " + eta;
    }

    public boolean equals(Persona p) {
        if (p.nome.equals(nome) && p.cognome.equals(cognome) && p.eta == eta) {
            return true;
        } else {
            return false;
        }
    }
}
