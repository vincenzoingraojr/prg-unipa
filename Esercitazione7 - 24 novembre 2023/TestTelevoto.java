package prg.es07;

import prg.es07.Televoto;

public class TestTelevoto {
    public static void main(String[] args) {
        Televoto tv = new Televoto();
        tv.vediListaCantanti();
        tv.vota("3312768796", 1);
        tv.vota("3312768796", 1);
        tv.vota("3312768796", 3);
        tv.vota("3217291924", 3);
        tv.vota("3217291924", 3);
        tv.vota("3217291924", 6);
        tv.vediClassifica();
    }
}
