import Clases.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestFernando {
    /*Variables*/
    Carrito carrito = null;
    Producto producto1 = null, producto2 = null, producto3 = null;
    DetalleProducto detallePrueba = null;
    List <DetalleProducto> detalles = null;
    Usuario usuario = null;
    
    /*Constructor de clase*/
    public TestFernando() {
        /*Variables inicializadas*/
        usuario = new Usuario("Fernando");
        producto1 = new Producto();
        producto2 = new Producto();
        producto3 = new Producto();
       
    }
        
    @Before
    public void setUp() {
        /*le damos valor a las variables con los valores a usar con los test*/
        producto1.setNombreProducto("Notebook");
        producto1.setStockProducto(10);
        producto2.setNombreProducto("Smartphone Samsung");
        producto2.setStockProducto(10);
        producto3.setNombreProducto("Heladera");
        producto3.setStockProducto(10);
        usuario.loguearse();
    }
    
    /*Creamos los test usando @Test*/
    /*Test 1*/
    @Test
    public void cantidadTotalDeProductosDelCarritoEsLaSumaDeLasCantidadesDeCadaProducto(){
       
        detalles = Arrays.asList(new DetalleProducto(producto1,3,111),new DetalleProducto(producto2,4,222),new DetalleProducto(producto3,5,333));
        this.carrito = new Carrito(detalles,usuario);
        
        assertEquals(12,carrito.cantidadTotalProductos());
    }
    
    /* Test 5*/
    @Test
    public void montoTotalSinCostoDeEnvioDelCarritoEsLaSumaDeLaCantidadDelProductoXSuPrecio(){
        
        producto1.setPrecioProducto(10);
        producto2.setPrecioProducto(80);
        detalles = Arrays.asList(new DetalleProducto(producto1,5,111),new DetalleProducto(producto2,8,222));
        this.carrito = new Carrito(detalles,usuario);
        
        assertEquals(690,carrito.montoTotalSinEnvio());
    }
}
