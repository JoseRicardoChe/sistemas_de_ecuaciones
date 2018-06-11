
package Unidad2;

import javax.swing.JOptionPane;
import javax.swing.JTable;


public class modificartablaJacobi {
    
   //elegir solo una celda
   public void mostrar(JTable tabla){
       int i=tabla.getEditingRow();
       
       
        if (i==-1) {
           JOptionPane.showMessageDialog(tabla, "elije una selda");
           
       }else{
           double celda1=(double)tabla.getValueAt(i, 0);
           double celda2=(double)tabla.getValueAt(i, 1);
           System.out.println(""+celda1+""+celda2);
        }
   }
   
   //recibe el valor entero en la 
     public void motrartabla(JTable tabla, double filas, double columnas){
         String dato="";
         for (int i = 0; i < columnas; i++) {
             for (int j = 0; j < filas; j++) {
                 dato+=tabla.getValueAt(i, j)+"|";
                 System.out.println(""+tabla.getValueAt(i,j)); 
             }
             dato+="\n";
             
         }
         System.out.println(""+dato);
 
   }
    
}

