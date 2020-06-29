package Excepciones;

public class NoEstaLogueadoException extends RuntimeException{
    public NoEstaLogueadoException (String mensaje){
        super (mensaje);
    }
    
}
