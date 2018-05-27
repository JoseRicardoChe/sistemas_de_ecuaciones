
package Unidad5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodo {
    double[] x;
    double[] fx;
    double[] g;
    public ArrayList<csFila> Lang() {
       double[] x = new double[5];
        this.x = x;
        double[] fx = new double[5];
        this.fx = fx;

        ArrayList<csFila> lista;
        int i = 0;
        lista = new ArrayList<csFila>();

        //Ciclo
        for (int j = 0; j < 5; j++) {
            double xx = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x" + j));
            x[i] = xx;
            
            double fxx = Double.parseDouble(JOptionPane.showInputDialog("Ingrese f(x" + j+")"));
            fx[i] = fxx;

            //Llenado de la tabla
            csFila fila = new csFila();
            fila.setI(i++);
            fila.setX(xx);
            fila.setFx(fxx);
            lista.add(fila);
        }
         
        return lista;
    }
    private static double[] b;
    private static boolean[][] yaCalculado;     // Â¿El valor ya fue calculado?
    private static double[][] calculoPrevio;    // Valor previamente calculado
    

    public double[] solucionar(double[] x, double[] fx) {
        int n = x.length;
        b = new double[n];
        yaCalculado = new boolean[n][n];
        calculoPrevio = new double[n][n];
        
        b[0] = fx[0];
        diferenciasDivididas(x.length-1, 0);
        return b;
    }

    public double diferenciasDivididas(int i, int k) {
        if (i == k) return fx[i];
        double f1 = 0;
        if (yaCalculado[i-1][k]) {
            f1 = calculoPrevio[i-1][k];
        } else {
            f1 = diferenciasDivididas(i-1, k);
        }
        double f2 = 0;
        if (yaCalculado[i][k+1]) {
            f2 = calculoPrevio[i][k+1];
        } else {
            f2 = diferenciasDivididas(i, k+1);
        }
        double dd = (f1 - f2) / (x[k] - x[i]);
        yaCalculado[i][k] = true;
        calculoPrevio[i][k] = dd;
        if (k == 0)     // b[i] = f[i,0]
            b[i] = dd;
        return dd;
    }

    public double calcularValor(double n, double[]g, double[]x) {
        double res = 0;
        for (int i = 0; i < g.length; i++) {
            double acum = g[i];
            for (int j = 0; j < i; j++)
                acum *=  (n - x[j]);
            res += acum;
        }
        return res;
    }
}
