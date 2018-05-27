package Unidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodosPunto {

    public ArrayList<csFilaPunto> Punto(double xo, double errorDeseado, int iteraciones) {

        //double fxi = this.funcion2(xo);
        double errorCalculado = 1;
        //double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaPunto> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaPunto>();
        while (i <= iteraciones && errorCalculado > errorDeseado) {
            csFilaPunto fila = new csFilaPunto();
            fila.setI(i); //Asignar contador a primera columna titulo
            fila.setXo(xo); //Asignar el parametro del metodo a Xo
            fila.setFxo(this.funcion2(fila.getXo()));
            //xanterior = fxi; //Clonar el calculo de Fxi a xanterior
            xo = fila.getFxo(); //Darle el nuevo valor de          
            if (i > 1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((this.funcion2(fila.getXo()) - fila.getXo()) / this.funcion2(fila.getXo()));
                fila.setError(errorCalculado);
            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        if (errorCalculado > errorDeseado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz que sea igual o menor a " + errorDeseado);
        }else {
            JOptionPane.showMessageDialog(null, "Se ha encontrado una raiz igual o menor a " + errorDeseado);
        }
        return lista;
    }

    ///////////////////////////////////////////////////////////////
    public double funcion2(double x) {
        //Math.E es la funcion de Euler
        return Math.pow(Math.E, -x);
    }
    ///////////////////////////////////////////////////////////////

}
