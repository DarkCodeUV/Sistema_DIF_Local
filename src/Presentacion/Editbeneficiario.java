/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Negocios.Beneficiario;
import javax.swing.JOptionPane;

public class Editbeneficiario extends javax.swing.JFrame {

    public Editbeneficiario() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txnombremo = new javax.swing.JTextField();
        txapellidopmo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txapellidommo = new javax.swing.JTextField();
        txedadmo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtelmo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txdireccionmo = new javax.swing.JTextField();
        txcomunidadmo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        idbenmo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel10.setText("Nombre Beneficiario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        txnombremo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txnombremo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnombremoKeyTyped(evt);
            }
        });
        jPanel1.add(txnombremo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 30));

        txapellidopmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txapellidopmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txapellidopmoKeyTyped(evt);
            }
        });
        jPanel1.add(txapellidopmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Materno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 30));

        txapellidommo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txapellidommo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txapellidommoKeyTyped(evt);
            }
        });
        jPanel1.add(txapellidommo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 30));

        txedadmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txedadmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txedadmoKeyTyped(evt);
            }
        });
        jPanel1.add(txedadmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 50, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, 30));

        txtelmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtelmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelmoKeyTyped(evt);
            }
        });
        jPanel1.add(txtelmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 180, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        txdireccionmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jPanel1.add(txdireccionmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 380, 30));

        txcomunidadmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jPanel1.add(txcomunidadmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 180, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Comunidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 30));

        guardar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 90, 30));

        cancelar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 493, 90, 30));

        idbenmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        idbenmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idbenmoKeyTyped(evt);
            }
        });
        jPanel1.add(idbenmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("ID Beneficiario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            Negocios.Beneficiario beneficiario = new Negocios.Beneficiario();
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();
            
            if (verificar.beneficiarioEditarEmpty(Integer.valueOf(idbenmo.getText()), txnombremo.getText(), txapellidopmo.getText(), txapellidommo.getText(), Integer.valueOf(txedadmo.getText()), txtelmo.getText(), txdireccionmo.getText(), txcomunidadmo.getText())){
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                beneficiario.modificar(Integer.valueOf(idbenmo.getText()), txnombremo.getText(), txapellidopmo.getText(), txapellidommo.getText(), Integer.valueOf(txedadmo.getText()), txtelmo.getText(), txdireccionmo.getText(), txcomunidadmo.getText());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        /*
        try {
            Negocios.Beneficiario beneficiario = new Negocios.Beneficiario();
            beneficiario.modificar(Integer.valueOf(idbenmo.getText()), txnombremo.getText(), txapellidopmo.getText(), txapellidommo.getText(), Integer.valueOf(txedadmo.getText()), txtelmo.getText(), txdireccionmo.getText(), txcomunidadmo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }
        */

    }//GEN-LAST:event_guardarMouseClicked

    private void idbenmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbenmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }
    }//GEN-LAST:event_idbenmoKeyTyped

    private void txedadmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txedadmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }
    }//GEN-LAST:event_txedadmoKeyTyped

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        Presentacion.Beneficiarios Ben = new Presentacion.Beneficiarios(/*Dadmin*/);
        Ben.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMouseClicked

    private void txtelmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtelmoKeyTyped

    private void txnombremoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnombremoKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txnombremoKeyTyped

    private void txapellidopmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txapellidopmoKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txapellidopmoKeyTyped

    private void txapellidommoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txapellidommoKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txapellidommoKeyTyped

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
            java.util.logging.Logger.getLogger(Editbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editbeneficiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    public static javax.swing.JTextField idbenmo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txapellidommo;
    public static javax.swing.JTextField txapellidopmo;
    public static javax.swing.JTextField txcomunidadmo;
    public static javax.swing.JTextField txdireccionmo;
    public static javax.swing.JTextField txedadmo;
    public static javax.swing.JTextField txnombremo;
    public static javax.swing.JTextField txtelmo;
    // End of variables declaration//GEN-END:variables
}
