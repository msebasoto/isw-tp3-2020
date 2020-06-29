package Excepciones;

public class CantidadDebeSerMayorACeroException extends RuntimeException{
    
    public CantidadDebeSerMayorACeroException(String mensaje){
        super(mensaje);
    }
    
}
