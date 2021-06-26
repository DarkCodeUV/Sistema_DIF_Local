package Presentacion;

import Datos.Mostrardatos;
import Negocios.Beneficiario;
import javax.swing.JOptionPane;

public class Beneficiarios extends javax.swing.JFrame {

    public Beneficiarios() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txnombre = new javax.swing.JTextField();
        txapellidop = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txapellidom = new javax.swing.JTextField();
        txedad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txcomunidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtel = new javax.swing.JTextField();
        txdireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel10.setText("Nombre Beneficiario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 30));

        txnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, 30));

        txapellidop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txapellidopKeyTyped(evt);
            }
        });
        jPanel1.add(txapellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel6.setText("Apellido Materno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        txapellidom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txapellidomKeyTyped(evt);
            }
        });
        jPanel1.add(txapellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 220, 30));

        txedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txedadKeyTyped(evt);
            }
        });
        jPanel1.add(txedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 70, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel4.setText("Comunidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));

        buscar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        buscar.setText("Buscar");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 100, 30));

        modificar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        modificar.setText("Modificar");
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 110, 30));

        cancelar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 110, 30));

        guardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 120, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel8.setText("Dirección:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 30));
        jPanel1.add(txcomunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 30));

        txtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelKeyTyped(evt);
            }
        });
        jPanel1.add(txtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 150, 30));
        jPanel1.add(txdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 310, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

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
        Beneficiario beneficiario = new Beneficiario();
        try {
             Verificaciones.Verificar  verificar = new Verificaciones.Verificar();
             if( verificar.beneficiarioEmpy(txnombre.getText(), txapellidop.getText(), txapellidom.getText(), Integer.valueOf(txedad.getText()), txtel.getText(), txdireccion.getText(), txcomunidad.getText()) == true ){
                 JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
             }else{
                 beneficiario.insertar(txnombre.getText(), txapellidop.getText(), txapellidom.getText(), Integer.valueOf(txedad.getText()), txtel.getText(), txdireccion.getText(), txcomunidad.getText());
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        Editbeneficiario editarBeneficiario = new Editbeneficiario();
        editarBeneficiario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        Presentacion.Menu menu = new Presentacion.Menu(/*Dadmin*/);
        menu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        Presentacion.Editbeneficiario editben = new Presentacion.Editbeneficiario(/*Dadmin*/);
        editben.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Presentacion.Busbeneficiario busben = new Presentacion.Busbeneficiario(/*Dadmin*/);
        busben.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_buscarMouseClicked

    private void txedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txedadKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txedadKeyTyped

    private void txtelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtelKeyTyped

    private void txnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnombreKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txnombreKeyTyped

    private void txapellidopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txapellidopKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txapellidopKeyTyped

    private void txapellidomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txapellidomKeyTyped
char validad = evt.getKeyChar();



if (Character.isDigit(validad)) {
getToolkit().beep();
evt.consume();
JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_txapellidomKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Beneficiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beneficiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beneficiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beneficiarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beneficiarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar;
    public static javax.swing.JTextField txapellidom;
    public static javax.swing.JTextField txapellidop;
    public static javax.swing.JTextField txcomunidad;
    public static javax.swing.JTextField txdireccion;
    public static javax.swing.JTextField txedad;
    public static javax.swing.JTextField txnombre;
    public static javax.swing.JTextField txtel;
    // End of variables declaration//GEN-END:variables
}
