package Excepciones;

public class NoSePuedeCrearUnCarritoVacioException extends RuntimeException{
    
    public NoSePuedeCrearUnCarritoVacioException(String mensaje){
        super(mensaje);
    }
}
