package Unidad3;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/* @author Edward emanuel un */
public class mtSeidel2 extends AbstractTableModel {

    csMetodoSeidel a = new csMetodoSeidel();

    private String[] columna = {"X1", "X2", "X3", "X4"};
    private ArrayList<csFilaSeidel> lista;

    public mtSeidel2(ArrayList<csFilaSeidel> lista) {
        this.lista = lista;
    }

    public mtSeidel2() {

    }
    
    @Override
    public int getRowCount() {
       return this.lista.size();
    }

    @Override
    public int getColumnCount() {
    return this.columna.length;
    }

    @Override
    public Object getValueAt(int fi, int columnas) {
        switch (columnas) {
            case 0:
                return this.lista.get(fi).getRestX1();
            case 1:
                return this.lista.get(fi).getRestX2();
            case 2:
                return this.lista.get(fi).getRestX3();
            case 3:
                return this.lista.get(fi).getRestX4();
            default:
                return null;

        }
    }

    public String getColumnName(int i) {
        return this.columna[i];
    }

}
