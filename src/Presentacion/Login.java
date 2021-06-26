
package Presentacion;

import Datos.RecuperarEncargados;
import Negocios.Encargada;
import static Presentacion.Encargados.contra;
import Verificaciones.Cifrar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

  

public class Login extends javax.swing.JFrame {

 private static ArrayList<String> savedatosEncargado;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        errorLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 16)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 100, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 16)); // NOI18N
        jButton2.setText("Cerrar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 508, 80, -1));

        password.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 16)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 220, 30));

        usuario.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 16)); // NOI18N
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 220, 30));

        errorLogin.setForeground(new java.awt.Color(204, 0, 51));
        errorLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(errorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 390, 20));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 510, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Encargada encargada = new Encargada();
            Verificaciones.Verificar verificar = new Verificaciones.Verificar();
          
            
            if(verificar.loginEmpty(usuario.getText(),password.getText()) == true){
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                 Cifrar cifrar = new Cifrar();
                 cifrar.setPassword(password.getText());
              
                if (encargada.existenciaLogin(usuario.getText(),cifrar.getPassword()) == true) {
                   
                         
                            
                    RecuperarEncargados recuperarEncargados = new RecuperarEncargados();
                    
                    recuperarEncargados.setDatos(encargada.recuperarDatos( usuario.getText(),cifrar.getPassword()));
                    savedatosEncargado = recuperarEncargados.getDatos();
                    Menu menu = new Menu(savedatosEncargado);
                    
                  
                     menu.setVisible(true);
                    this.dispose();
                }else{
                    errorLogin.setText("Usuario o contraseña no validos, por favor erifique.");
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor verifique sus datos");
       
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
