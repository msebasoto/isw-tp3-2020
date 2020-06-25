package com.Productos;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProductoTest extends TestCase{
	
	private Producto prod1;
	
	public ProductoTest(String testName) {
		 super(testName);
		 }
	
	public static Test suite() {
		 TestSuite suite = new TestSuite(ProductoTest.class);
		 return (Test)suite;
		 } 
	
	@Override
	protected void setUp() throws Exception {
	prod1 = new Producto("P001", "Notebook Lenovo L340 15,6'", 
			"Notebook Gamer Lenovo L340 15,6' Core i5 + 9300H 8GB 1TB + 256NVMe GTX 1050 #GB Win 10", 92.416);
	}
	@Override
	protected void tearDown() throws Exception {
	prod1 = null;
	}
	
	
	/**
	 * SE DEBE PODER OBTENER EL CODIGO DEL PRODUCTO
	 */
	public void testGetCodigo() {
		String expResult = "P001";
		String result = prod1.getCodigo();
		assertEquals(expResult, result);
	 }
	 
	/**
	 * SE DEBE PODER OBTENER LA DESCRIPCION DEL PRODUCTO
	 */
	 public void testGetDescripcion(){
		String resultadoEsperado = "Notebook Gamer Lenovo L340 15,6' Core i5 + 9300H 8GB 1TB + 256NVMe GTX 1050 #GB Win 10";
		String resultado = prod1.getDescripcion();
		assertEquals(resultadoEsperado, resultado);
	 }
 
	 /**
	  * SE DEBE PODER OBTENER EL PRECIO DE UN PRODUCTO
	  */
	 public void testGetPrecio(){
		 double resultadoEsperado = 92.416;
		 double resultado = prod1.getPrecio();
		 assertEquals(resultadoEsperado, resultado);
	 }


}
