package prg.es04;

import java.util.ArrayList;
import prg.es03.Persona;

public class Principale {
    public static void main(String args[]) {
        ArrayList<Persona> miaLista = new ArrayList<>();

        miaLista.add(new Persona("Ludovico", "Einaudi", 67));
        miaLista.add(new Persona("Winston", "Churchill", 65));
        miaLista.add(new Persona("Stephen", "Hawking", 76));

        System.out.println(miaLista.size());
        System.out.println(miaLista.get(2));

        miaLista.remove(2);

        System.out.println("Stampa del contenuto della lista tramite ciclo for.");
        for (int i=0; i < miaLista.size(); i++) {
            System.out.println(miaLista.get(i));
        }

        System.out.println("Stampa del contenuto della lista tramite ciclo for migliorato.");
        for (Persona p : miaLista) {
            System.out.println(p);
        }

        miaLista.clear();
        System.out.println(miaLista.size());
    }
}
