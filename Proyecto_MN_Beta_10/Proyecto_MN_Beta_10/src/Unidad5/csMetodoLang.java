package Unidad5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodoLang {

    double[] x;
    double[] fx;

    public ArrayList<csFilaLang> Lang(int f) {
        double[] x = new double[f];
        this.x = x;
        double[] fx = new double[f];
        this.fx = fx;

        ArrayList<csFilaLang> lista;
        int i = 0;
        lista = new ArrayList<csFilaLang>();

        //Ciclo
        for (int j = 0; j < f; j++) {
            double xx = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x" + j));
            x[i] = xx;
            double fxx = Double.parseDouble(JOptionPane.showInputDialog("Ingrese f(x" + j+")"));
            fx[i] = fxx;

            //Llenado de la tabla
            csFilaLang fila = new csFilaLang();
            fila.setI(i++);
            fila.setX(xx);
            fila.setFx(fxx);
            lista.add(fila);
        }
        return lista;
    }

    public double Polinomio(double ax, int n) {
        /* ax viene del parametro bx del método Calcular,
        mientras n obtiene sus valores del for de Calcular */

        double numerador = 1, denominador = 1; //Inicializar en 1 para poder acumular la multiplicacion

        for (int i = 0; i < x.length; i++) { //x.length será el máximo del ciclo

            if (i != n) { //Recordar que j ≠ i

                numerador = numerador * (ax - x[i]); //Numerador de la formula Li(x)
                denominador = denominador * (x[n] - x[i]); //Denominador de la formula Li(x)

            }
        }
        return numerador / denominador; //Retornar la correspondiente division de (X - Xj)/(Xi - Xj)
    }

    public double Calcular(double bx) { // bx  es el valor de X a calcular
        double y = 0;
        for (int i = 0; i < x.length; i++) {
            y = y + Polinomio(bx, i) * fx[i];
        }
        return y;
    }

}
