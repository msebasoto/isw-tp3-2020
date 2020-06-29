package Sinergia.TP_3;

import java.util.ArrayList;
import java.util.stream.*;

public class Carro {
	private ArrayList<Detalle> detalles;
	private int idCarro;
	
	public Carro(int id, Detalle detalle) {
		idCarro = id;
		detalles = new ArrayList<Detalle>();
		detalles.add(detalle);
	}
	
	public void addDetalle (Detalle detalle) {
		detalles.add(detalle);
	}

	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	
	public static boolean cantMinCarro(Carro carrito) {
		return carrito.getDetalles().size() < 1 ? false : true;
	}
	
	public void realizarCompra() {
		for (Detalle e : detalles) {
			//Se reduce la cantidad de stock por cantidad de ventas
			e.getProducto().setStock(e.getProducto().getStock()-e.getCantidad());
						
		}
	}
	public void eliminarDetalle(int idDetalle) {
		for(int i = 0 ; i < detalles.size() ; i++) {
			if(idDetalle == detalles.get(i).getIdDetalle()) {
				detalles.remove(i);
			}
		}
	}
}
