package Unidad3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class dlgFijo extends javax.swing.JDialog {

    /**
     * Creates new form dlgBiseccion
     *
     * @param parent
     * @param modal
     */
    public dlgFijo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbVector = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        txtX2 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPunto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Método Punto Fijo");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de entrada"));

        lbVector.setText("Vector");

        lbError.setText("Error");

        txtX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX1ActionPerformed(evt);
            }
        });
        txtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX1KeyTyped(evt);
            }
        });

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

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        txtX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX2ActionPerformed(evt);
            }
        });
        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });

        txtX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX3ActionPerformed(evt);
            }
        });
        txtX3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVector)
                    .addComponent(lbError))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Limpiar)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVector)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Limpiar))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbError)
                            .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tbPunto.setBackground(new java.awt.Color(153, 255, 204));
        tbPunto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbPunto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        //try es para mensaje cuando pones mas de 2 puntos o mas
        try {
            double x1 = Double.parseDouble(this.txtX1.getText().trim());
            double x2 = Double.parseDouble(this.txtX2.getText().trim());
            double x3 = Double.parseDouble(this.txtX3.getText().trim());
            double er = Double.parseDouble(this.txtError.getText().trim());
            //int it = Integer.parseInt(this.txtIteracion.getText().trim());

            csMetodoFijo met = new csMetodoFijo();
            ArrayList<csFilaFijo> o = met.Punto(x1, x2, x3, er);
            mtFijo m = new mtFijo(o);
            this.tbPunto.setModel(m);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido: " + e.getMessage());
        }

    }//GEN-LAST:event_btCalcularActionPerformed

    public void LimpiarJTextFields() {
        txtX1.setText("");
        txtError.setText("");
        //txtIteracion.setText("");

    }

    private void txtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyTyped
        //error permite numero decimales tanto enteros y no permite letras
        if ((int) evt.getKeyChar() != 45 && (int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtX1KeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        //error permite numero decimales tanto enteros y no permite letras
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtErrorKeyTyped

    private void txtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrorActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarJTextFields();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX1ActionPerformed

    private void txtX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX2ActionPerformed

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX2KeyTyped

    private void txtX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX3ActionPerformed

    private void txtX3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX3KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgFijo dialog = new dlgFijo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btCalcular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbVector;
    private javax.swing.JTable tbPunto;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    // End of variables declaration//GEN-END:variables

}
