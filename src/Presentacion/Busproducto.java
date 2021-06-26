
package Presentacion;

import Datos.Mostrardatos;
import Negocios.Producto;
import javax.swing.JOptionPane;


public class Busproducto extends javax.swing.JFrame {

    public Busproducto() {
        initComponents();
        this.setLocationRelativeTo(this);
        Mostrardatos contenidotab = new Mostrardatos();
        tbbuspro.setModel(contenidotab.consultar_producto());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idbuspro = new javax.swing.JTextField();
        idbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbuspro = new javax.swing.JTable();
        Modificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Buscar por Identificador:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, 20));

        idbuspro.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        idbuspro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idbusproKeyTyped(evt);
            }
        });
        jPanel1.add(idbuspro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 100, 30));

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
        jPanel1.add(idbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 30));

        tbbuspro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbbuspro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 490, 210));

        Modificar.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 80, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 14)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 90, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 2, 16)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 480, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.png"))); // NOI18N
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

    private void idbusproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbusproKeyTyped
     
        char validad= evt.getKeyChar();

        if (Character.isLetter(validad)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo Números.");
        }
        
    }//GEN-LAST:event_idbusproKeyTyped

    private void idbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idbuscarMouseClicked

        
    }//GEN-LAST:event_idbuscarMouseClicked

    private void idbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbuscarActionPerformed
        // TODO add your handling code here:
       
        try{
            Producto producto = new Producto();
            
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();
            if (verificar.buscarProductoEmptyID(Integer.valueOf(idbuspro.getText()))) {
                 JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                if (producto.existenciaProductoID(Integer.valueOf(idbuspro.getText())) == true) {
                     tbbuspro.setModel(producto.consultarPorID(Integer.valueOf(idbuspro.getText())));
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un registro con esos datos");
                }
               
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor verifique");
        }
        
    }//GEN-LAST:event_idbuscarActionPerformed

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        Presentacion.Editproducto Editp = new Presentacion.Editproducto(/*Dadmin*/);
        Editp.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_ModificarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
Presentacion.Productos prod = new Presentacion.Productos(/*Dadmin*/);
        prod.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Negocios.Producto se = new Negocios.Producto();
        
        try{
         se.eliminarPorId(Integer.valueOf(idbuspro.getText()));
         JOptionPane.showMessageDialog(null, "Eliminado con éxito");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
                }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Busproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JButton idbuscar;
    public static javax.swing.JTextField idbuspro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbbuspro;
    // End of variables declaration//GEN-END:variables
}
