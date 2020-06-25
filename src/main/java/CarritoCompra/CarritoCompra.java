package CarritoCompra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Productos.Producto;

public class CarritoCompra {
	
	private List<Producto> items = new ArrayList() ;

	public CarritoCompra(List<Producto>items) {
		super();
		this.items = items;
	}
	
	public CarritoCompra() {
		super();
	}


	public double getTotalCarrito() {
		 double balance = 0;
		 for (Iterator i = items.iterator(); i.hasNext();) {
		 Producto item = (Producto)i.next();
		 balance += item.getPrecio();
		 }
		 return balance;
	}
	
	public void addItem(Producto item) {
		 items.add(item);
	 }

	 public void removeItem(Producto item) {
		 items.remove(item);
	 }

	 public int getCantidadItems() {
		 return items.size();
	 }

	 public void empty() {
		 items.clear();
	 }
	
//	 public float sumaPrecio(float p1, float p2) {
//        return p1 + p2;
//    }
    
    public float restaPrecio(float p1, float total) {
        return total - p1;
    }
    
    public float cargoEnvioDomicilio(float total, float cargoDomicilio) {
        return total + cargoDomicilio;
    }
    
    public float cargoEnvioSucursal(float total, float cargoSucursal) {
        return total + cargoSucursal;
    }
    
    public float sumaIntereses(float total, float cargoInteres){
        return total + cargoInteres;
    }
}
