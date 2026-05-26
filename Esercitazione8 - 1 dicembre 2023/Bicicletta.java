package prg.es08;

import prg.es08.Veicolo;

public class Bicicletta extends Veicolo {
    private String modello;

    public Bicicletta() {
        this("Base");
    }

    public Bicicletta(String modello) {
        this(0.0, 0.0, modello);
    }

    public Bicicletta(double x_0, double v_0_x, String modello) {
        super(x_0, 0.0, v_0_x, 0.0, 0.0, 0.0);
        this.setModello(modello);
    }

    public void setModello(String modello) {
        if (!modello.equals("")) {
            this.modello = modello;
        } else {
            System.out.println("Il modello non può essere una stringa vuota. Assumo modello \"base\".");
            this.modello = "Base";
        }
    }

    public String getModello() {
        return this.modello;
    }

    @Override
    public String getTipoVeicolo() {
        return "Bicicletta";
    }

    @Override
    public String toString() {
        return super.toString() + " [modello = " + this.getModello() + "]";
    }

    @Override
    public void muovi(double t) {
        this.setX(this.getXIniziale() + (this.getVelInizialeX() * t));
        this.setY(0);
    
        System.out.println(this.getTipoVeicolo() + "[x = " + this.getX() + ", [y = " + this.getY() + "] per t = " + t + "s.");
    }
}
