package prg.es07;

public class AbbonatoPremium extends Abbonato {
    private double spesaComplessiva;

    public AbbonatoPremium() {
        this("", "", -1, 5.00);
    }

    public AbbonatoPremium(String nome, String cognome, int eta, double sconto) {
        super(nome, cognome, eta, sconto);
    }

    @Override
    public double acquista(double importo) {
        this.spesaComplessiva += importo;
        int n = (int) (spesaComplessiva / 100) * 5;

        return importo - (importo * (getSconto() / 100)) - n;
    }
}
