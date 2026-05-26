package prg.es05;

public class Razionale {
    private int num, den;

    public Razionale() {
        System.out.println("L'oggetto della classe Razionale è stato creato correttamente.");
    }

    public Razionale(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    @Override
    public String toString() {
        return "Numero razionale: " + num + "/" + den + " oppure " + (double)(num / den);
    }

    public Razionale somma(Razionale r) {
        int sNum = num * r.getDen() + r.getNum() * den;
        int sDen = den * r.getDen();

        Razionale s = new Razionale(sNum, sDen);

        return s;
    }

    public Razionale sottrai(Razionale r) {
        int sNum = num * r.getDen() - r.getNum() * den;
        int sDen = den * r.getDen();

        Razionale s = new Razionale(sNum, sDen);

        return s;
    }

    public Razionale moltiplica(Razionale r) {
        Razionale m = new Razionale(num * r.getNum(), den * r.getDen());
        
        return m;
    }

    public Razionale dividi(Razionale r) {
        Razionale q = new Razionale(num * r.getDen(), den * r.getNum());
        
        return q;
    }
}
