package Unidad2;

/* @author Edward emanuel un*/
import javax.swing.table.AbstractTableModel;

public class ModeloJacobi extends AbstractTableModel{ 
private int filas,columnas;
    private String cabecera[];
    private double matriz[][];

    public ModeloJacobi(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.cabecera = new String[columnas];
         for(int col=0;col<this.columnas;col++){
            this.cabecera[col]="X"+(col+1);
        }
         this.matriz=new double[this.filas][this.columnas];
         
         
         
    }

  ModeloJacobi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
   
        return this.cabecera[i];
       // return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    @Override
    public int getRowCount() {
        return this.filas;
        
    }

    @Override
    public int getColumnCount() {
        return this.cabecera.length;
       
    }

    @Override
    public Object getValueAt(int row, int col) {
        return this.matriz[row][col];
    }

    @Override
    public void setValueAt(Object o, int row, int col) {
        this.matriz[row][col]=Double.parseDouble((String)o);
       // super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double [][] getMatriz(){
        return this.getMatriz();
    }

    @Override
    public void fireTableCellUpdated(int row, int column) {
        super.fireTableCellUpdated(row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
}
