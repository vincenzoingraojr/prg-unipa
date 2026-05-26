package prg.es03;

import java.util.Arrays;

public class Calcolatrice {
    public double[] generaVettore(int l) {
        double[] vettore = new double[l];

        for (int i = 0; i < l; i++) {
            vettore[i] = Math.random() * 1000;
        }

        return vettore;
    }

    public double[] sommaVettori(double[] a, double[] b) {
        if (a.length == b.length) {
            double[] v = new double[a.length];

            for (int i = 0; i < a.length; i++) {
                v[i] = a[i] + b[i];
            }

            return v;
        } else {
            return a;
        }
    }

    public double[] concatenaVettori(double[] a, double[] b) {
        double[] v = new double[a.length + b.length];

        System.arraycopy(a, 0, v, 0, a.length);
        System.arraycopy(b, 0, v, a.length, b.length);

        return v;
    }

    public void stampaVettore(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public double[][] generaMatrice(int r, int c) {
        double[][] matrice = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrice[i][j] = Math.random() * 100;
            }
        }

        return matrice;
    }

    public double[][] sommaMatrici(double[][] a, double[][] b) {
        if (a.length == b.length && a[0].length == b[0].length) {
            double[][] m = new double[a.length][a[0].length];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    m[i][j] = a[i][j] + b[i][j];
                }
            }

            return m;
        } else {
            return a;
        }
    }

    public void stampaMatrice(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            
            System.out.println();
        }
    }
}
