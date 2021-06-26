package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
    Una clase para recuperar absolutamente todos los datos
    de cada tabla en especifico

*/


public class Mostrardatos {
    PreparedStatement ps;
    ResultSet rs;
    Connection con = null;
    
    public DefaultTableModel consultar_beneficiario() {
        con = conexion.getConection();

        DefaultTableModel cons = new DefaultTableModel();
        cons.addColumn("ID");
        cons.addColumn("Nombre");
        cons.addColumn("A Paterno");
        cons.addColumn("A Materno");
        cons.addColumn("Edad");
        cons.addColumn("Telefono");
        cons.addColumn("Dirección");
        cons.addColumn("Comunidad");

        String[] datos = new String[8];
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM beneficiario");
            
            rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                cons.addRow(datos);

            }
            return cons;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return cons;
    }
    
    public DefaultTableModel consultar_encargado() {
        con = conexion.getConection();
        DefaultTableModel cons = new DefaultTableModel();
        cons.addColumn("id_cedula");
        cons.addColumn("usuario");
        cons.addColumn("contraseña");
        cons.addColumn("derechos_admin");
        cons.addColumn("nombre");
        cons.addColumn("apellido_pat");
        cons.addColumn("apellido_mat");
        String[] datos = new String[7];
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM encargada");
            rs = ps.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                cons.addRow(datos);
            }
            return cons;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return cons;
    }

    public DefaultTableModel consultar_producto() {
        con = conexion.getConection();

        DefaultTableModel cons = new DefaultTableModel();
        cons.addColumn("id_producto");
        cons.addColumn("id_cedula");
        cons.addColumn("nombre_producto");
        cons.addColumn("cantidad");
        cons.addColumn("categoria");
        cons.addColumn("fecha");

        String[] datos = new String[7];
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM productos");
            rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                cons.addRow(datos);

            }
            return cons;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return cons;
    }
    
    public DefaultTableModel consultar_entrega() {
        con = conexion.getConection();

        DefaultTableModel cons = new DefaultTableModel();
        cons.addColumn("id_entrega");
        cons.addColumn("id_ben");
        cons.addColumn("id_cedula");
        cons.addColumn("fecha");
        cons.addColumn("id_producto");
        cons.addColumn("hora");
        cons.addColumn("cantidad");

        String[] datos = new String[7];
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM entregas");
            rs = ps.executeQuery();

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                cons.addRow(datos);
            }
            return cons;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return cons;
    }


}
