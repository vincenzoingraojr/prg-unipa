package prg.es08;

import prg.es08.Ciclomotore;
import prg.es08.Automobile;
import prg.es08.Bicicletta;

public class TestVeicolo {
    public static void main(String[] args) {
        Ciclomotore c1 = new Ciclomotore();
        Ciclomotore c2 = new Ciclomotore();
        Automobile a1 = new Automobile("A1");
        Automobile a2 = new Automobile("AG123JE", 2400);
        Bicicletta b1 = new Bicicletta(12.0, 1.2, "");
        Bicicletta b2 = new Bicicletta(1.2, 3.6, "Mountain bike");
        c1.setXIniziale(1.2);
        c1.setVelInizialeX(2.4);
        a1.setAccX(12.67);
        a1.setAccY(2.4);
        a2.setVelInizialeX(45.9);
        a2.setXIniziale(21.4);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);

        for (double i = 1; i <= 10; i += 0.10) {
            c1.muovi(i);
            c2.muovi(i);
            a1.muovi(i);
            a2.muovi(i);
            b1.muovi(i);
            b2.muovi(i);
        }
    }
}
