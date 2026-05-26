package prg.es04;

public class Punto {
    public double x, y;

    public Punto() {
        System.out.println("L'oggetto di classe Punto e\' stato creato correttamente.");
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCoords(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }

    public boolean equals(Punto p) {
        if (p.x == x && p.y == y) {
            return true;
        } else {
            return false;
        }
    }

    public double distance(Punto p) {
        return ((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y));
    }

    public String m(Punto p) {
        double x_m = (x + p.x) / 2;
        double y_m  = (y + p.y) / 2;
    
        return "M(" + x_m + ", " + y_m + ")";
    }
}
