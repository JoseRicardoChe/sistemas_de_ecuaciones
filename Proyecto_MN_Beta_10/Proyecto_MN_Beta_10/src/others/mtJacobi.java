package others;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mtJacobi extends AbstractTableModel {

    private String[] columnas = {"K", "X1", "X2", "X3", "X4", "Error"};
    private ArrayList<csFilaLagrange> lista;

    public mtJacobi(ArrayList<csFilaLagrange> lista) {
        this.lista = lista;
    }

    public mtJacobi() {

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
                return this.lista.get(fila).getK();
            case 1:
                return this.lista.get(fila).getX1();
            case 2:
                return this.lista.get(fila).getX2();
            case 3:
                return this.lista.get(fila).getX3();
            case 4:
                return this.lista.get(fila).getX4();
            case 5:
                return this.lista.get(fila).getE();
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
