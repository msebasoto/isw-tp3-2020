import Clases.*;
import Excepciones.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestMauri {
    Carrito carrito = null;
    Producto producto1 = null;
    DetalleProducto detallePrueba = null;
    List <DetalleProducto> detalles = null;
    Usuario usuario = null;
    
    public TestMauri() {
       usuario = new Usuario("Mauricio");
       producto1 = new Producto();
 
    }

    @Before
    public void setUp() {
        
        producto1.setNombreProducto("PC Escritorio");
        producto1.setStockProducto(10);
        usuario.loguearse();
    }
    
    /* Test 2 */
    @Test(expected = NoSePuedeCrearUnCarritoVacioException.class)
    public void noDeberiaPoderCrearUnCarritoVacio(){
        
        this.carrito = new Carrito(new ArrayList<DetalleProducto>(),usuario);
    }
    
    /* Test 3 */
    @Test(expected = CantidadDebeSerMayorACeroException.class)
    public void noDeberiaPoderCrearCarritoConUnProductoConCantidadIgualACero(){
        
        this.carrito = new Carrito(Arrays.asList(new DetalleProducto(producto1,0,111)),usuario);
    }

    
    
    
    
}
