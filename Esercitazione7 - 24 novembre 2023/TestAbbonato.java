package prg.es07;

import java.util.ArrayList;
import java.util.List;
import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;

public class TestAbbonato {
    public static void main(String[] args) {
        List<Abbonato> abbonati = new ArrayList<Abbonato>();
        List<AbbonatoPremium> abbonatiPremium = new ArrayList<AbbonatoPremium>();

        Abbonato p1 = new Abbonato("Mario", "Rossi", 42, 10.00);
        Abbonato p2 = new Abbonato("Giuseppe", "Verdi", 37, 12.00);
        abbonati.add(p1);
        abbonati.add(p2);

        AbbonatoPremium p3 = new AbbonatoPremium("Tommaso", "Feltrinelli", 51, 11.00);
        AbbonatoPremium p4 = new AbbonatoPremium("Alessia", "Vincenzi", 26, 16.00);
        abbonatiPremium.add(p3);
        abbonatiPremium.add(p4);

        for (int i = 0; i < abbonati.size(); i++) {
            System.out.println("L'utente " + abbonati.get(i).getNome() + " " + abbonati.get(i).getCognome() + " sta acquistando un oggetto di importo di 100.00 euro, ma pagherà soltanto " + abbonati.get(i).acquista(100.00) + " euro.");
        }

        for (int j = 0; j < abbonatiPremium.size(); j++) {
            System.out.println("L'utente Premium " + abbonatiPremium.get(j).getNome() + " " + abbonatiPremium.get(j).getCognome() + " sta acquistando un oggetto di importo di 1200.00 euro, ma pagherà soltanto " + abbonatiPremium.get(j).acquista(1200.00) + " euro.");
        }

        System.out.println("L'utente Premium " + abbonatiPremium.get(0).getNome() + " " + abbonatiPremium.get(0).getCognome() + " sta acquistando un oggetto di importo di 2700.00 euro, ma pagherà soltanto " + abbonatiPremium.get(0).acquista(2700.00) + " euro.");
    }
}
