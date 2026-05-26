package prg.es05;

import prg.es05.Studente;
import prg.es05.Date;

public class ProvaStudente {
    public static void main(String args[]) {
        Date d1 = new Date(24, 1, 2002);
        Studente s1 = new Studente("Vincenzo", "Ingrao", d1, 763227);

        Date d2 = new Date(13, 11, 2002);
        Studente s2 = new Studente("Marco", "Chiari", d2, 734224);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
