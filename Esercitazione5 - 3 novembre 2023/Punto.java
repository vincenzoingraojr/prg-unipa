package prg.es05;

public class Punto {
    private double x, y;

    public Punto() {
        System.out.println("L'oggetto di classe Punto e\' stato creato correttamente.");
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }

    public boolean equals(Punto p) {
        if (p.getX() == x && p.getY() == y) {
            return true;
        } else {
            return false;
        }
    }

    public double distance(Punto p) {
        return ((x - p.getX()) * (x - p.getX())) + ((y - p.getY()) * (y - p.getY()));
    }

    public String m(Punto p) {
        double x_m = (x + p.getX()) / 2;
        double y_m  = (y + p.getY()) / 2;
    
        return "M(" + x_m + ", " + y_m + ")";
    }
}