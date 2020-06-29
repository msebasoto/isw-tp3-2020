package Clases;

import Excepciones.CantidadDebeSerMayorACeroException;
import Excepciones.CantidadDebeSerMenorQueStockException;
import Excepciones.NoEstaLogueadoException;
import Excepciones.NoSePuedeCrearUnCarritoVacioException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Carrito {
    
    private Usuario usuario1;
    private List<DetalleProducto> detalles;
    
    public Carrito(List<DetalleProducto> detalles, Usuario usuario1){
        this.validarDetalles(detalles);
        this.validarUsuario(usuario1);
        this.usuario1=usuario1;
        this.detalles=detalles;
    }
    
    public List<DetalleProducto> getDetalles(){
        return this.detalles;
    }
    
    public void agregarProductoAlCarrito(DetalleProducto detalle){
        this.validarDetalle(detalle);
        this.validarUsuario(usuario1);
        this.detalles.add(detalle);
    }
    
    private void validarDetalles(List<DetalleProducto> detalles){
        
        if(detalles == null || detalles.isEmpty())
            throw new NoSePuedeCrearUnCarritoVacioException("El carrito no tiene productos asignados");
        detalles.forEach(detalle -> this.validarDetalle(detalle));
    }
    
    private void validarDetalle(DetalleProducto detalle){
         if(detalle.getCantidad()<=0)
            throw new CantidadDebeSerMayorACeroException("No se puede agregar una cantidad de producto menor o igual a 0 al carrito"); 
         if(detalle.getCantidad()>detalle.getProducto().getStockProducto())
            throw new CantidadDebeSerMenorQueStockException("La cantidad no puede ser mayor al stock del producto. "+ detalle.getProducto().getNombreProducto());
    }
    
    
    private void validarLimpiarCarrito(){
        if(this.detalles.size() != 0){
        
        }
    }
    
     public void LimpiarCarrito(){
        this.detalles = new ArrayList();
        validarLimpiarCarrito();
    }
     
     
     
    private void validarUsuario(Usuario usuario1){
        if (!usuario1.estaLogueado())
            throw new NoEstaLogueadoException("El usuario no está logueado");
    }
    
     public double montoTotalImpuestos(){
        return (montoTotalSinEnvio() * 0.21);
    }
    public double montoTotalEnvio(){
        return montoTotalSinEnvio() * 0.05;
    }
    

    
    public int montoTotalSinEnvio(){
        return this.detalles.stream()
                .map(detalle -> detalle.getMontoDetalle()).reduce(0, (a,b)-> a+b);
    }
    
    public double montoFinal(){
        return montoTotalSinEnvio() + montoTotalImpuestos() + montoTotalEnvio();
    }
    public int cantidadTotalProductos(){
        return this.detalles.stream()
                .map(detalle -> detalle.getCantidad()).reduce(0,(a,b)-> a+b);
    }
    
    public void borrarDetalle(int id){
        this.detalles.removeIf(detalle -> detalle.getId()==id);
    }
    
    public DetalleProducto buscarDetalle(int id){
        List<DetalleProducto> listaResultante = this.detalles.stream()
                .filter(detalle -> detalle.getId()==id).collect(Collectors.toList());
        if (listaResultante.isEmpty()){
            return null;
        } else{
            return listaResultante.get(0);
        }
    }
    
    public void comprarCarrito(){
        validarDetalles(detalles);
        detalles.forEach(detalle -> detalle.getProducto().setStockProducto(detalle.getProducto().getStockProducto()- detalle.getCantidad()));
    }
}
