package Unidad3;

import Unidad2.frmPrincipal;
import others.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/* @author Eduardo Emanuel Un suaste */
public class dlgGaussSeidel extends javax.swing.JFrame {

    /**
     * Creates new form dlgJacobi
     */
    public dlgGaussSeidel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaNew = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtErrorCalculado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Método de Gaus Seidel");

        jLabel1.setText("X(0)");

        txtX0.setText("0");
        txtX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX0ActionPerformed(evt);
            }
        });
        txtX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX0KeyTyped(evt);
            }
        });

        jLabel3.setText("Error deseado");

        txtError.setText("0.001");
        txtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrorActionPerformed(evt);
            }
        });
        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });

        jtTablaNew.setBackground(new java.awt.Color(0, 0, 0));
        jtTablaNew.setForeground(new java.awt.Color(102, 255, 0));
        jtTablaNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtTablaNew);

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla1.setBackground(new java.awt.Color(0, 0, 0));
        Tabla1.setForeground(new java.awt.Color(102, 255, 0));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jLabel2.setText("Resta de Xk - Xk-1");

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Error Calculado");

        txtErrorCalculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrorCalculadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtErrorCalculado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(Limpiar)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtErrorCalculado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(Limpiar)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int col;
    private void txtX0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX0ActionPerformed

    }//GEN-LAST:event_txtX0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
        double er = Double.parseDouble(this.txtError.getText().trim());
        double x = Double.parseDouble(this.txtX0.getText().trim());

        csMetodoSeidel me = new csMetodoSeidel();
        //TABLA 1
        ArrayList<csFilaSeidel> o = me.Seidel(x, x, x, x, er);
        mtSeidel m = new mtSeidel(o);
        this.jtTablaNew.setModel(m);
        //TABLA 2
        ArrayList<csFilaSeidel> E = me.Seidel(x, x, x, x, er);
        mtSeidel2 n = new mtSeidel2(E);
        this.Tabla1.setModel(n);

        /*ArrayList<csFilaJacobi> e=me.Jacobi(er);
        mtjacobi2 n=new mtjacobi2(e);
        this.Tabla1.setModel(n);*/
        // csFilaSeidel s = new csFilaSeidel();
        // this.txtErrorRest.setText(Double.toString(s.getError()));
        this.txtErrorCalculado.setText(me.e());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void LimpiarJTextFields() {
        txtError.setText("");
        txtX0.setText("");
        txtErrorCalculado.setText("");
        //txtIteracion.setText("");

    }
    private void txtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrorActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarJTextFields();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtX0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX0KeyTyped
        if ((int) evt.getKeyChar() != 45 && (int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtX0KeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtErrorKeyTyped

    private void txtErrorCalculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorCalculadoActionPerformed

    }//GEN-LAST:event_txtErrorCalculadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dlgGaussSeidel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtTablaNew;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtErrorCalculado;
    private javax.swing.JTextField txtX0;
    // End of variables declaration//GEN-END:variables
}
