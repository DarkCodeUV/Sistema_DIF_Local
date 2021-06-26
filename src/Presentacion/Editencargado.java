package Presentacion;

import Negocios.Encargada;
import Verificaciones.Cifrar;
import javax.swing.JOptionPane;

public class Editencargado extends javax.swing.JFrame {

    public Editencargado() {
        initComponents();
        this.setLocationRelativeTo(this);

        grupoSiNo.add(si);
        grupoSiNo.add(no);

        si.setText("si");
        si.setSelected(false);
        no.setText("no");
        no.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSiNo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cedulamo = new javax.swing.JTextField();
        usuariomo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombremo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellidopmo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        apellidommo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contramo = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        no = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulamoActionPerformed(evt);
            }
        });
        jPanel1.add(cedulamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 30));

        usuariomo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuariomoKeyTyped(evt);
            }
        });
        jPanel1.add(usuariomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 100, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 30));

        nombremo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombremoKeyTyped(evt);
            }
        });
        jPanel1.add(nombremo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 190, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 30));

        apellidopmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidopmoKeyTyped(evt);
            }
        });
        jPanel1.add(apellidopmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 190, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel8.setText("Apellido Materno:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 30));

        apellidommo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidommoKeyTyped(evt);
            }
        });
        jPanel1.add(apellidommo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 190, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 30));

        contramo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contramoKeyTyped(evt);
            }
        });
        jPanel1.add(contramo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 190, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel5.setText("Derechos de Administrador:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 180, 30));

        guardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        cancel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        no.setText("no");
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        si.setText("si");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String permiso = "";
        if (si.isSelected() == true) {
            permiso = "si";
        }
        if (no.isSelected() == true) {
            permiso = "no";
        }
       
        try {
             Encargada encargada = new Encargada();
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();
            
            if (verificar.encargadaEditarEmpy(cedulamo.getText(), usuariomo.getText(), contramo.getText(), permiso, nombremo.getText(), apellidopmo.getText(), apellidommo.getText())) {
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                Cifrar cifrar = new Cifrar();
                cifrar.setPassword(contramo.getText());
                
                encargada.modificar(cedulamo.getText(), usuariomo.getText(), cifrar.getPassword(), permiso, nombremo.getText(), apellidopmo.getText(), apellidommo.getText());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus datos");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Presentacion.Encargados encargado = new Presentacion.Encargados(/*Dadmin*/);
        encargado.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseClicked

    private void usuariomoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariomoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_usuariomoKeyTyped

    private void nombremoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombremoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nombremoKeyTyped

    private void apellidopmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidopmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidopmoKeyTyped

    private void apellidommoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidommoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidommoKeyTyped

    private void contramoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contramoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_contramoKeyTyped

    private void cedulamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulamoActionPerformed

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
            java.util.logging.Logger.getLogger(Editencargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editencargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editencargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editencargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editencargado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellidommo;
    public static javax.swing.JTextField apellidopmo;
    private javax.swing.JButton cancel;
    public static javax.swing.JTextField cedulamo;
    public static javax.swing.JPasswordField contramo;
    private javax.swing.ButtonGroup grupoSiNo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton no;
    public static javax.swing.JTextField nombremo;
    private javax.swing.JRadioButton si;
    public static javax.swing.JTextField usuariomo;
    // End of variables declaration//GEN-END:variables
}
