package SourcePackages;

public class Domicilio {
	
	private String calle;
	private int numero;
	private int codPostal;
	private Localidad localidad;
	private String provincia;
	private String pais;
	
	public Domicilio() {
	}

	public Domicilio(String calle, int numero, int codPostal, Localidad localidad, String provincia, String pais) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

	
	
}
