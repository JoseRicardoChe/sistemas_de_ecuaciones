
package Unidad2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class mtSecante extends AbstractTableModel {

    private String[] columnas = {"Iteración", "Xi-1", "Xi", "F(Xi-1)", "(Xi-1)-(Xi)", "F(Xi)", "F(Xi)*[(Xi-1)-(Xi)]", "[F(Xi-1)]-[F(Xi)]", "Raiz", "Error"};
    private ArrayList<csFilaSecante> lista;

    public mtSecante(ArrayList<csFilaSecante> lista) {
        this.lista = lista;
    }

    public mtSecante() {
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (columna) {
            case 0:
                return this.lista.get(fila).getIt();
            case 1:
                return this.lista.get(fila).getA();
            case 2:
                return this.lista.get(fila).getB();
            case 3:
                return this.lista.get(fila).getC();
            case 4:
                return this.lista.get(fila).getD();
            case 5:
                return this.lista.get(fila).getE();
            case 6:
                return this.lista.get(fila).getF();
            case 7:
                return this.lista.get(fila).getG();
            case 8:
                return this.lista.get(fila).getH();
            case 9:
                return this.lista.get(fila).getI();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.columnas[i];
    }

}
