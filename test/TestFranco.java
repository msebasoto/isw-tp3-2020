
import Clases.Carrito;
import Clases.DetalleProducto;
import Clases.Producto;
import Clases.Usuario;
import Excepciones.CantidadDebeSerMayorACeroException;
import Excepciones.NoSePuedeCrearUnCarritoVacioException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francogregorio
 */
public class TestFranco {
     Carrito carrito = null;
     Producto producto1 = null;
    Producto producto2 = null;
    DetalleProducto detallePrueba = null;
    List <DetalleProducto> detalles = null;
    Usuario usuario = null;
      
     public TestFranco() {
       usuario = new Usuario("Franco");
       producto1 = new Producto();
       producto2 = new Producto();
     }
    @Before
      public void setUp() {
        
        usuario.loguearse();
        producto1.setPrecioProducto(100);
        producto2.setPrecioProducto(200);
        producto1.setStockProducto(20);
       producto2.setStockProducto(20);
    detalles = Arrays.asList(new DetalleProducto(producto1,1,100), new DetalleProducto(producto2,2,100));
        carrito = new Carrito(detalles, usuario);
    }
    /* Test 5 propuesto por Franco */
    @Test
    public void testVerificacionLimpiarCarrito() {
        System.out.println("Limpiar Carrito despues de realizar compra");
        carrito.comprarCarrito();
        carrito.LimpiarCarrito();
        
        int expResult = 0;
        int result = carrito.getDetalles().size();
        
        assertEquals(expResult, result);
    }
    
    /* Test 3 propuesto por Franco */
    @Test
    public void VerificarLogueoAntesDeComprar() {
        System.out.println("Verificar que este logueado antes de Comprar");

         if (usuario.estaLogueado()){  
             carrito.comprarCarrito();
         }
    }
}
