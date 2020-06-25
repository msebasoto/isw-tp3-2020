package SourcePackages;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCarritoCompras {
	
	@Test
	public void testCalculaTotal() {
		Producto producto1 = new Producto("monitor","periféricos",500.25,25);
		Producto producto2 = new Producto("mousepad","accesorios",500.25,25);
		CarritoCompras carrito = new CarritoCompras();
		carrito.agregarProducto(producto1);
		carrito.agregarProducto(producto2);
	        Double esperado = 1000.50;
	        Double real = carrito.calculaTotal();
	        assertEquals(esperado, real);
	}
	
	@Test
	public void testProductoTienePrecio() {
		Producto producto1 = new Producto("mouse", "periférico", 100.0, 10);
		boolean precioExistente = (Double) producto1.getPrecio() != (Double) null;
		assertTrue(precioExistente);
	}
	
	@Test
	public void testDatosClienteNoVacíos() {
		Localidad localidad1 = new Localidad("Ciudad de Mendoza", 200.0f);
		Domicilio domicilio1 = new Domicilio("Calle", 1, 5500, localidad1, "Mendoza", "Argentina");
		Cliente cliente1 = new Cliente("usuario", "contraseña", domicilio1);
		boolean datosNoVacios = (cliente1.getUsuario() != (String) null) & (cliente1.getContraseña() != (String) null) & (cliente1.getDomicilio() != (Domicilio) null);
		assertTrue(datosNoVacios);
	}

	@Test
	public void testCuentaProductosCarro(){
	    int esperado = 2;
	    Producto producto1 = new Producto("teclado","periféricos",1.0,2);
	    Producto producto2 = new Producto("pendrive","accesorios",1.0,2);
	    CarritoCompras ca1 = new CarritoCompras();
	    ca1.agregarProducto(producto1);
	    ca1.agregarProducto(producto2);
	    int real = ca1.getProductosEnCarro().size();
	    assertEquals(esperado, real);
	}
	
	@Test
	public void testCorroboraStockNoNulo(){
	    Boolean esperado = true;
	    Producto producto1 = new Producto("teclado","periféricos",1.0,2);
	    CarritoCompras ca1 = new CarritoCompras();
	    ca1.agregarProducto(producto1);
	    Boolean real = true;
	    for (int i=0; i<ca1.getProductosEnCarro().size(); i++){
            if (ca1.getProductosEnCarro().get(i).getCantidad() == 0){
                real = false;
            }
        }
	    assertEquals(esperado, real);
	 }
	
	@Test
	public void testPrecioUnitarioMenorIgualSubtotal(){
		double subtotal = 0.0;
		Producto producto1 = new Producto("Notebook a30","Tecnología",20000.0,2);
		double precioUnitario = producto1.getPrecio();
		int cantidadProductos = producto1.getCantidad();
		subtotal = subtotal + (precioUnitario*cantidadProductos);
		boolean verificarPrecioUnitario = precioUnitario <= subtotal;
		assertTrue(verificarPrecioUnitario);
	}

	@Test
	public void testEnvíoPositivo(){
		Localidad localidad1 = new Localidad ("Ciudad de Mendoza", 200.0f);
		boolean verificarCosto = localidad1.getCostoEnvio()>=0.0f;
		assertTrue(verificarCosto);
	}

	@Test
	public void testSoloProductosEnCarro() {
			boolean result = true;
		    Producto producto1 = new Producto("teclado","periféricos",1.0,2);
		    Producto producto2 = new Producto("pendrive","accesorios",1.0,2);
		    CarritoCompras ca1 = new CarritoCompras();
		    ca1.agregarProducto(producto1);
		    ca1.agregarProducto(producto2);
		    Producto elementoIdeal = new Producto();
		    for (int i = 0; i <ca1.getProductosEnCarro().size(); i++) {
		    	Producto elementoReal =  ca1.getProductosEnCarro().get(i);
		    	if(elementoReal.equals(elementoIdeal)) {
		    		result = false;
		    	}
	    		assertTrue(result);
		    }
	}
	
	
	

}
