package Sinergia.TP_3;
public class Producto {
	private String nombre;
	private String descripcion;
	private int idProd;
	private float precio;
	private int stock;
	
	
	public Producto(String nombre, int idProd, String descripcion) {
		super();
		this.nombre = nombre;
		this.idProd = idProd;
		this.descripcion = descripcion;
		this.stock = 0;
		this.precio = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}