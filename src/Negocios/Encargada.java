package Negocios;

import Datos.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Encargada extends DatabaseCon {
    
    /*
        Esta clase hace referencia
        a la tabla encargada de la base de datos
        esta hace consultas repecto a esta base de datos.
    */

    public DefaultTableModel consultarPorID(String idCedula) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM encargada WHERE id_cedula=?");
            ps.setString(1, idCedula);
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

    public DefaultTableModel consultarPorDatos(String nombre, String apellidoP, String apellidoM) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM encargada WHERE nombre=?,apellido_pat=?,apellido_mat =?");
            ps.setString(1, nombre);
            ps.setString(2, apellidoM);
            ps.setString(3, apellidoP);
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

    public void eliminarPorId(int idCedula) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM encargada WHERE id_ben=?");

            ps.setInt(1, idCedula);
            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void eliminarPorDatos(String nombre, String apellidoP, String apellidoM) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM encargada WHERE nombre_ben=?,ape_pat=?,ape_mat=?");

            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);

            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void insertar(String idCedula, String usuario, String contraseña, String derechos, String nombre, String apellidoP, String apellidoM) {

        try {
            con = conexion.getConection();

            String sql = "INSERT INTO encargada(id_cedula, usuario, contraseña, derechos_admin, nombre, apellido_pat, apellido_mat) VALUES (?,?,?,?,?,?,?)";

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, idCedula);
            ps.setString(2, usuario);
            ps.setString(3, contraseña);
            ps.setString(4, derechos);
            ps.setString(5, nombre);
            ps.setString(6, apellidoP);
            ps.setString(7, apellidoM);
            int res = ps.executeUpdate();

            mensajeRegistro(res);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void modificar(String idCedulaActualizar, String usuario, String contraseña, String derechos, String nombre, String apellidoP, String apellidoM) {
        con = conexion.getConection();

        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE encargada SET usuario=?, contraseña=?, derechos_admin=?, nombre=?, apellido_pat=?, apellido_mat=? WHERE id_cedula=?");

            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ps.setString(3, derechos);
            ps.setString(4, nombre);
            ps.setString(5, apellidoP);
            ps.setString(6, apellidoM);
            ps.setString(7, idCedulaActualizar);

            int res = ps.executeUpdate();

            mensajeModificar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }


    public boolean existenciaLogin(String usuario,String contraseña) {
         con = conexion.getConection();
         String sql = "select * from encargada WHERE usuario=? and contraseña=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hubo un error con la base de datos.");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"No se pudo cerrar la conexion");
            }
        }
    }

    public boolean existenciaEncargadaID(String idCedula) {
         con = conexion.getConection();
         String sql = "select * from encargada WHERE id_cedula=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idCedula);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Hubo un error con la base de datos.");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"No se pudo cerrar la conexion");
            }
        }
    }
    
    public ArrayList<String> recuperarDatos(String usuario,String contraseña) {
        con = conexion.getConection();
        ArrayList<String> datos = new ArrayList<String>();
        
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM encargada WHERE usuario=? and contraseña=?");
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                datos.add(rs.getString(1)); //Cedula
                datos.add(rs.getString(2)); //Usuario
                datos.add(rs.getString(3)); //Contraseña
                datos.add(rs.getString(4)); // permisos admin
                datos.add(rs.getString(5)); // nombre
                datos.add(rs.getString(6)); //apellido paterno
                datos.add(rs.getString(7)); //apellido materno
            }
          //  return datos;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return datos;
    }
    
}
