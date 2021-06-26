package Presentacion;

import Datos.Mostrardatos;
import Negocios.Beneficiario;
import static Presentacion.Encargados.nombre;
import javax.swing.JOptionPane;

public class Busbeneficiario extends javax.swing.JFrame {

    public Busbeneficiario() {
        initComponents();
        this.setLocationRelativeTo(this);
        Mostrardatos contenidotab = new Mostrardatos();
        tbbus.setModel(contenidotab.consultar_beneficiario());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbus = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idbuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idbus = new javax.swing.JTextField();
        nombrebus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        apellidoP = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        apellidoM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        entregas = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbbus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbbus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 490, 190));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Buscar por Identificador:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setText("Buscar por  datos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 20));

        idbuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        idbuscar.setText("Buscar");
        idbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idbuscarMouseClicked(evt);
            }
        });
        idbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(idbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 30));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 100, 30));

        idbus.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        idbus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idbusKeyTyped(evt);
            }
        });
        jPanel1.add(idbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, 30));

        nombrebus.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        nombrebus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrebusActionPerformed(evt);
            }
        });
        nombrebus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrebusKeyTyped(evt);
            }
        });
        jPanel1.add(nombrebus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 260, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 110, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 110, 30));

        apellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPActionPerformed(evt);
            }
        });
        apellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 120, 30));

        Modificar.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 110, 30));

        apellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoMActionPerformed(evt);
            }
        });
        apellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 120, 30));

        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel5.setText("Apellido Paterno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel6.setText("Apellido Materno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 20, 190));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 10));

        entregas.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        entregas.setText("Ir a Entregas");
        entregas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entregasMouseClicked(evt);
            }
        });
        jPanel1.add(entregas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 110, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic Light", 0, 16)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

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

    private void idbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbuscarActionPerformed
        // TODO add your handling code here:
        try{
            Beneficiario beneficiario = new Beneficiario();
             Verificaciones.Verificar  verificar = new Verificaciones.Verificar();
             if (verificar.buscarBeneficiarioEmptyID(Integer.valueOf(idbus.getText()))) {
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                 if ( beneficiario.existenciaBeneficiarioID(Integer.valueOf(idbus.getText()))) {
                    tbbus.setModel(beneficiario.consultarID(Integer.valueOf(idbus.getText())));
                 }else{
                     JOptionPane.showMessageDialog(null, "No existe un registro con esos datos");
                 }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }
        

    }//GEN-LAST:event_idbuscarActionPerformed

    private void idbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idbuscarMouseClicked
        Beneficiario se = new Beneficiario();


    }//GEN-LAST:event_idbuscarMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Beneficiario se = new Beneficiario();

        //se.conbeneficiarioDatos();

    }//GEN-LAST:event_jButton2MouseClicked

    private void idbusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbusKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }
    }//GEN-LAST:event_idbusKeyTyped

    private void apellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Beneficiario beneficiario = new Beneficiario();
            Verificaciones.Verificar  verificar = new Verificaciones.Verificar();
            
            if (verificar.buscarBeneficiarioEmptyDatos(nombrebus.getText(), apellidoP.getText(), apellidoM.getText())) {
                 JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                if ( beneficiario.existenciaBeneficiarioDatos(nombrebus.getText(), apellidoP.getText(), apellidoM.getText())) {
                    tbbus.setModel(beneficiario.consultarPorDatos(nombrebus.getText(), apellidoP.getText(), apellidoM.getText()));
                 }else{
                     JOptionPane.showMessageDialog(null, "No existe un registro con esos datos");
                 }
                
               
            }
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos, verifique");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void apellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMActionPerformed

    private void nombrebusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrebusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrebusActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Presentacion.Beneficiarios Benef = new Presentacion.Beneficiarios(/*Dadmin*/);
        Benef.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        Presentacion.Editbeneficiario mod = new Presentacion.Editbeneficiario(/*Dadmin*/);
        mod.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMouseClicked

    private void entregasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entregasMouseClicked
        Presentacion.Entregas entre = new Presentacion.Entregas(/*Dadmin*/);
        entre.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_entregasMouseClicked

    private void nombrebusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrebusKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nombrebusKeyTyped

    private void apellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoPKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPKeyTyped

    private void apellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoMKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMKeyTyped

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Negocios.Beneficiario se = new Negocios.Beneficiario();
        try{
         se.eliminarPorId(Integer.valueOf(idbus.getText()));
         JOptionPane.showMessageDialog(null, "Eliminado con éxito");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
                }               // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Busbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busbeneficiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busbeneficiario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField apellidoM;
    private javax.swing.JTextField apellidoP;
    private javax.swing.JButton entregas;
    public static javax.swing.JTextField idbus;
    private javax.swing.JButton idbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField nombrebus;
    public static javax.swing.JTable tbbus;
    // End of variables declaration//GEN-END:variables
}
