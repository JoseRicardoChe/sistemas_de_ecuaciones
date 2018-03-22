package Unidad3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodoFijo {

    public ArrayList<csFilaFijo> Punto(double x1, double x2, double x3, double errorDeseado) {
        double AnteriorX1 = x1;
        double AnteriorX2 = x2;
        double AnteriorX3 = x3;

        double Error;
        ArrayList<csFilaFijo> lista;
        int i = 1;
        lista = new ArrayList<csFilaFijo>();
        do {
            csFilaFijo fila = new csFilaFijo();
            fila.setX1(this.forx1(AnteriorX2, AnteriorX3));
            fila.setX2(this.forx2(AnteriorX1, AnteriorX3));
            fila.setX3(this.forx3(AnteriorX1, AnteriorX2));

            double ErrorX1, ErrorX2, ErrorX3;
            ErrorX1 = Math.abs(fila.getX1() - AnteriorX1);
            ErrorX2 = Math.abs(fila.getX2() - AnteriorX2);
            ErrorX3 = Math.abs(fila.getX3() - AnteriorX3);

            fila.setError(Math.max(Math.max(ErrorX1, ErrorX2), ErrorX3));
            Error = fila.getError();

            AnteriorX1 = fila.getX1();
            AnteriorX2 = fila.getX2();
            AnteriorX3 = fila.getX3();

            lista.add(fila);
            fila.setIte(i++);
        } while (Error > errorDeseado);
        if (Error > errorDeseado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz que sea igual o menor a " + errorDeseado);
        } else {
            JOptionPane.showMessageDialog(null, "Se ha encontrado una raiz igual o menor a " + errorDeseado);
        }
        return lista;
    }

    public double forx1(double X2, double X3) {
        //Primera formula
        return (Math.cos(X2 * X3) / 3) + +0.1666666667;
    }

    public double forx2(double X1, Double X3) {
        //Segunda formula
        return 0.1111111111 * Math.sqrt(Math.sin(X3) + Math.pow(X1, 2) + 1.06) - 0.1;
    }

    public double forx3(double X1, double X2) {
        //Tercera formula
        return -Math.pow(Math.E, -X1 * X2) / 20 - (10 * Math.PI - 3) / 60;
    }
}
