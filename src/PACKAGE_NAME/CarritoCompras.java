package PACKAGE_NAME;

import java.util.ArrayList;

public class CarritoCompras {
    //ATRIBUTOS
    static ArrayList<Producto> productos  = new ArrayList<Producto>();
    double precioTotal;

    //CONSTRUCTORES
    public CarritoCompras() {
    }
    //GETTERS Y SETTERS
    public  ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }



    //METODOS
    public void agregarProducto(){
        Producto p1 = new Producto();
        p1.setNombreProducto("Celular Huawei p10");
        p1.setPrecioProducto(31000);
        p1.setDetalleProducto("Android 10.0, 3gb RAM, 64gb Memoria");
        Producto p2 = new Producto();
        Producto p3 = new Producto();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    }

    public static boolean obtenercantidadProductos(CarritoCompras carrito){
        carrito.agregarProducto();
       int cantidad= carrito.getProductos().size();
       if( cantidad>0){
           return true;
       }else
       return false;
    }

    public static boolean cantidad_no_mayor_stock(Producto p1){
        if (p1.getCantidad() <= p1.getStockdisponible()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean nombre_y_descripcion(Producto p1){
        if (p1.getNombreProducto() != "" && p1.getDetalleProducto() != ""){
            return true;
        } else {
            return false;
        }
    }

    public static double realizardescuento(Producto p1){
        double p_final= p1.getPrecioProducto()-p1.getPrecioProducto()*p1.getDescuento();
        return p_final;
    }
    public static String  obtenerdetalle(Producto p1) {
        return p1.getNombreProducto() +" "+ p1.getPrecioProducto() +" "+ p1.getDetalleProducto();
    }
    public static void agregarProducto(Producto p1){
        productos.add(p1);
    }
    public static boolean modificarcantidadProducto(Producto p1){
        if(p1.getCantidad()>0){
            return  true;
        }else
            return  false;
    }
}
