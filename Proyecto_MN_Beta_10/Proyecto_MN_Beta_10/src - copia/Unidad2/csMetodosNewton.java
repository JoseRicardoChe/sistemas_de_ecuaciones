package Unidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodosNewton {

    /////////////////////////////////////////////////////////////////////////
    public ArrayList<csFilaNewton> Newton(double xo, double errorDeseado) {

        //double fxo = this.funNormal(xo);
        //double fxdo = this.funDerivado(xo);
        double errorCalculado = 1;
        double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaNewton> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaNewton>();
        while (errorCalculado > errorDeseado) {
            csFilaNewton fila = new csFilaNewton();
            fila.setI(i); //Asignar contador a primera columna titulo
            fila.setXo(xo); //Asignar el parametro del metodo a Xo
            double fxo = this.funNormal(fila.getXo());
            double fxdo = this.funDerivado(fila.getXo());
            fila.setFxo(fxo); //Asignar la funcion normal
            fila.setFxdo(fxdo); //Asignar la funcion derivada
            fila.setXimas(fila.getXo() - (fxo / fxdo)); //Asignar la division de F(x)/F´(x)
            xanterior = fila.getXo(); //Clonar el calculo de Fxi a xanterior
            xo = fila.getXimas(); //Darle el nuevo valor de          
            if (i > -1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((fila.getXimas() - fila.getXo()) / fila.getXimas());
                fila.setError(errorCalculado);

            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        /*if (errorCalculado < errorDeseado) {
            return lista;
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz que sea igual o menor a " + errorDeseado);
            return null;
        }*/
        if (errorCalculado > errorDeseado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz que sea igual o menor a " + errorDeseado);
        } else {
            JOptionPane.showMessageDialog(null, "Se ha encontrado una raiz igual o menor a " + errorDeseado);
        }
        return lista;

    }
    //////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////
    public double funNormal(double x) {
        //Funcion SIN derivar
        return Math.pow(Math.E, -x) - x;
    }

    public double funDerivado(double x) {
        //Funcion DERIVADO
        return -Math.pow(Math.E, -x) - 1;
    }

}
