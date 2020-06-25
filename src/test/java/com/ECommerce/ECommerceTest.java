package com.ECommerce;

import junit.framework.Test; 

import com.Productos.ProductoTest;

import CarritoCompra.CarritoCompraTest;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ECommerceTest extends TestCase {

	public ECommerceTest(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("ECommerceTest");
		suite.addTest(ProductoTest.suite());
		suite.addTest(CarritoCompraTest.suite());
		return (Test) suite;
	}
	
	protected void setUp() throws Exception {
		 super.setUp();
	}
	
	protected void tearDown() throws Exception {
		 super.tearDown();
	}

}
