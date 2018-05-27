package newton;

import java.lang.Math;
import java.io.*;
import javax.swing.JOptionPane;

public class Newton {

    public static void main(String args[]) {
        Newton Proyecto = new Newton();
        Proyecto.menu();	//solo se manda a llamar a menu desde aqui, ya que menu llama a los demas metodos posteriromente
    }

    public void MetodoInterNewton() {
        double a[][] = new double[5][2];
        double x, y, fx1x0, fx2x1, fx3x2, fx4x3, fx2x1x0, fx3x2x1, fx4x3x2, fx3x2x1x0, fx4x3x2x1, fx4x3x2x1x0;
        int i;
        JOptionPane.showMessageDialog(null, "INTERPOLACION DE DIFERENCIAS DE NEWTON P/ 5 PTOS");

        x = Double.parseDouble(JOptionPane.showInputDialog("valor a interpolar"));

        
        JOptionPane.showMessageDialog(null, "Dame los 5 pares de puntos");
        for (i = 0; i < 5; i++) {
            a[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Dame x " + i));
            a[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Dame f(x) " + i));

        }
        fx1x0 = (a[1][1] - a[0][1]) / (a[1][0] - a[0][0]);
        fx2x1 = (a[2][1] - a[1][1]) / (a[2][0] - a[1][0]);
        fx3x2 = (a[3][1] - a[2][1]) / (a[3][0] - a[2][0]);
        fx4x3 = (a[4][1] - a[3][1]) / (a[4][0] - a[3][0]);
        fx2x1x0 = (fx2x1 - fx1x0) / (a[2][0] - a[0][0]);
        fx3x2x1 = (fx3x2 - fx2x1) / (a[3][0] - a[1][0]);
        fx4x3x2 = (fx4x3 - fx3x2) / (a[4][0] - a[2][0]);
        fx3x2x1x0 = (fx3x2x1 - fx2x1x0) / (a[3][0] - a[0][0]);
        fx4x3x2x1 = (fx4x3x2 - fx3x2x1) / (a[3][0] - a[0][0]);
        fx4x3x2x1x0 = (fx4x3x2x1 - fx3x2x1x0) / (a[4][0] - a[0][0]);
        y = a[0][1] + fx1x0 * (x - a[0][0]) + fx2x1x0 * (x - a[0][0]) * (x - a[1][0]) + fx3x2x1x0 * (x - a[0][0]) * (x - a[1][0]) * (x - a[2][0]) + fx4x3x2x1x0 * (x - a[0][0]) * (x - a[1][0]) * (x - a[2][0]) * (x - a[3][0]);
        //System.out.println("f(x) en ese punto es: " + y);
        JOptionPane.showMessageDialog(null, "f(x) en ese punto es: " + y);
    }

    //para salir del programa
    public int Fuera() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("presiona 1 para reiniciar"));
        return p;
    }

    public void menu() {
        int a;
        int p = 0;
        do {

            MetodoInterNewton();
            p = Fuera();

        } while (p == 1);
    }
}
