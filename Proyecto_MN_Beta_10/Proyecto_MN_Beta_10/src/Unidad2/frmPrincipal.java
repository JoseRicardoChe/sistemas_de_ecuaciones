package Unidad2;

import Unidad3.dlgFijo;
import Unidad3.dlgGaussSeidel;
import Unidad3.dlgJacobi;
import Unidad4.dlgTrapecio;
import Unidad4.dlgTercio;
import Unidad5.dlgNew;
import Unidad5.dlgLang;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btSalir = new javax.swing.JButton();
        mnbPestanas = new javax.swing.JMenuBar();
        mnOpciones = new javax.swing.JMenu();
        smnuPuntoFijo = new javax.swing.JMenuItem();
        smnuNewton = new javax.swing.JMenuItem();
        smnuSecante = new javax.swing.JMenuItem();
        smnuBiseccion = new javax.swing.JMenuItem();
        mnOpcionesEcu = new javax.swing.JMenu();
        jmiJacobbi = new javax.swing.JMenuItem();
        jmiPuntoFijo = new javax.swing.JMenuItem();
        Gauss = new javax.swing.JMenuItem();
        mnOpcionesInte = new javax.swing.JMenu();
        jmTrapecio = new javax.swing.JMenuItem();
        jmTercio = new javax.swing.JMenuItem();
        mnOpcionesInterpolacion = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        mnOpciones.setText("Métodos No Lineales");

        smnuPuntoFijo.setText("Punto Fijo");
        smnuPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuPuntoFijoActionPerformed(evt);
            }
        });
        mnOpciones.add(smnuPuntoFijo);

        smnuNewton.setText("Newton");
        smnuNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuNewtonActionPerformed(evt);
            }
        });
        mnOpciones.add(smnuNewton);

        smnuSecante.setText("Secante");
        smnuSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuSecanteActionPerformed(evt);
            }
        });
        mnOpciones.add(smnuSecante);

        smnuBiseccion.setText("Bisección");
        smnuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnuBiseccionActionPerformed(evt);
            }
        });
        mnOpciones.add(smnuBiseccion);

        mnbPestanas.add(mnOpciones);

        mnOpcionesEcu.setText("Sistemas de Ecuaciones");

        jmiJacobbi.setText("Jacobbi");
        jmiJacobbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJacobbiActionPerformed(evt);
            }
        });
        mnOpcionesEcu.add(jmiJacobbi);

        jmiPuntoFijo.setText("Punto Fijo");
        jmiPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPuntoFijoActionPerformed(evt);
            }
        });
        mnOpcionesEcu.add(jmiPuntoFijo);

        Gauss.setText("Gauss-Seidel");
        Gauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GaussActionPerformed(evt);
            }
        });
        mnOpcionesEcu.add(Gauss);

        mnbPestanas.add(mnOpcionesEcu);

        mnOpcionesInte.setText("Integración Númerica");

        jmTrapecio.setText("Regla del Trapecio");
        jmTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTrapecioActionPerformed(evt);
            }
        });
        mnOpcionesInte.add(jmTrapecio);

        jmTercio.setText("Regla del 1/3 de Simpson");
        jmTercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTercioActionPerformed(evt);
            }
        });
        mnOpcionesInte.add(jmTercio);

        mnbPestanas.add(mnOpcionesInte);

        mnOpcionesInterpolacion.setText("Interpolación");

        jMenuItem2.setText("Interpolación por Newton");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnOpcionesInterpolacion.add(jMenuItem2);

        jMenuItem3.setText("Interpolación por Lagrange");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnOpcionesInterpolacion.add(jMenuItem3);

        mnbPestanas.add(mnOpcionesInterpolacion);

        setJMenuBar(mnbPestanas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smnuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuBiseccionActionPerformed
        dlgBiseccion biseccion = new dlgBiseccion(this, true);
        biseccion.setLocationRelativeTo(null);
        biseccion.setVisible(true);

    }//GEN-LAST:event_smnuBiseccionActionPerformed

    private void smnuPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuPuntoFijoActionPerformed
        dlgFijo punto = new dlgFijo(this, true);
        punto.setLocationRelativeTo(null);
        punto.setVisible(true);
    }//GEN-LAST:event_smnuPuntoFijoActionPerformed

    private void smnuSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuSecanteActionPerformed
        dlgSecante secante = new dlgSecante(this, true);
        secante.setLocationRelativeTo(null);
        secante.setVisible(true);
    }//GEN-LAST:event_smnuSecanteActionPerformed

    private void smnuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuNewtonActionPerformed
        dlgNewton newton = new dlgNewton(this, true);
        newton.setLocationRelativeTo(null);
        newton.setVisible(true);
    }//GEN-LAST:event_smnuNewtonActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void jmiJacobbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJacobbiActionPerformed
        dlgJacobi x = new dlgJacobi();
        x.setLocationRelativeTo(null);
        x.setVisible(true);
    }//GEN-LAST:event_jmiJacobbiActionPerformed

    private void jmiPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPuntoFijoActionPerformed
        dlgFijo y = new dlgFijo(this, true);
        y.setLocationRelativeTo(null);
        y.setVisible(true);
    }//GEN-LAST:event_jmiPuntoFijoActionPerformed

    private void GaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GaussActionPerformed
        dlgGaussSeidel y = new dlgGaussSeidel();
        y.setLocationRelativeTo(null);
        y.setVisible(true);
    }//GEN-LAST:event_GaussActionPerformed

    private void jmTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTrapecioActionPerformed
        dlgTrapecio q = new dlgTrapecio();
        q.setLocationRelativeTo(null);
        q.setVisible(true);
    }//GEN-LAST:event_jmTrapecioActionPerformed

    private void jmTercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTercioActionPerformed
        dlgTercio u = new dlgTercio();
        u.setLocationRelativeTo(null);
        u.setVisible(true);
    }//GEN-LAST:event_jmTercioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dlgLang u = new dlgLang();
        u.setLocationRelativeTo(null);
        u.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dlgNew u = new dlgNew();
        u.setLocationRelativeTo(null);
        u.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Gauss;
    private javax.swing.JButton btSalir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmTercio;
    private javax.swing.JMenuItem jmTrapecio;
    private javax.swing.JMenuItem jmiJacobbi;
    private javax.swing.JMenuItem jmiPuntoFijo;
    private javax.swing.JMenu mnOpciones;
    private javax.swing.JMenu mnOpcionesEcu;
    private javax.swing.JMenu mnOpcionesInte;
    private javax.swing.JMenu mnOpcionesInterpolacion;
    private javax.swing.JMenuBar mnbPestanas;
    private javax.swing.JMenuItem smnuBiseccion;
    private javax.swing.JMenuItem smnuNewton;
    private javax.swing.JMenuItem smnuPuntoFijo;
    private javax.swing.JMenuItem smnuSecante;
    // End of variables declaration//GEN-END:variables

}
