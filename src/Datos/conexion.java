package Datos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexion extends javax.swing.JFrame {
    
    /*
       Aqui va la configuracion de la base de datos
       direccion ip,pueto y la base de datos
       usuario
       contraseña
    */

    public static final String URL= "jdbc:mysql://localhost:3306/dif";
    public static final String USERNAME= "root";
    public static final String PASSWORD= "";

    @SuppressWarnings("unchecked")
                      
    public static Connection getConection()
    {
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}