package SourcePackages;

public class Localidad {
	
	private String nombre;
	private float costoEnvio;
	
	
	public Localidad() {
	}

	public Localidad(String nombre, float costoEnvio) {
		this.nombre = nombre;
		this.costoEnvio = costoEnvio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(float costoEnvio) {
		this.costoEnvio = costoEnvio;
	}

	
}
