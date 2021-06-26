package Presentacion;

import Calendario.Calendario;
import Negocios.Producto;
import javax.swing.JOptionPane;

public class Editproducto extends javax.swing.JFrame {

    private Calendario calendario = new Calendario();

    public Editproducto() {
        initComponents();
        this.setLocationRelativeTo(this);
        calendario.configuracion_inicial(calendar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idenmo = new javax.swing.JTextField();
        Txnproductomo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txcatmo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txcantmo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        idpromo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel4.setText("Cedula Encargado:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        idenmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jPanel1.add(idenmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 60, 30));

        Txnproductomo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        Txnproductomo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxnproductomoKeyTyped(evt);
            }
        });
        jPanel1.add(Txnproductomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel10.setText("Nombre Producto:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 30));

        Txcatmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        Txcatmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxcatmoKeyTyped(evt);
            }
        });
        jPanel1.add(Txcatmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel6.setText("Cantidad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 30));

        Txcantmo.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        Txcantmo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxcantmoKeyTyped(evt);
            }
        });
        jPanel1.add(Txcantmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel5.setText("Fecha de Llegada:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 393, 100, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 100, 30));

        jButton5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 30));

        idpromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpromoActionPerformed(evt);
            }
        });
        idpromo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idpromoKeyTyped(evt);
            }
        });
        jPanel1.add(idpromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 50, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 16)); // NOI18N
        jLabel2.setText("ID Producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 30));
        jPanel1.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 300, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.png"))); // NOI18N
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            Producto producto = new Producto();
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();
            
            if (verificar.productoEditarEmpty(Integer.valueOf(idpromo.getText()), idenmo.getText(), Txnproductomo.getText(), Integer.valueOf(Txcantmo.getText()), Txcatmo.getText(), calendario.getFechaToDataBase())) {
                 JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                producto.modificar(Integer.valueOf(idpromo.getText()), idenmo.getText(), Txnproductomo.getText(), Integer.valueOf(Txcantmo.getText()), Txcatmo.getText(), calendario.getFechaToDataBase());
            }
             } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idpromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpromoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_idpromoActionPerformed

    private void idpromoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idpromoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }
    }//GEN-LAST:event_idpromoKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Presentacion.Productos productos = new Presentacion.Productos(/*Dadmin*/);
        productos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Presentacion.Busproducto buspro = new Presentacion.Busproducto(/*Dadmin*/);
        buspro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void TxcantmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxcantmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxcantmoKeyTyped

    private void TxnproductomoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxnproductomoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxnproductomoKeyTyped

    private void TxcatmoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxcatmoKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TxcatmoKeyTyped

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
            java.util.logging.Logger.getLogger(Editproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Txcantmo;
    public static javax.swing.JTextField Txcatmo;
    public static javax.swing.JTextField Txnproductomo;
    private com.toedter.calendar.JCalendar calendar;
    public static javax.swing.JTextField idenmo;
    public static javax.swing.JTextField idpromo;
    private javax.swing.JButton jButton1;
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
