package Negocios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DatabaseCon {

    /*
        Esta clase nos sirve de auxiliar 
        para nuestras otras 4 clases del mismo paquete
        para cuando registramos algun dato en nyestra 
        base de datos, con esto comprobamos si se guardó o no,
        maandando asi alguno de estos mensajes.
    
    */
    
    protected PreparedStatement ps;
    protected ResultSet rs;
    protected Connection con = null;

    protected void mensajeRegistro(int res) {
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");

        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar registro");
        }
    }

    protected void mensajeModificar(int res) {
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Moficado con éxito");

        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
    }

    protected void mensajeEliminar(int res) {
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
    }
}
