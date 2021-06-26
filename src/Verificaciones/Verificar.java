package Verificaciones;

public class Verificar {

     /*
       Esta clase verifica si las entradas de los inputs usadas en los
        JFrame se llenaron y no quedaron vacios.
    */
    
    public boolean beneficiarioEmpy(String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion, String comunidad) {
        if (nombre.equals("") || apellidoP.equals("") || apellidoM.equals("") || String.valueOf(edad).equals("") || telefono.equals("") || direccion.equals("") || comunidad.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean encargadaEmpy(String idCedula, String usuario, String contraseña, String derechos, String nombre, String apellidoP, String apellidoM) {
        if (idCedula.equals("") || usuario.equals("") || contraseña.equals("") || derechos.equals("") || nombre.equals("") || apellidoP.equals("") || apellidoM.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean entregaEmpty(int idBeneficiario, String idCedula, String fecha, int idProducto, String hora, float cantidad) {
        if (String.valueOf(idBeneficiario).equals("") || idCedula.equals("") || fecha.equals("") || String.valueOf(idProducto).equals("") || hora.equals("") || Float.toString(cantidad).equals("")) {
            return true;
        }
        return false;
    }

    public boolean productoEmpty(String idCedula, String nombreProducto, int cantidad, String categoria, String fecha) {
        if (idCedula.equals("") || nombreProducto.equals("") || String.valueOf(cantidad).equals("") || categoria.equals("") || fecha.equals("")) {
            return true;
        }
        return false;
    }

    public boolean buscarBeneficiarioEmptyID(int idBeneficiario) {
        if (String.valueOf(idBeneficiario).equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarBeneficiarioEmptyDatos(String nombre, String apellidoP, String apellidoM) {
        if (nombre.equals("") || apellidoP.equals("") || apellidoM.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarEnCargadosEmptyID(String idCedula) {
        if (idCedula.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarEntregaEmptyID(int idEntrega) {
        if (String.valueOf(idEntrega).equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean buscarProductoEmptyID(int idProducto) {
        if (String.valueOf(idProducto).equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean beneficiarioEditarEmpty(int idBeneficiarioActualizar, String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion, String comunidad) {
        if (String.valueOf(idBeneficiarioActualizar).equals("") || nombre.equals("") || apellidoP.equals("") || apellidoM.equals("") || String.valueOf(edad).equals("") || telefono.equals("") || direccion.equals("") || comunidad.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean encargadaEditarEmpy(String idCedulaActualizar, String usuario, String contraseña, String derechos, String nombre, String apellidoP, String apellidoM) {
        if (idCedulaActualizar.equals("") || usuario.equals("") || contraseña.equals("") || derechos.equals("") || nombre.equals("") || apellidoP.equals("") || apellidoM.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean productoEditarEmpty(int idProducto, String idCedula, String nombreProducto, int cantidad, String categoria, String fecha) {
        if (String.valueOf(idProducto).equals("") || idCedula.equals("") || nombreProducto.equals("") || String.valueOf(cantidad).equals("") || categoria.equals("") || fecha.equals("")) {
            return true;
        }else{
             return false;
        }
       
    }

    public boolean loginEmpty(String usuario,String contraseña){
        if(usuario.equals("") || contraseña.equals("")){
            return true;
         }else{
             return false;
        }
    }
    
}
