package prg.es07;

import prg.es07.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import prg.es07.Cantante;

public class Televoto {
    private ArrayList<Voto> voti;
    private final ArrayList<Cantante> cantanti;

    public Televoto() {
        this.voti = new ArrayList<>();
        this.cantanti = new ArrayList<>(Arrays.asList(new Cantante("Irama"), new Cantante("Annalisa"), new Cantante("Il Volo"), new Cantante("Alfa"), new Cantante("Emma"), new Cantante("Alessandra Amoroso"), new Cantante("Clara"), new Cantante("Gianni Morandi"), new Cantante("Tommaso Paradiso"), new Cantante("The Kolors"), new Cantante("Rkomi"), new Cantante("Elodie"), new Cantante("Mahmood"), new Cantante("Riccardo Cocciante"), new Cantante("Ricchi e poveri")));
        System.out.println("Bevenuto al Televoto di Sanremo.");
    }

    public void vediListaCantanti() {
        System.out.println("Lista cantanti in gara:");
        for (int i = 0; i < this.cantanti.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + cantanti.get(i));
        }
    }

    public void vota(String numeroDiTelefono, int codiceCantante) {
        int contaVoti = 0;

        for (Voto e : this.voti) {
            if (e.getNumeroDiTelefono().equals(numeroDiTelefono))
                contaVoti++;
        }

        if (contaVoti <= 5 && codiceCantante > 0 && codiceCantante <= this.cantanti.size()) {
            Voto nuovoVoto = new Voto(numeroDiTelefono, codiceCantante);
            voti.add(nuovoVoto);
            this.cantanti.get(codiceCantante - 1).setNumeroVoti();
        } else if (contaVoti > 5) {
            System.out.println("Spiacenti, hai superato il numero massimo di voti (5).");
        } else {
            System.out.println("Un errore è stato riscontrato durante la procedura di voto. Riprova più tardi.");
        }
    }

    public void vediClassifica() {
        System.out.println("Classifica aggiornata.");

        ArrayList<Cantante> classificaCantanti = new ArrayList<>(this.cantanti);
        classificaCantanti.sort(Comparator.comparingInt(Cantante::getNumeroVoti).reversed());

        for (int i = 0; i < classificaCantanti.size(); i++) {
            System.out.println("(Posizione: " + (i + 1) + ")" + " " + classificaCantanti.get(i) + " " + classificaCantanti.get(i).getNumeroVoti());
        }
    }
}
