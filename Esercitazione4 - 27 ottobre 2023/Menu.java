package prg.es04;

import java.util.ArrayList;
import java.util.Scanner;
import prg.es03.Persona;

public class Menu {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        ArrayList<Persona> listaPersone = new ArrayList<>();

        System.out.println("Benvenuta/o.");
        System.out.println("Menu, scegli una delle seguenti opzioni: ");
        System.out.println("a: inserire una nuova persona nella lista con dati inseriti dall’utente");
        System.out.println("b: cercare una persona nella lista in base al nome");
        System.out.println("c: stampare l’intera lista");
        System.out.println("d: cancellare l’intera lista");
        System.out.println("e: esci");

        while(!(stringa = scanner.next()).equals("e")) {
            switch (stringa) {
                case "a":
                    System.out.println("Inserisci il nome della persona: ");
                    String nome = scanner.next();

                    System.out.println("Inserisci il cognome della persona: ");
                    String cognome = scanner.next();

                    System.out.println("Inserisci l'eta\' della persona: ");
                    int eta = scanner.nextInt();

                    listaPersone.add(new Persona(nome, cognome, eta));

                    System.out.println("Persona aggiunta alla lista.");

                    break;

                case "b":
                    System.out.println("Per cercare la persona, inserisci il suo nome: ");
                    String nomeDaCercare = scanner.next();

                    for (int i = 0; i < listaPersone.size(); i++) {
                        if (listaPersone.get(i).nome.equals(nomeDaCercare)) {
                            System.out.println(listaPersone.get(i));
                        } else {
                            System.out.println("Persona non trovata.");
                        }
                    }

                    break;

                case "c":
                    System.out.println("Ecco la lista di persone: ");

                    for (Persona e : listaPersone) {
                        System.out.println(e);
                    }

                    break;
            
                case "d":
                    System.out.println("Hai scelto di cancellare l'intera lista.");
                    
                    listaPersone.clear();

                    System.out.println("Ora la lista ha la seguente dimensione: " + listaPersone.size() + ".");

                    break;

                default:
                    break;
            }
        }
    }
}
