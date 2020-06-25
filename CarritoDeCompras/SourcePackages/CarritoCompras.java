package SourcePackages;

import java.util.ArrayList;

public class CarritoCompras {
	
	private ArrayList<Producto> productosEnCarro = new ArrayList<Producto>();

	    public CarritoCompras() {
	    }


	    public CarritoCompras(ArrayList<Producto> productosEnCarro) {
			this.productosEnCarro = productosEnCarro;
		}


		public ArrayList<Producto> getProductosEnCarro() {
			return productosEnCarro;
		}

		public void agregarProducto(Producto producto) {
			this.productosEnCarro.add(producto); 
		}

		public void setProductosEnCarro(ArrayList<Producto> productosEnCarro) {
			this.productosEnCarro = productosEnCarro;
		}

		public Double calculaTotal(){
		    Double suma = 0.0;
		    for (int i=0; i<productosEnCarro.size(); i++){
		        suma = suma + productosEnCarro.get(i).getPrecio();
		    }
		    return suma;
		}
		public int cuentaProductosCarro(){
		    int cuenta = 0;
		    for(int i=0; i<productosEnCarro.size(); i++){
		         cuenta++;
		}
		return cuenta;
		}

		public Boolean corroboraStockNoNulo(){
			for (int i=0; i<productosEnCarro.size(); i++){
		        if (productosEnCarro.get(i).getCantidad() == 0){
		            return false;
		        }
		    }
		    return true;
		}

		public Double comprar(){
		    if (cuentaProductosCarro()>0){ } 
		    else {
		        System.out.println("Error de compra, no hay artículos en el carro");
		         return null;
		     }

		    if (corroboraStockNoNulo()){
		        return calculaTotal(); 
		    } 
		    else {
		        System.out.println("Error de compra, no hay stock");
		        return null;
		    }
		}
	}
