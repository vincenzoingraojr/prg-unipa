package prg.es08;

import prg.es08.VeicoloAMotore;

public class Automobile extends VeicoloAMotore {
    private String targa;
    
    public Automobile() {
        this("AA001BB");
    }

    public Automobile(String targa) {
        this(targa, 1000);
    }

    public Automobile(String targa, int cilindrata) {
        this(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, cilindrata, targa);
    }

    public Automobile(double x_0, double y_0, double v_0_x, double a_x, double v_0_y, double a_y, int cilindrata, String targa) {
        super(x_0, y_0, v_0_x, a_x, v_0_y, a_y, cilindrata);
        this.setTarga(targa);
    }

    public void setTarga(String targa) {
        if (targa.length() == 7) {
            this.targa = targa;
        } else {
            System.out.println("La targa non è valida. Assumo una targa temporanea AA001BB");
            this.targa = "AA001BB";
        }
    }

    public String getTarga() {
        return this.targa;
    }

    @Override
    public String toString() {
        return super.toString() + " [targa = " + this.getTarga() + "]";
    }

    @Override
    public String getTipoVeicolo() {
        return "Automobile";
    }
}
