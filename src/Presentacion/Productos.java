package Presentacion;

import Calendario.Calendario;
import Negocios.Producto;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {

    private Calendario calendario = new Calendario();

    public Productos() {
        initComponents();
        this.setLocationRelativeTo(this);
        calendario.configuracion_inicial(calendar);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idCedula = new javax.swing.JTextField();
        Txcant = new javax.swing.JTextField();
        Txcat = new javax.swing.JTextField();
        Txnproducto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel4.setText("ID Encargado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel5.setText("Fecha de Llegada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 20));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel10.setText("Nombre Producto:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));
        jPanel1.add(idCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 60, 30));

        Txcant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxcantKeyTyped(evt);
            }
        });
        jPanel1.add(Txcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 50, 30));

        Txcat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxcatKeyTyped(evt);
            }
        });
        jPanel1.add(Txcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, 30));

        Txnproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxnproductoKeyTyped(evt);
            }
        });
        jPanel1.add(Txnproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 160, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 100, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 100, 30));

        jButton5.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton5.setText("Buscar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 80, 30));
        jPanel1.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 280, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 550));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Producto producto = new Producto();
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();

            if (verificar.productoEmpty(idCedula.getText(), Txnproducto.getText(), Integer.valueOf(Txcant.getText()), Txcat.getText(), calendario.getFechaToDataBase())) {
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            } else {
                producto.insertar(idCedula.getText(), Txnproducto.getText(), Integer.valueOf(Txcant.getText()), Txcat.getText(), calendario.getFechaToDataBase());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Presentacion.Menu menu = new Presentacion.Menu(/*Dadmin*/);
        menu.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void TxcantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxcantKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxcantKeyTyped

    private void TxcatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxcatKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxcatKeyTyped

    private void TxnproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxnproductoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxnproductoKeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Presentacion.Editproducto menu = new Presentacion.Editproducto(/*Dadmin*/);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Presentacion.Busproducto prod = new Presentacion.Busproducto(/*Dadmin*/);
        prod.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Txcant;
    public static javax.swing.JTextField Txcat;
    public static javax.swing.JTextField Txnproducto;
    private com.toedter.calendar.JCalendar calendar;
    public static javax.swing.JTextField idCedula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
