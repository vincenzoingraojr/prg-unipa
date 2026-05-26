package prg.es03;

import prg.es03.Persona;

public class Principale {
    public static void main(String args[]) {
        Persona persona1 = new Persona("Winston", "Churchill", 65);
        Persona persona2 = new Persona();

        persona2.nome = "Stephen";
        persona2.cognome = "Hawking";
        persona2.eta = 67;

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        Persona persona3 = persona1;

        if (persona1.equals(persona3)) {
            System.out.println("Vero: persona1 e persona3 sono la stessa persona.");
        } else {
            System.out.println("Falso: persona1 e persona3 non sono la stessa persona.");
        }

        persona3.nome = "Ludovico";
        persona3.cognome = "Einaudi";
        persona3.eta = 67;

        System.out.println(persona1.toString());

        System.out.println("Dato che persona3 punta a persona1, modificando persona3 modifichiamo direttamente persona1.");
    }
}
