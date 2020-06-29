package Sinergia.TP_3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class AppTest {
	
	//Debe haber un método que verifique que la cantidad de los productos no sea nula
	@Test
	public void carritoConMasDe1ProductoAsociado() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		
		//Act
		Carro carrito = new Carro(1, detalle);
		
		//Assert
		assertNotNull(carrito.getDetalles());
	}
	
	//Debe haber un método para determinar la cantidad de productos seleccionados
	@Test
	public void cantidadDelProductoIndicada(){
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		
		//Act
		int cantidad = detalle.getCantidad();

		//Assert
		assertNotNull(cantidad);
	}
	
	//Debe haber un método que verifique que la cantidad no supere al stock existente
	@Test
	public void cantidadDetalleNoMayorQueStock() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);		
		producto.setStock(10);
		detalle.setCantidad(2);
		
		//Act
		carrito.realizarCompra();
		//Assert
		assertEquals(8, producto.getStock());		
	}

	//Debe haber un método que actualice el stock de productos tras una compra
	@Test
	public void modificarStockLuegoDeCompra() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);
		
		producto.setStock(10);
		int expected = producto.getStock() - detalle.getCantidad();
		//Act
		carrito.realizarCompra();
		//Assert
		assertEquals(expected, producto.getStock());
		
	}
	
	//Debe haber un método que verifique que cuando un detalle se eliminó del carrito 
	//siga existiendo el producto en la base de datos
	@Test
	public void eliminarDetalleDelCarroSinEliminarElProducto() {
		//Arrange
		Producto producto = new Producto("martillo", 2123, "el mas duro");
		Detalle detalle = new Detalle(producto, 2,1);
		Carro carrito = new Carro(1, detalle);
		//Act
		carrito.eliminarDetalle(detalle.getIdDetalle());
		//Assert
		assertAll("detalle",
				()->assertEquals(0, carrito.getDetalles().size()),
				()->assertNotNull(producto)
		);
		
	}

	//Debe haber un método que permita cambiar la cantidad de un producto en el detalle del carro
	@Test
	public void cambiarCantidadDelDetalleDelCarro() {
		//Arrange
		Producto producto = new Producto("Martillo", 2123, "El más duro");
		Detalle detalle = new Detalle(producto, 2, 1);
		
		//Act
		producto.setStock(5);
		int cantidad = 4;
		detalle.setCantidad(cantidad);

		//Assert
		assertEquals(cantidad, detalle.getCantidad());
	}

	//Debe haber un método que permita cambiar el precio de los productos
	@Test
	public void cambiarPrecioDelProducto() {
		//Arrange
		Producto producto = new Producto("Martillo", 2123, "El más duro");

		//Act
		float precio = (float)290.3;
		producto.setPrecio(precio);

		//Assert
		assertEquals(precio, producto.getPrecio());
	}

	//Debe haber un método que permita obtener el stock de algún producto
	@Test
	public void obtenerStockDelProducto() {
		//Arrange
		Producto producto = new Producto("Martillo", 2123, "El más duro");

		//Act
		int stock = producto.getStock();

		//Assert
		assertNotNull(stock);

	}

	//Debe haber un método que permita cambiar la descripción de algún producto
	@Test
	public void cambiarDescripcionDelProducto() {
		//Arrange
		Producto producto = new Producto("Martillo", 2123, "El más duro");

		//Act
		String descripcion = "El segundo más duro";
		producto.setDescripcion(descripcion);

		//Assert
		assertEquals(descripcion, producto.getDescripcion());

	}
	
}
    
