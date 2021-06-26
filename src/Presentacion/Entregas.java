package Presentacion;

import Negocios.Entrega;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import Calendario.Calendario;
import Datos.Busqueda;
import Negocios.Producto;
import com.toedter.calendar.JCalendar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Presentacion.Login;
import java.awt.TextField;

public class Entregas extends javax.swing.JFrame {

    private Calendario calendario = new Calendario();
    private ArrayList<String> saveProductos;
    private ArrayList<String> saveBeneficiario;
    
    public Entregas() {
        initComponents();
        calendario.configuracion_inicial(calendar);
        this.setLocationRelativeTo(this);
    }

    public Entregas(ArrayList<String> savedatos) {
        initComponents();
        calendario.configuracion_inicial(calendar);
        this.setLocationRelativeTo(this);
        showEncargado.setText(savedatos.get(4).toString().toUpperCase() + " " + savedatos.get(5).toString().toUpperCase() + " " + savedatos.get(6).toString().toUpperCase());
        idCedula.setText(savedatos.get(1));
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        msgError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idCedula = new javax.swing.JTextField();
        idben = new javax.swing.JTextField();
        idpro = new javax.swing.JTextField();
        cant = new javax.swing.JTextField();
        hora = new javax.swing.JTextField();
        calendar = new com.toedter.calendar.JCalendar();
        minutos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        showBenefificiario = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JLabel();
        showEncargado = new javax.swing.JLabel();
        showProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel8.setText("ID Cedula:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel2.setText("Hora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 70, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel5.setText("ID Producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        msgError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(msgError, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jLabel7.setText("ID Beneficiario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        idCedula.setEditable(false);
        idCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(idCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 30));

        idben.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbenActionPerformed(evt);
            }
        });
        idben.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idbenKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idbenKeyReleased(evt);
            }
        });
        jPanel1.add(idben, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, 30));

        idpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproActionPerformed(evt);
            }
        });
        idpro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idproKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idproKeyReleased(evt);
            }
        });
        jPanel1.add(idpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 30));

        cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantKeyTyped(evt);
            }
        });
        jPanel1.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 110, 30));

        hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaKeyTyped(evt);
            }
        });
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 40, 30));
        jPanel1.add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 200));

        minutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                minutosKeyTyped(evt);
            }
        });
        jPanel1.add(minutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 40, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText(":");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 10, 30));

        jButton1.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 130, 30));

        jButton3.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 130, 30));

        jButton4.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton4.setText("Buscar Bebeneficiario");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 190, 30));

        jButton5.setFont(new java.awt.Font("Yu Gothic Light", 0, 15)); // NOI18N
        jButton5.setText("Buscar Entregas");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 140, 30));

        showBenefificiario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        showBenefificiario.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(showBenefificiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 200, 20));

        nombreProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreProducto.setForeground(new java.awt.Color(0, 153, 51));
        jPanel1.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 20));

        showEncargado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        showEncargado.setForeground(new java.awt.Color(51, 51, 255));
        showEncargado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(showEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 330, 30));

        showProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        jPanel1.add(showProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

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

    
    
    private String formatoHora() {
        String formato_hora = "";
        String formato_minutos = "";
        String formato = "";

        boolean bandera_h = false, bandera_m = false;

        if (hora.getText().length() <= 2 && Integer.valueOf(hora.getText()) > 0 && Integer.valueOf(hora.getText()) < 12) {
            bandera_h = true;
            formato_hora = hora.getText();
        } else {
            bandera_h = false;

        }
        if (minutos.getText().length() <= 2 && Integer.valueOf(minutos.getText()) >= 0 && Integer.valueOf(minutos.getText()) < 60) {
            bandera_m = true;
            formato_minutos = minutos.getText();
        } else {
            bandera_m = false;

        }

        if (bandera_h == true && bandera_m == true) {
            formato = formato_hora + ":" + formato_minutos;

        } else {
            if (bandera_h == false && bandera_m == true) {
                msgError.setText("Verificar: hora");
                formato = "";
            } else if (bandera_h == true && bandera_m == false) {
                msgError.setText("Verificar: minutos");
                formato = "";
            } else if (bandera_h == false && bandera_m == false) {
                msgError.setText("Verificar: horas y minutos");
                formato = "";
            }

        }

        return formato;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        calendario.configuracion_inicial(calendar);
//        System.out.println(calendario.getFechaToDataBase());
        try {
            Entrega entrega = new Entrega();
            Verificaciones.Verificar  verificar = new Verificaciones.Verificar();
            
            if (verificar.entregaEmpty(Integer.valueOf(idben.getText()), idCedula.getText(), calendario.getFechaToDataBase(), Integer.valueOf(idpro.getText()), formatoHora(), Float.valueOf(cant.getText())) == true) {
                JOptionPane.showMessageDialog(null, "No puede haber espacios vacios");
            }else{
                if (entrega.existenciaEntregas(Integer.valueOf(idben.getText()), idCedula.getText(), Integer.valueOf(idpro.getText()), Float.valueOf(cant.getText())) == false) {
                    entrega.insertar(Integer.valueOf(idben.getText()), idCedula.getText(), calendario.getFechaToDataBase(), Integer.valueOf(idpro.getText()), formatoHora(), Float.valueOf(cant.getText()));
                }else{
                    JOptionPane.showMessageDialog(null, "No hay una entrega pendiente con los datos proporcionados");
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus datos");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCedulaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Presentacion.Menu menu = new Presentacion.Menu(/*Dadmin*/);
        menu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Presentacion.Busbeneficiario busben = new Presentacion.Busbeneficiario(/*Dadmin*/);
        busben.setVisible(true);
        //this.dispose();        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Presentacion.Busentrega busentre = new Presentacion.Busentrega(/*Dadmin*/);
        busentre.setVisible(true);
        //this.dispose(); 
        setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void idbenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbenKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_idbenKeyTyped

    private void idproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_idproKeyTyped

    private void cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cantKeyTyped

    private void horaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_horaKeyTyped

    private void minutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutosKeyTyped
        char validad = evt.getKeyChar();

        if (Character.isLetter(validad)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Números.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_minutosKeyTyped

    private void idbenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbenActionPerformed

   
    
 
    
     
    
    private void idproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_idproActionPerformed

    private void idproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproKeyReleased
        // TODO add your handling code here:
        try {
            
       
        Busqueda buscar=new Busqueda();
        saveProductos = buscar.buscarProductos(Integer.valueOf(idpro.getText()));
        nombreProducto.setText(saveProductos.get(2));
        nombreProducto.setForeground(Color.BLUE);
         } catch (Exception e) {
              Busqueda buscar=new Busqueda();
        saveProductos = buscar.buscarProductos(Integer.valueOf(idpro.getText()));
        nombreProducto.setText("El producto no existe");
        nombreProducto.setForeground(Color.red);
        }
    }//GEN-LAST:event_idproKeyReleased

    private void idbenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idbenKeyReleased
        // TODO add your handling code here:
        try {
            
       
        Busqueda buscar=new Busqueda();
        saveBeneficiario = buscar.buscarBeneficiario(Integer.valueOf(idben.getText()));
        showBenefificiario.setText(saveBeneficiario.get(1));
        showBenefificiario.setForeground(Color.BLUE);
         } catch (Exception e) {
              Busqueda buscar=new Busqueda();
                saveBeneficiario = buscar.buscarBeneficiario(Integer.valueOf(idben.getText()));
                showBenefificiario.setText("El beneficiario no existe");
                showBenefificiario.setForeground(Color.red);
        }
        
        
        
        
    }//GEN-LAST:event_idbenKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entregas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField idCedula;
    private javax.swing.JTextField idben;
    private javax.swing.JTextField idpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField minutos;
    private javax.swing.JLabel msgError;
    private javax.swing.JLabel nombreProducto;
    private javax.swing.JLabel showBenefificiario;
    private javax.swing.JLabel showEncargado;
    private javax.swing.JLabel showProducto;
    // End of variables declaration//GEN-END:variables
}
