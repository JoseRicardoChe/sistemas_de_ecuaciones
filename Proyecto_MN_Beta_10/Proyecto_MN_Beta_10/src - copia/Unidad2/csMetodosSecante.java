package Unidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class csMetodosSecante {

    public ArrayList<csFilaSecante> Secante(double x1, double x2, double errorDeseado) {

        double errorI = 1;
        //double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaSecante> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaSecante>();
        //i < iteraciones && 
        while (errorI > errorDeseado) {
            csFilaSecante fila = new csFilaSecante();
            fila.setIt(i); //Asignar contador a primera columna titulo
            fila.setA(x1);
            fila.setB(x2);
            double funC = this.funNormal(fila.getA());
            fila.setC(funC);
            double restD = fila.getA() - fila.getB();
            fila.setD(restD);
            double funE = this.funNormal(fila.getB());
            fila.setE(funE);
            double ProdF = fila.getE() * fila.getD();
            fila.setF(ProdF);
            double restG = fila.getC() - fila.getE();
            fila.setG(restG);
            double raizH = fila.getB() - fila.getF() / fila.getG();
            fila.setH(raizH);

            errorI = Math.abs((fila.getH() - fila.getB()) / fila.getH());
            fila.setI(errorI);

            //Intercambios ACTUALIZAR
            // Xi-1 igual a Xi
            x1 = fila.getB();

            //Xi igual a F(Xi)*[(Xi-1)-(Xi)]
            x2 = fila.getH();
            lista.add(fila);
            i++;
        }
        /*if (errorI > errorDeseado) {
            return lista;
        } else {
            return null;
        }*/

        if (errorI > errorDeseado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado una raiz");
        } else {
            JOptionPane.showMessageDialog(null, "Se ha encontrado una raiz");
        }
        return lista;
    }
    //////////////////////////////////////////////////////////////////////////

    public double funNormal(double x) {
        //Formula de la diapositiva
        return Math.pow(Math.E, -Math.pow(x, 2)) - x;
    }
}
