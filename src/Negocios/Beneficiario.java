package Negocios;

import Datos.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Beneficiario extends DatabaseCon {

    /*
        Esta clase hace referencia
        a la tabla beneficiario de la base de datos
        esta hace consultas repecto a esta base de datos.
    */
    
    
    public DefaultTableModel consultarID(int idBeneficiario) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM beneficiario WHERE id_ben=?");
            ps.setInt(1, idBeneficiario);
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

    public DefaultTableModel consultarPorDatos(String nombre, String apellidoP, String apellidoM) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM beneficiario WHERE nombre_ben=? and ape_pat=? and ape_mat=?");
            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
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

    public void eliminarPorId(int idBeneficiario) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM beneficiario WHERE id_ben=?");

            ps.setInt(1, idBeneficiario);
            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void eliminarPorDatos(String nombre, String apellidoP, String apellidoM) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM beneficiario WHERE nombre_ben=?,ape_pat=?,ape_mat=?");

            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);

            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void insertar(String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion, String comunidad) {

        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO beneficiario(nombre_ben, ape_pat, ape_mat, edad, telefono, direccion, comunidad) VALUES (?,?,?,?,?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
            ps.setInt(4, edad);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, comunidad);
            int res = ps.executeUpdate();

            mensajeRegistro(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void modificar(int idBeneficiarioActualizar, String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion, String comunidad) {
        con = conexion.getConection();

        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE beneficiario SET nombre_ben=?,ape_pat=?,ape_mat=?,edad=?,telefono=?,direccion=?,comunidad=? WHERE id_ben=?");

            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
            ps.setInt(4, edad);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, comunidad);
            ps.setInt(8, idBeneficiarioActualizar);

            int res = ps.executeUpdate();

            mensajeModificar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }
    
        
   public boolean existenciaBeneficiarioID(int idBeneficiario) {
         con = conexion.getConection();
         String sql = "select * from beneficiario WHERE id_ben=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idBeneficiario);
            
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
   
   public boolean existenciaBeneficiarioDatos(String nombre,String apellidoP,String apellidoM) {
                 try {
                     con = conexion.getConection();
         String sql = "select * from beneficiario WHERE nombre_ben=? and ape_pat=? and ape_mat=?";

            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellidoP);
            ps.setString(3, apellidoM);
            
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
}