package Unidad5;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mtLang extends AbstractTableModel {

    private String[] columnas = {"i", "x", "y"};
    private ArrayList<csFilaLang> lista;

    public mtLang(ArrayList<csFilaLang> lista) {
        this.lista = lista;
    }

    public mtLang() {

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
                return this.lista.get(fila).getX();
            case 2:
                return this.lista.get(fila).getFx();
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
