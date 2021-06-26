package Datos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Busqueda extends Negocios.DatabaseCon {
    
    /*
        Esta clase contiene 2 busquedas
        estas son usadas para consultar un tabla 
        y devolver todos los datos que hay en ella y guardarlas en un arrayList
        dependiendo del parametro que se le pasó en este caso por el ID
    */
    

    public ArrayList<String>  buscarProductos(int idProducto) {
        ArrayList<String> datos = new ArrayList<String>();
        try {
            con = conexion.getConection();
            
            //String filtro =""+idProducto+"_%";
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM productos WHERE id_producto = ?");
       
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
            //System.out.println(datos.get(1));
            
            rs.close();
            ps.close();
             return datos;
        } catch (SQLException ex) {
           // System.err.println(ex);
           datos.add(1,"No existe el prdoducto");
           datos.add(2,"No existe el prdoducto");
           datos.add(3,"No existe el prdoducto");
           datos.add(4,"No existe el prdoducto");
           datos.add(5,"No existe el prdoducto");
           datos.add(6,"No existe el prdoducto");
        }
         return datos;

    }
    
     public ArrayList<String>  buscarBeneficiario(int idBeneficiario) {
        ArrayList<String> datos = new ArrayList<String>();
        try {
            con = conexion.getConection();
            
            //String filtro =""+idProducto+"_%";
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM beneficiario WHERE id_ben = ?");
       
            ps.setInt(1, idBeneficiario);
            rs = ps.executeQuery();

            
            while (rs.next()) {
                
                datos.add(rs.getString(1));
                datos.add(rs.getString(2));
                datos.add(rs.getString(3));
                datos.add(rs.getString(4));
                datos.add(rs.getString(5));
                datos.add(rs.getString(6));
                datos.add(rs.getString(7));
                datos.add(rs.getString(8));
            }
            //System.out.println(datos.get(1));
            
            rs.close();
            ps.close();
             return datos;
        } catch (SQLException ex) {
           // System.err.println(ex);
           datos.add(1,"No existe el beneficiario");
           datos.add(2,"No existe el beneficiario");
           datos.add(3,"No existe el beneficiario");
           datos.add(4,"No existe el beneficiario");
           datos.add(5,"No existe el beneficiario");
           datos.add(6,"No existe el beneficiario");
           datos.add(7,"No existe el beneficiario");
           datos.add(8,"No existe el beneficiario");
        }
         return datos;

    }
}
