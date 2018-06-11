package Unidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Edward emanuel un
 */
public class csmetodosJacocobi {

    public void recibe_tabla(JTable tabla) {
        modificartablaJacobi t = new modificartablaJacobi();
        t.mostrar(tabla);
    }
    
    //para mostrar la tabla 

    public void motrartabla(JTable tabla, int columnas, int filas) {
        modificartablaJacobi t = new modificartablaJacobi();
        t.motrartabla(tabla, filas, columnas);
    }
}
