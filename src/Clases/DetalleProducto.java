package Clases;


public class DetalleProducto {
     private int cantidad = 0;
    private int id = 0;
    private Producto producto = null;
    
    public DetalleProducto(Producto producto,int cantidad, int id){
        this.producto=producto;
        this.cantidad=cantidad;
        this.id=id;
    }
    
    public DetalleProducto(Producto producto,int id){
        this.producto=producto;
        this.id=id;
    }    
    
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public int getMontoDetalle(){
        return this.cantidad * this.producto.getPrecioProducto();
    }
    
    public int getId(){
        return this.id;
    }
    
    public Producto getProducto(){
        return this.producto;
    }
}
