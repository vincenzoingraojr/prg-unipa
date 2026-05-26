package prg.es05;

import prg.es05.Persona;

public class TestPersona {
    public static void main(String args[]) {
        Persona p1 = new Persona("Winston", "Churchill", 65);
        Persona p2 = new Persona();

        p2.setNome("Stephen");
        p2.setCognome("Hawking");
        p2.setEta(72);

        System.out.println(p1);
        System.out.println(p2);
    }
}
