package Unidad1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    private final ActionListener gEvent;

    Calculos tr = new Calculos();
    int r = 0;

    public void ValidarNumeros() {
        try {
            tr.setPa(Double.parseDouble(txtVA.getText())); //Convertir el JTextField a double
            tr.setPr(Double.parseDouble(txtVR.getText())); //Convertir el JTextField a double
            tr.setDig(Integer.parseInt(txtDecimales.getText())); //Convertir el JTextField a int*/
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido: " + e.getMessage());
        }
    }

    public void LimpiarJTextFields() {
        txtDecimales.setText("");
        txtEA.setText("");
        txtEP.setText("");
        txtER.setText("");
        txtVA.setText("");
        txtVR.setText("");
    }

    public Interfaz() {
        super("MÉTODOS NUMÉRICOS");
        setVisible(true);//Visibilidad
        setResizable(false);//Evita cambiar tamaño
        setLocationRelativeTo(null);
        try {
            initComponents();
        } catch (IllegalStateException e) {

        }
        gEvent = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValidarNumeros();
                if (e.getSource() == cmdCalcular) {
                    //Solo si JRadioButton Truncar esta seleccionado entra al if
                    if (rdTruncar.isSelected()) {
                        //Solo si JCheckBox Error Asbsoluto esta marcado entra al if
                        if (chkEA.isSelected()) {
                            /*El metodo ErrorAbs,ErrorRela & ErrorPorc le pasamos como parametro el metodo Truncar con sus parametros 
                            correspondientes Valor Aproximado y Numero de digitos*/
                            txtEA.setText(String.valueOf(tr.ErrorAbs(tr.Truncar(tr.getPa(), tr.getDig()))));
                        }
                        //Solo si JCheckBox Error Relativo esta marcado entra al if
                        if (chkER.isSelected()) {
                            txtER.setText(String.valueOf(tr.ErrorRela(tr.Truncar(tr.getPa(), tr.getDig()))));
                        }
                        //Solo si JCheckBox Error Porcentual esta marcado entra al if
                        if (chkEP.isSelected()) {
                            txtEP.setText(String.valueOf(tr.ErrorPorc(tr.Truncar(tr.getPa(), tr.getDig()))));
                        }
                    } else if (rdRedo.isSelected()) { //Solo si JRadioButton Redondear esta seleccionado entra al elseif
                        if (chkEA.isSelected()) {
                            txtEA.setText(String.valueOf(tr.ErrorAbs(tr.Redondear(tr.getPa(), tr.getDig()))));
                        }
                        if (chkER.isSelected()) {
                            txtER.setText(String.valueOf(tr.ErrorRela(tr.Redondear(tr.getPa(), tr.getDig()))));
                        }
                        if (chkEP.isSelected()) {
                            txtEP.setText(String.valueOf(tr.ErrorPorc(tr.Redondear(tr.getPa(), tr.getDig()))));
                        }
                    }
                }
            }
        };
        cmdCalcular.addActionListener(gEvent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Opc = new javax.swing.ButtonGroup();
        lblVR = new javax.swing.JLabel();
        lblVA = new javax.swing.JLabel();
        txtVR = new javax.swing.JTextField();
        txtVA = new javax.swing.JTextField();
        rdTruncar = new javax.swing.JRadioButton();
        rdRedo = new javax.swing.JRadioButton();
        txtDecimales = new javax.swing.JTextField();
        lblDecimales = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        chkEA = new javax.swing.JCheckBox();
        chkER = new javax.swing.JCheckBox();
        chkEP = new javax.swing.JCheckBox();
        txtEA = new javax.swing.JTextField();
        txtER = new javax.swing.JTextField();
        txtEP = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdNueVent = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblVR.setForeground(new java.awt.Color(102, 255, 102));
        lblVR.setText("Valor Real");
        lblVR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 147, -1));

        lblVA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblVA.setForeground(new java.awt.Color(102, 255, 102));
        lblVA.setText("Valor Aproximado");
        getContentPane().add(lblVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 147, -1));

        txtVR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVRActionPerformed(evt);
            }
        });
        txtVR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVRKeyTyped(evt);
            }
        });
        getContentPane().add(txtVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 6, 181, -1));

        txtVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVAActionPerformed(evt);
            }
        });
        txtVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVAKeyTyped(evt);
            }
        });
        getContentPane().add(txtVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 48, 181, -1));

        rdTruncar.setBackground(new java.awt.Color(0, 51, 204));
        Opc.add(rdTruncar);
        rdTruncar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdTruncar.setForeground(new java.awt.Color(102, 255, 102));
        rdTruncar.setText("Truncar");
        rdTruncar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdTruncar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                rdTruncarComponentAdded(evt);
            }
        });
        rdTruncar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTruncarActionPerformed(evt);
            }
        });
        getContentPane().add(rdTruncar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 126, 91, -1));

        rdRedo.setBackground(new java.awt.Color(0, 51, 255));
        Opc.add(rdRedo);
        rdRedo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdRedo.setForeground(new java.awt.Color(102, 255, 102));
        rdRedo.setText("Redondear");
        rdRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdRedoActionPerformed(evt);
            }
        });
        getContentPane().add(rdRedo, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 126, 105, -1));

        txtDecimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecimalesActionPerformed(evt);
            }
        });
        txtDecimales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalesKeyTyped(evt);
            }
        });
        getContentPane().add(txtDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 90, 60, -1));

        lblDecimales.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblDecimales.setForeground(new java.awt.Color(102, 255, 102));
        lblDecimales.setText("Número de Decimales");
        getContentPane().add(lblDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, 147, 23));

        lblO.setText("o");
        getContentPane().add(lblO, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 132, -1, -1));

        chkEA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkEA.setForeground(new java.awt.Color(51, 51, 255));
        chkEA.setText("Error Absoluto");
        chkEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEAActionPerformed(evt);
            }
        });
        getContentPane().add(chkEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 196, -1, -1));

        chkER.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkER.setForeground(new java.awt.Color(51, 51, 255));
        chkER.setText("Error Relativo");
        chkER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkERActionPerformed(evt);
            }
        });
        getContentPane().add(chkER, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 196, -1, -1));

        chkEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkEP.setForeground(new java.awt.Color(51, 51, 255));
        chkEP.setText("Error Porcentual");
        chkEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEPActionPerformed(evt);
            }
        });
        getContentPane().add(chkEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 196, -1, -1));

        txtEA.setEditable(false);
        txtEA.setBackground(new java.awt.Color(153, 204, 255));
        txtEA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEA.setForeground(new java.awt.Color(255, 51, 0));
        txtEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEAActionPerformed(evt);
            }
        });
        getContentPane().add(txtEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 272, -1));

        txtER.setEditable(false);
        txtER.setBackground(new java.awt.Color(153, 204, 255));
        txtER.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtER.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(txtER, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 160, 272, -1));

        txtEP.setEditable(false);
        txtEP.setBackground(new java.awt.Color(153, 204, 255));
        txtEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEP.setForeground(new java.awt.Color(255, 51, 0));
        txtEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPActionPerformed(evt);
            }
        });
        getContentPane().add(txtEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 160, 272, -1));

        cmdCalcular.setBackground(new java.awt.Color(0, 51, 255));
        cmdCalcular.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(102, 255, 102));
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(51, 255, 51), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 102, 255)));
        cmdCalcular.setMaximumSize(new java.awt.Dimension(51, 21));
        cmdCalcular.setMinimumSize(new java.awt.Dimension(51, 21));
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 241, 90, 20));

        cmdLimpiar.setBackground(new java.awt.Color(0, 51, 255));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        cmdLimpiar.setForeground(new java.awt.Color(102, 255, 102));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(51, 255, 51), new java.awt.Color(102, 255, 255), new java.awt.Color(102, 51, 255)));
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 92, -1));

        cmdNueVent.setBackground(new java.awt.Color(0, 0, 0));
        cmdNueVent.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        cmdNueVent.setForeground(new java.awt.Color(0, 255, 255));
        cmdNueVent.setText("Nueva Ventana");
        cmdNueVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNueVentActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNueVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Best Wallpaper 132.jpg"))); // NOI18N
        getContentPane().add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVAActionPerformed

    }//GEN-LAST:event_txtVAActionPerformed

    private void rdRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdRedoActionPerformed

    }//GEN-LAST:event_rdRedoActionPerformed

    private void txtVRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVRActionPerformed

    }//GEN-LAST:event_txtVRActionPerformed

    private void rdTruncarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTruncarActionPerformed

    }//GEN-LAST:event_rdTruncarActionPerformed

    private void rdTruncarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_rdTruncarComponentAdded

    }//GEN-LAST:event_rdTruncarComponentAdded

    private void chkERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkERActionPerformed

    }//GEN-LAST:event_chkERActionPerformed

    private void chkEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEPActionPerformed

    }//GEN-LAST:event_chkEPActionPerformed

    private void txtEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPActionPerformed

    }//GEN-LAST:event_txtEPActionPerformed

    private void txtEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEAActionPerformed

    }//GEN-LAST:event_txtEAActionPerformed

    private void chkEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEAActionPerformed

    }//GEN-LAST:event_chkEAActionPerformed

    private void txtDecimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecimalesActionPerformed

    }//GEN-LAST:event_txtDecimalesActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        LimpiarJTextFields();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdNueVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNueVentActionPerformed
        Interfaz a = new Interfaz();
    }//GEN-LAST:event_cmdNueVentActionPerformed

    private void txtVRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVRKeyTyped
        /*char c = evt.getKeyChar();
        Character.isAlphabetic(c) ||*/
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtVRKeyTyped

    private void txtVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVAKeyTyped
        char c = evt.getKeyChar();
        if ((int) evt.getKeyChar() != 46 && (int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros y punto.");
        }
    }//GEN-LAST:event_txtVAKeyTyped

    private void txtDecimalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalesKeyTyped
        if ((int) evt.getKeyChar() != 8 != ((int) evt.getKeyChar() >= 48 && (int) evt.getKeyChar() <= 57)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Error: Solo se permite numeros.");
        }
    }//GEN-LAST:event_txtDecimalesKeyTyped
//Boton para salir
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.ButtonGroup Opc;
    private javax.swing.JButton Salir;
    private javax.swing.JCheckBox chkEA;
    private javax.swing.JCheckBox chkEP;
    private javax.swing.JCheckBox chkER;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdNueVent;
    private javax.swing.JLabel lblDecimales;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblVA;
    private javax.swing.JLabel lblVR;
    private javax.swing.JRadioButton rdRedo;
    private javax.swing.JRadioButton rdTruncar;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtEA;
    private javax.swing.JTextField txtEP;
    private javax.swing.JTextField txtER;
    private javax.swing.JTextField txtVA;
    private javax.swing.JTextField txtVR;
    // End of variables declaration//GEN-END:variables

}
