package CarritoCompra;

import junit.framework.Test;

import static org.junit.Assert.assertNotEquals;

import com.Productos.Producto;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CarritoCompraTest extends TestCase {
	
	private CarritoCompra carrito1;
	private Producto prod1;
	private Producto prod2;
	
	public static Test suite() {
		 TestSuite suite = new TestSuite(CarritoCompraTest.class);
		 return (Test) suite;
	}

	@Override
	public void setUp() throws Exception {
		carrito1 = new CarritoCompra();

		prod1 = new Producto("P001", "Notebook Lenovo L340 15,6'", 
					"Notebook Gamer Lenovo L340 15,6' Core i5 + 9300H 8GB 1TB + 256NVMe GTX 1050 #GB Win 10", 92416);
		
		prod2 = new Producto("P002", "Casco Realidad Virtual Samsung Gear VR Blue", "Casco Realidad Virtual Samsung Gear VR Blue Back Powered By Oculus", 1830);
		
		carrito1.addItem(prod1);
		carrito1.addItem(prod2);
	}

	@Override
	public void tearDown() throws Exception {
		carrito1 = null;
		prod1 = null; 
	}

	/** SE DEBE PODER SUMAR EL PRECIO DE LOS PRODUCTOS PARA OBTENER EL TOTAL */
	public void testSumaPrecioProducto() {
		double expResult = 94246;
		double result = carrito1.getTotalCarrito();
		assertEquals(expResult, result);
	 }

	/** SE DEBE PODER REMOVER UN PRODUCTO DEL CARRITO DE COMPRA */
	public void testRemoverItem() {
	 carrito1.removeItem(prod1);
	 carrito1.removeItem(prod2);
	 assertEquals(0, carrito1.getCantidadItems());
	 }
	

    /** SE DEBE PODER RESTAR EL VALOR DE UN PRODUCTO QUITADO AL TOTAL */
    
    public void test_calcula_total_resta() {

        final float total = 259.99f;
        final float precioUno = 159.99f;

        final CarritoCompra calcula = new CarritoCompra();

        assertEquals(100.00f, calcula.restaPrecio(precioUno, total), 0.0001f);

    }

    /** SE DEBE PODER SUMAR EL ENVÍO A DOMICILIO AL TOTAL DE LA COMPRA */
    
    public void test_suma_cargo_envio_domicilio() {

        final float total = 200.00f;
        final float cargoEnvioDomicilio = 50.00f;

        final CarritoCompra calcula = new CarritoCompra();

        assertEquals(250.00f, calcula.cargoEnvioDomicilio(total, cargoEnvioDomicilio), 0.0001f);

    }

     /**
     * SE DEBE PODER AGREGAR EL INTERES DE LA TARJETA DE CREDITO AL TOTAL DE LA COMPRA
     */
    
    public void test_suma_cargo_tarjeta() {
        final float total = 250.00f;
        final float cargoInteres = 50.00f;

        final CarritoCompra calcula = new CarritoCompra();

        assertEquals(300.00f, calcula.sumaIntereses(total, cargoInteres), 0.0001f);

    }
    /**
     * VERIFICAR QUE LA CANTIDAD DEL PRODUCTO NO SEA 0
    */    
    public void test_cantidad_producto(){

        //final CarritoCompra calcula = new CarritoCompra();
        int cantidadProducto = carrito1.getCantidadItems(); 
        assertNotEquals(0, cantidadProducto);
    }

    /**
     * VERIFICAR QUE EL NOMBRE DEL PRODUCTO NO SEA NULO
     */
    public void test_nombre_producto(){

        final String nombreProd = prod1.getTitulo();
        final String resultadoNoEsperado = null;

        assertNotEquals (resultadoNoEsperado, nombreProd);

    }


}
