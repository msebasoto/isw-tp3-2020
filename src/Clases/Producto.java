package Clases;

public class Producto {
    private String codigoProducto;
    private String nombreProducto;
    private int precio;
    private int stock;
    
    public Producto(){
        
    }
    
    public Producto(String codigoProducto,String nombreProducto){
        this.codigoProducto=codigoProducto;
        this.nombreProducto=nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public int getPrecioProducto(){
        return this.precio;
    }
    
    public void setPrecioProducto(int precio){
        this.precio = precio;
    }
    
       public int getStockProducto(){
        return this.stock;
    }
    
    public void setStockProducto(int stock){
        this.stock = stock;
    }
}
