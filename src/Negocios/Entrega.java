package Negocios;

import Datos.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Entrega extends DatabaseCon {

     /*
        Esta clase hace referencia
        a la entregas encargada de la base de datos
        esta hace consultas repecto a esta base de datos.
    */

    
    public DefaultTableModel consultarID(int idEntrega) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM entregas WHERE id_entrega=?");
            ps.setInt(1, idEntrega);
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

    public void eliminarId(int idEntrega) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM entregas WHERE id_entrega=?");

            ps.setInt(1, idEntrega);
            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void insertar(int idBeneficiario, String idCedula, String fecha, int idProducto, String hora, float cantidad) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO entregas(id_ben,id_cedula,fecha,id_producto,hora,cantidad) VALUES (?,?,?,?,?,?)");

            ps.setInt(1, idBeneficiario);
            ps.setString(2, idCedula);
            ps.setString(3, fecha);
            ps.setInt(4, idProducto);
            ps.setString(5, hora);
            ps.setFloat(6, cantidad);

            int res = ps.executeUpdate();

            mensajeRegistro(res);
        } catch (Exception e) {
            System.err.print(e);
        }

    }

    public void modificar(int idEntregaActualizar, int idBeneficiario, String idCedula, String fecha, int idProducto, String hora, float cantidad) {
        con = conexion.getConection();

        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE entregas SET id_ben=?, id_cedula=?, fecha=?, id_producto=?, hora=?, cantidad=? WHERE id_entrega=?");

            ps.setInt(1, idBeneficiario);
            ps.setString(2, idCedula);
            ps.setString(3, fecha);
            ps.setInt(4, idProducto);
            ps.setString(5, hora);
            ps.setFloat(6, cantidad);
            ps.setInt(7, idEntregaActualizar);

            int res = ps.executeUpdate();

            mensajeModificar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public boolean existenciaEntregas(int idBeneficiario, String idCedula, int idProducto, float cantidad) {

        con = conexion.getConection();
        String sql = "select * from entregas WHERE id_ben=? and id_cedula=? and id_producto=? and cantidad=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idBeneficiario);
            ps.setString(2, idCedula);
            ps.setInt(3, idProducto);
            ps.setFloat(4, cantidad);

            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error con la base de datos.");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
            }
        }
    }

    public boolean existenciaEntregasID(int idEntrega) {

        con = conexion.getConection();
        String sql = "select * from entregas WHERE id_entrega=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEntrega);

            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error con la base de datos.");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
            }
        }
    }
}
