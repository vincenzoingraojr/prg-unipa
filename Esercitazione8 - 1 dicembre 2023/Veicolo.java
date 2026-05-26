package prg.es08;

public abstract class Veicolo {
    private double x;
    private double y;
    private double x_0;
    private double v_0_x;
    private double a_x;
    private double y_0;
    private double v_0_y;
    private double a_y;

    public Veicolo() {
        this(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public Veicolo(double x_0, double y_0, double v_0_x, double a_x, double v_0_y, double a_y) {
        this.setXIniziale(x_0);
        this.setYIniziale(y_0);
        this.setVelInizialeX(v_0_x);
        this.setVelInizialeY(v_0_y);
        this.setAccX(a_x);
        this.setAccY(a_y);
    }

    public abstract void muovi(double t);

    @Override
    public String toString() {
        return "Caratteristiche del " + this.getTipoVeicolo() + " [x_0 = " + this.getXIniziale() + ", y_0 = " + this.getYIniziale() + ", v_0_x = " + this.getVelInizialeX() + ", v_0_y = " + this.getVelInizialeY() + ", a_x = " + this.getAccX() + ", a_y = " + this.getAccY() + "]";
    }

    // mutator methods

    public void setXIniziale(double x_0) {
        this.x_0 = x_0;
    }

    public void setYIniziale(double y_0) {
        this.y_0 = y_0;
    }

    public void setVelInizialeX(double v_0_x) {
        this.v_0_x = v_0_x;
    }

    public void setVelInizialeY(double v_0_y) {
        this.v_0_y = v_0_y;
    }

    public void setAccX(double a_x) {
        this.a_x = a_x;
    }

    public void setAccY(double a_y) {
        this.a_y = a_y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // accessor methods

    public double getXIniziale() {
        return this.x_0;
    }

    public double getYIniziale() {
        return this.y_0;
    }

    public double getVelInizialeX() {
        return this.v_0_x;
    }

    public double getVelInizialeY() {
        return this.v_0_y;
    }

    public double getAccX() {
        return this.a_x;
    }

    public double getAccY() {
        return this.a_y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String getTipoVeicolo() {
        return "Veicolo";
    };
}