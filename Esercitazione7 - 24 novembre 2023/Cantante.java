package prg.es07;

public class Cantante {
    private String nomeCantante;    
    private int numeroVoti;

    public Cantante(String nomeCantante) {
        this.nomeCantante = nomeCantante;
    }

    public void setNumeroVoti() {
        this.numeroVoti++;
    }

    public int getNumeroVoti() {
        return this.numeroVoti;
    }

    @Override
    public String toString() {
        return this.nomeCantante;
    }
}
