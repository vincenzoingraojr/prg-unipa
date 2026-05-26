package prg.es08;

import prg.es08.VeicoloAMotore;

public class Ciclomotore extends VeicoloAMotore {
    private long numTelaio;
    private static long contaTelai = 0;

    public Ciclomotore() {
        this(++contaTelai);
    }

    public Ciclomotore(long numTelaio) {
        this(numTelaio, 1000);
    }

    public Ciclomotore(long numTelaio, int cilindrata) {
        this(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, numTelaio, cilindrata);
    }

    public Ciclomotore(double x_0, double y_0, double v_0_x, double a_x, double v_0_y, double a_y, long numTelaio, int cilindrata) {
        super(x_0, y_0, v_0_x, a_x, v_0_y, a_y, cilindrata);
        this.setNumTelaio(numTelaio);
    }

    @Override
    public String toString() {
        return super.toString() + " [numTelaio = " + this.getNumTelaio() + "]";
    }

    public void setNumTelaio(long numTelaio) {
        if (numTelaio > 0) {
            this.numTelaio = numTelaio;
        } else {
            System.out.println("Il numero di telaio non può essere negativo, utilizzo il conteggio incrementato.");
            this.numTelaio = ++contaTelai;
        }
    }

    public long getNumTelaio() {
        return this.numTelaio;
    }

    @Override
    public String getTipoVeicolo() {
        return "Ciclomotore";
    }
}
