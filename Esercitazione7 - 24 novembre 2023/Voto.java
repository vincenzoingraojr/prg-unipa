package prg.es07;

public class Voto {
    private String numeroDiTelefono;
    private int numeroCantante;

    public Voto() {
        this("-", 0);
    }

    public Voto(String numeroDiTelefono, int numeroCantante) {
        this.setNumeroDiTelefono(numeroDiTelefono);
        this.setNumeroCantante(numeroCantante);
    }

    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNumeroDiTelefono() {
        return this.numeroDiTelefono;
    }

    public void setNumeroCantante(int numeroCantante) {
        this.numeroCantante = numeroCantante;
    }

    public int getNumeroCantante() {
        return this.numeroCantante;
    }

    @Override
    public String toString() {
        return this.getNumeroDiTelefono() + " (" + this.getNumeroCantante() + ")";
    }
}
