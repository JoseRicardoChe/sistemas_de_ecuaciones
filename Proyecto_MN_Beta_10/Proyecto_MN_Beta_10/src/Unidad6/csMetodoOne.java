package Unidad6;

import java.util.ArrayList;

public class csMetodoOne {

    public ArrayList<csFilaOne> One(double y, double x1, double x2, int it, String equation) {
        //Copia de todos los parametros de entrada
        double copyY = y;
        double copyX1 = x1; //a 0
        double copyX2 = x2; //b 4
        double copyIt = it; //iteracion

        //Calcular h
        double h = (copyX2 - copyX1) / copyIt;
        ArrayList<csFilaOne> lista;

        //Contador i++
        int c = 0;
        lista = new ArrayList<csFilaOne>();

        for (int i = 0; i < (copyIt + 1); i++) {
            csFilaOne fila = new csFilaOne();
            fila.setI(c++); //Asigna los numeros del contador desde 0 hasta copyIt
            if (i == 0) {
                fila.setX(copyX1); //Desde la vuelta 0 asigna lo que vale copyX1
            } else {
                fila.setX(copyX1 + h); //Posteriormente asigna la suma de copyX1 + h 
            }
            copyX1 = fila.getX(); //Reasignar un nuevo valor a copyX1 que es X
            fila.setFx(copyY + h * this.Equation(fila.getX(), equation)); //Asignar el resultado de copyY + h por la ecuacion llamado equation
            copyY = fila.getFx();
            lista.add(fila);
        }
        return lista;
    }

    public double Equation(double x, String eq) {
        InterpretarEcuacion v = new InterpretarEcuacion();
        return v.interprete(x, eq);
        //return -2 * Math.pow(x, 3) + 12 * Math.pow(x, 2) - 20 * x + 8.5;
    }
}
