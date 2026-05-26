package prg.es05;

import java.util.ArrayList;
import java.util.Arrays;

public class Date {
    private int day, month, year;
    private final int[] days = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
    private ArrayList<String> months = new ArrayList<String>();
    {
        months.addAll(Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"));
    };

    public Date() {
        System.out.println("Object Date properly created.");
    }

    public Date(int d, int y) {
        this.setDayAndMonthFromNumber(d);
        this.setYear(y);
    }

    public Date(int d, int m, int y) {
        this.setDay(d);
        this.setMonth(m);
        this.setYear(y);
    }

    public Date(int d, String m, int y) {
        this.setDay(d);
        this.setMonthFromString(m);
        this.setYear(y);
    }

    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        }
    }

    public void setMonth(int m) {
        if (m >= 1 && m <= 12) {
            this.month = m;
        }
    }

    public void setDayAndMonthFromNumber(int d) {
        if (d >= 1 && d <= 365) {
            for (int i = 0; i < days.length; i++) {
                if (i == 0 && d >= 1 && d <= days[i]) {
                    this.setDay(d);
                    setMonth(i + 1);
                }
                if (i > 0 && d > days[i - 1] && d <= days[i]) {
                    this.setDay(d - days[i - 1]);
                    this.setMonth(i + 1);
                }
            }
        }
    }

    public void setMonthFromString(String m) {
        for (int i = 0; i < months.size(); i++) {
            if (m.toLowerCase().equals(months.get(i))) {
                this.month = i + 1;
            }
        }
    }

    public void setYear(int y) {
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String print1() {
        int displayDay = 0;

        if (month - 1 == 0) {
            displayDay = day;
        } else {
            displayDay = day + days[month - 2];
        }

        return displayDay + " " + year;
    }

    public String print2() {
        return day + "/" + month + "/" + year;
    }

    public String print3() {
        return day + " " + months.get(month - 1) + " " + year;
    }

    public String toString() {
        return this.print3();
    }

    public boolean equals(Date d) {
        if (day == d.getDay() && month == d.getMonth() && year == d.getYear()) {
            return true;
        } else {
            return false;
        }
    }
}
