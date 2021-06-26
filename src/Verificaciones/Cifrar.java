
package Verificaciones;


public class Cifrar {
    
    /*
        La clase cifrar se le otorga una contreaseña y la devuelve cifrada
    
    */
    private String password;
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        String pass = new String(password);
        this.password = hash.sha1(pass);
    }
    
    
}
