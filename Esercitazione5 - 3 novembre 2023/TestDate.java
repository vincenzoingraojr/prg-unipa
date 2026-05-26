package prg.es05;

import prg.es05.Date;

public class TestDate {
    public static void main(String args[]) {
        Date d1 = new Date(243, 2021);
        Date d2 = new Date(12, 2, 2023);
        Date d3 = new Date(24, "January", 2024);
   
        System.out.println(d1.print1());
        System.out.println(d1.print2());
        System.out.println(d1.print3());

        System.out.println();

        System.out.println(d2.print1());
        System.out.println(d2.print2());
        System.out.println(d2.print3());

        System.out.println();

        System.out.println(d3.print1());
        System.out.println(d3.print2());
        System.out.println(d3.print3());
    }
}
