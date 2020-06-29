package Clases;

public class Usuario {
    private String nombreUsuario;
    private boolean log;
    
    public Usuario (String nombreUsuario){
        log = false;
        this.nombreUsuario = nombreUsuario;
    }
    
    public void loguearse (){
        log = true;
    }
    
    public void logOut (){
        log = false;
    }
    
    public boolean estaLogueado (){
        return log;
    }
}
