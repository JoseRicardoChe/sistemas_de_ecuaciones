/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jpool
 */
public class mtPunto extends AbstractTableModel {

    private String[] columnas = {"Iteración", "Xo", "F(Xo) o Xi", "Error"};
    private ArrayList<csFilaPunto> lista;

    public mtPunto(ArrayList<csFilaPunto> lista) {
        this.lista = lista;
    }

    public mtPunto() {
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
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getXo();
            case 2:
                return this.lista.get(fila).getFxo();
            case 3:
                return this.lista.get(fila).getError();
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
