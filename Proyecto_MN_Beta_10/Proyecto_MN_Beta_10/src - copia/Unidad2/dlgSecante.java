package Unidad2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class dlgSecante extends javax.swing.JDialog {
    
    /**
     * Creates new form dlgBiseccion
     * @param parent
     * @param modal
     */
    public dlgSecante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbXi = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lbXi1 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSecante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Método Secante");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de entrada"));

        lbXi.setText("X0");

        lbError.setText("Error");

        txtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX1KeyTyped(evt);
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

        lbXi1.setText("X1");

        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbXi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbXi1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(lbError)
                .addGap(47, 47, 47)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Limpiar)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbXi)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbXi1)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbError)
                            .addComponent(txtError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Limpiar))
                        .addGap(32, 32, 32))))
        );

        tbSecante.setBackground(new java.awt.Color(204, 255, 204));
        tbSecante.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbSecante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
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
       //mensaje de error cuando el usuario inserte mas de dos puntos
        try{
        double x1 = Double.parseDouble(this.txtX1.getText().trim());
        double x2 = Double.parseDouble(this.txtX2.getText().trim());
        double error = Double.parseDouble(this.txtError.getText().trim());
        //int iteraciones = Integer.parseInt(this.txtIteracion.getText().trim());

        csMetodosSecante sc = new csMetodosSecante();
        //ArrayList<csFilaSecante> l = sc.Secante(x1, x2, error, iteraciones);

        ArrayList<csFilaSecante> l = sc.Secante(x1, x2, error);

        mtSecante  sct = new mtSecante (l);
        //mtPunto m = new mtPunto();
        this.tbSecante.setModel(sct);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido: " + e.getMessage());
        }

    }//GEN-LAST:event_btCalcularActionPerformed

     public void LimpiarJTextFields() {
        txtX1.setText("");
        txtX2.setText("");
        txtError.setText("");
        //txtIteracion.setText("");
       
    }
    
    private void txtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyTyped
       //error permite numero decimales tanto enteros y no permite letras
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
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

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        //error permite numero decimales tanto enteros y no permite letras
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtX2KeyTyped

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarJTextFields();
    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgSecante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                dlgSecante dialog = new dlgSecante(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lbXi;
    private javax.swing.JLabel lbXi1;
    private javax.swing.JTable tbSecante;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables
}
