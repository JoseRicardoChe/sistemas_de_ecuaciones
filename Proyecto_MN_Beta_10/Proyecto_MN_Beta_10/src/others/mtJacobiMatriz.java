package others;

import javax.swing.table.AbstractTableModel;

public class mtJacobiMatriz extends AbstractTableModel {

    private final int fila;
    private final int columna;
    private final String cabezera[];
    private final double matriz[][];

    public mtJacobiMatriz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.cabezera = new String[columna];
        for (int col = 0; col < this.columna; col++) {
            this.cabezera[col] = "X" + (col + 1);
        }
        matriz = new double[fila][columna];
    }

    @Override
    public String getColumnName(int i) {
        return this.cabezera[i];
    }

    @Override
    public int getRowCount() {
        return this.fila;
    }

    @Override
    public int getColumnCount() {
        return this.cabezera.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return this.matriz[row][col];
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        this.matriz[row][col] = Double.parseDouble((String) o);
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

}
