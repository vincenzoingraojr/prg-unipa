package prg.es08;

import prg.es08.Veicolo;

public abstract class VeicoloAMotore extends Veicolo {
    private int cilindrata;

    public VeicoloAMotore() {
        this(1000);
    }

    public VeicoloAMotore(int cilindrata) {
        this(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, cilindrata);
    }

    public VeicoloAMotore(double x_0, double y_0, double v_0_x, double a_x, double v_0_y, double a_y, int cilindrata) {
        super(x_0, y_0, v_0_x, a_x, v_0_y, a_y);
        this.setCilindrata(cilindrata);
    }

    public void setCilindrata(int cilindrata) {
        if (cilindrata > 0) {
            this.cilindrata = cilindrata;
        } else {
            System.out.println("La cilindrata non può essere negativa, assumo 1000.");
            this.cilindrata = 1000;
        }
    }

    public int getCilindrata() {
        return this.cilindrata;
    }

    @Override
    public String getTipoVeicolo() {
        return "Veicolo a motore";
    }

    @Override
    public String toString() {
        return super.toString() + " [cilindrata = " + this.getCilindrata() + "]";
    }

    @Override
    public void muovi(double t) {
        this.setX(this.getXIniziale() + (this.getVelInizialeX() * t) + (this.getAccX() * t * t));
        this.setY(this.getYIniziale() + (this.getVelInizialeY() * t) + (this.getAccY() * t * t));
    
        System.out.println(this.getTipoVeicolo() + "[x = " + this.getX() + ", [y = " + this.getY() + "] per t = " + t + "s.");
    }
}
