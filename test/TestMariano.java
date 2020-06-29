import Clases.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestMariano {
    /*Variables*/
    Carrito carrito = null;
    Producto producto1 = null;
    DetalleProducto detallePrueba = null;
    List <DetalleProducto> detalles = null;
    Usuario usuario = null;
    
    /*Constructor de clase*/
    public TestMariano() {
        /*Variables inicializadas*/
        usuario = new Usuario("Mariano");
        producto1 = new Producto();       
      
    }
        
    @Before
    public void setUp() {
        /*le damos valor a las variables con los valores a usar con los test*/
        producto1.setNombreProducto("Impresora");
        producto1.setStockProducto(15);        
        usuario.loguearse();
    }
    
    /*Se crean los test usando @Test*/
    /*Test 5 Mariano*/
    @Test
    public void testVerificarComprarCarritoNoVacio() {
        System.out.println("Comprar Carrito");
        detalles = Arrays.asList(new DetalleProducto(producto1,1,1121));
        carrito = new Carrito(detalles, usuario);
        int expResult = 1;
        int result = carrito.cantidadTotalProductos();
        assertEquals(expResult, result);
    }
    
    /* Test 3 propuesto por Fernando */
    @Test
    public void AlRealizarLaCompraDe2UnidadesElStockSeReduceEn2() {
        System.out.println("Comprar 2 unidades");
        detalles = Arrays.asList(new DetalleProducto(producto1,2,1121));
        carrito = new Carrito(detalles, usuario);   
        carrito.comprarCarrito();
        int expResult = 13;
        int result = producto1.getStockProducto();
        assertEquals(expResult, result);
    }
}
