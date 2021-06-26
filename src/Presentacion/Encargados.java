package Presentacion;

import Negocios.Encargada;
import Verificaciones.Cifrar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Encargados extends javax.swing.JFrame {

    public Encargados() {

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
        no = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidop = new javax.swing.JTextField();
        apellidom = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();
        repetirPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no.setText("no");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        si.setText("si");
        jPanel1.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel5.setText("Derechos de Administrador:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 30));

        guardar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guardarKeyTyped(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

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
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

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
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        cancel.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel8.setText("Apellido Materno:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 30));

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 190, 30));

        apellidop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidopKeyTyped(evt);
            }
        });
        jPanel1.add(apellidop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 190, 30));

        apellidom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidomKeyTyped(evt);
            }
        });
        jPanel1.add(apellidom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 190, 30));

        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, 30));
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 30));

        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 190, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        jLabel9.setText("Repetir contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        errorPassword.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(errorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 230, 20));
        jPanel1.add(repetirPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        jLabel1.setText("Repetir contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

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
        Encargada encargada = new Encargada();
        try {
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();

            if (verificar.encargadaEmpy(cedula.getText(), usuario.getText(), contra.getText(), permiso, nombre.getText(), apellidop.getText(), apellidom.getText()) && repetirPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            } else {
                if (repetirPassword.getText().equals(contra.getText())) {
                    Cifrar cifrar = new Cifrar();
                    cifrar.setPassword(contra.getText());
                    encargada.insertar(cedula.getText(), usuario.getText(), cifrar.getPassword(), permiso, nombre.getText(), apellidop.getText(), apellidom.getText());

                }else{
                    errorPassword.setText("Las contraseñas no coinciden");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus datos");
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

    private void guardarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarKeyTyped

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        Presentacion.Menu menu = new Presentacion.Menu(/*Dadmin*/);
        menu.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        Presentacion.Editencargado Edite = new Presentacion.Editencargado(/*Dadmin*/);
        Edite.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_modificarMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Presentacion.Busencargados BusE = new Presentacion.Busencargados(/*Dadmin*/);
        BusE.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_buscarMouseClicked

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidopKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidopKeyTyped

    private void apellidomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidomKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isDigit(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_apellidomKeyTyped

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraActionPerformed

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
            java.util.logging.Logger.getLogger(Encargados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encargados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encargados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encargados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encargados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellidom;
    public static javax.swing.JTextField apellidop;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancel;
    public static javax.swing.JTextField cedula;
    public static javax.swing.JPasswordField contra;
    private javax.swing.JLabel errorPassword;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar;
    private javax.swing.JRadioButton no;
    public static javax.swing.JTextField nombre;
    private javax.swing.JPasswordField repetirPassword;
    private javax.swing.JRadioButton si;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
