package others;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodoLagrange {

    public ArrayList<csFilaLagrange> Jacobi(double x1, double x2, double x3, double x4, double errorDeseado) {
        double AnteriorX1 = x1;
        double AnteriorX2 = x2;
        double AnteriorX3 = x3;
        double AnteriorX4 = x4;
        double Error;

        ArrayList<csFilaLagrange> lista;
        int i = 1;
        lista = new ArrayList<csFilaLagrange>();
        csFilaLagrange filas = new csFilaLagrange();
        for (int j = 0; j < 2; j++) {
            csFilaLagrange fila = new csFilaLagrange();
            fila.setX1(this.forx1(AnteriorX2, AnteriorX3));
            fila.setX2(this.forx2(AnteriorX1, AnteriorX3, AnteriorX4));
            fila.setX3(this.forx3(AnteriorX1, AnteriorX2, AnteriorX4));
            fila.setX4(this.forx4(AnteriorX2, AnteriorX3));

            AnteriorX1 = fila.getX1();
            AnteriorX2 = fila.getX2();
            AnteriorX3 = fila.getX3();
            AnteriorX4 = fila.getX4();

            lista.add(fila);
            fila.setK(i++);
        }

        double ErrorX1, ErrorX2, ErrorX3, ErrorX4;
        ErrorX1 = Math.abs(filas.getX1() - AnteriorX1);
        ErrorX2 = Math.abs(filas.getX2() - AnteriorX2);
        ErrorX3 = Math.abs(filas.getX3() - AnteriorX3);
        ErrorX4 = Math.abs(filas.getX4() - AnteriorX4);

        double maxi = Math.max(Math.max(Math.max(ErrorX1, ErrorX2), ErrorX3), ErrorX4);
        //b = Math.max(Math.max(Math.max(fila.getX1(), fila.getX2()), fila.getX3()), fila.getX4());
        System.out.println(maxi);

        /*if (Error/b > errorDeseado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz que sea igual o menor a " + errorDeseado);
        } else {
            JOptionPane.showMessageDialog(null, "Se ha encontrado una raiz igual o menor a " + errorDeseado);
        }*/
        //System.out.println("x1: " + x1);
        return lista;
    }

    public double forx1(double X2, double X3) {
        //Primera formula
        return (6 + X2 - 2 * X3) / 10;
    }

    public double forx2(double X1, double X3, double X4) {
        //Primera formula
        return (25 + X1 * X3 - 3 * X4) / 11;
    }

    public double forx3(double X1, double X2, double X4) {
        //Primera formula
        return (-11 - 2 * X1 + X2 + X4) / 10;
    }

    public double forx4(double X2, double X3) {
        //Primera formula
        return (15 - 3 * X2 + 3 * X3) / 8;
    }

}
