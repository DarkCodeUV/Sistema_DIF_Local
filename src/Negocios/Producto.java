package Negocios;

import Datos.conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Producto extends DatabaseCon {

     /*
        Esta clase hace referencia
        a la producto encargada de la base de datos
        esta hace consultas repecto a esta base de datos.
    */

    
    public DefaultTableModel consultarPorID(int idProducto) {
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
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM productos WHERE id_producto=?");
            ps.setInt(1, idProducto);
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

    public void eliminarPorId(int idProductos) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM productos WHERE id_producto=?");

            ps.setInt(1, idProductos);
            int res = ps.executeUpdate();

            mensajeEliminar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void insertar(String idCedula, String nombreProducto, int cantidad, String categoria, String fecha) {
        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO productos(id_cedula, nombre_producto, cantidad, categoria, fecha) VALUES (?,?,?,?,?)");

            ps.setString(1, idCedula);
            ps.setString(2, nombreProducto);
            ps.setInt(3, cantidad);
            ps.setString(4, categoria);
            ps.setString(5, fecha);

            int res = ps.executeUpdate();

            mensajeRegistro(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void modificar(int idProductoActualizar, String idCedula, String nombreProducto, int cantidad, String categoria, String fecha) {
        con = conexion.getConection();

        try {
            con = conexion.getConection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE productos SET id_cedula=?,nombre_producto=?,cantidad=?,categoria=?,fecha=? WHERE id_producto=?");

            ps.setString(1, idCedula);
            ps.setString(2, nombreProducto);
            ps.setInt(3, cantidad);
            ps.setString(4, categoria);
            ps.setString(5, fecha);
            ps.setInt(7, idProductoActualizar);

            int res = ps.executeUpdate();

            mensajeModificar(res);
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    
    public boolean existenciaProductoID(int idProducto) {

        con = conexion.getConection();
        String sql = "select * from productos WHERE id_producto=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

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
    
     public ArrayList<String> recuperarProductos(int idProducto) {
        con = conexion.getConection();
        ArrayList<String> datos = new ArrayList<String>();
        
        try {
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM productos WHERE id_producto=?");
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                datos.add(rs.getString(1));
                datos.add(rs.getString(2)); 
                datos.add(rs.getString(3)); 
                datos.add(rs.getString(4)); 
                datos.add(rs.getString(5));
                datos.add(rs.getString(6)); 
               
            }
          //  return datos;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return datos;
    }
}
