package newton;

import java.lang.Math;
import java.io.*;
import javax.swing.JOptionPane;

public class Lagrange {

    public void MetodoInterLagrange() {
        int n, i;
        double x, y;
        double a[][] = new double[4][2];
        System.out.println("\t\t\t\"METODO DE INTERPOLACION LAGRANGE  2-4 PTOS.\"");
        do {
            System.out.println("Dame el numero de puntos");
            n = leeint();
        } while (n < 2 || n > 4);
        System.out.println("Dame los  pares de puntos");
        for (i = 0; i < n; i++) {
            System.out.println("Dame x " + i);
            a[i][0] = lee();
            System.out.println("Dame f(x) " + i);
            a[i][1] = lee();
        }
        System.out.println("Dame el valor a interpolar ");
        x = lee();
        switch (n) {
            case 2:
                y = (((((x - a[1][0]) * a[0][1]) / (a[0][0] - a[1][0])) + (((x - a[0][0]) * a[1][1]) / (a[1][0] - a[0][0]))));
                System.out.println("f(x) en ese punto es: " + y);
                break;
            case 3:
                y = ((x - a[1][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0])) + ((x - a[0][0]) * (x - a[2][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0])) + ((x - a[1][0]) * ((x - a[0][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0])));
                System.out.println("f(x) en ese punto es: " + y);
                break;
            case 4:
                y = ((x - a[1][0]) * (x - a[3][0]) * (x - a[2][0]) * a[0][1]) / ((a[0][0] - a[1][0]) * (a[0][0] - a[2][0]) * (a[0][0] - a[3][0])) + ((x - a[0][0]) * (x - a[2][0]) * (x - a[3][0]) * a[1][1]) / ((a[1][0] - a[0][0]) * (a[1][0] - a[2][0]) * (a[1][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[3][0]) * a[2][1]) / ((a[2][0] - a[0][0]) * (a[2][0] - a[1][0]) * (a[2][0] - a[3][0])) + ((x - a[0][0]) * (x - a[1][0]) * ((x - a[2][0]) * a[3][1]) / ((a[3][0] - a[0][0]) * (a[3][0] - a[1][0]) * (a[3][0] - a[2][0]))));
                System.out.println("f(x) en ese punto es: " + y);
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
    }

    public double lee() {
        double num;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdato;
            sdato = br.readLine();
            num = Double.parseDouble(sdato);
        } catch (IOException ioe) {
            num = 0.0;
        }
        return num;
    }

    public int leeint() {
        int num;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String sdato;
            sdato = br.readLine();
            num = Integer.parseInt(sdato);
        } catch (IOException ioe) {
            num = 0;
        }
        return num;
    }
}
