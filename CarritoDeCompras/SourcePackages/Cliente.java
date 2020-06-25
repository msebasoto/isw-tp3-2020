package SourcePackages;

public class Cliente {
	private String usuario;
	private String contraseña;
	private Domicilio domicilio;
	
	public Cliente(String usuario, String contraseña, Domicilio domicilio) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.domicilio = domicilio;
	}

	public Cliente() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	
}
