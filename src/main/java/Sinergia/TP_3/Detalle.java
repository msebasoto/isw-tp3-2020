package Sinergia.TP_3;

public class Detalle {
	private int idDetalle;
	private Producto producto;
	private int cantidad;
	private float subtotal;
	public Detalle(Producto producto, int cantidad,int idDetalle) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.idDetalle = idDetalle;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		if (cantidad <= this.producto.getStock()){
			this.cantidad = cantidad;
		}
		else {
			this.cantidad = this.producto.getStock();
		}
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}
	
	
}