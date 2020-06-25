package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarritoComprasTest {
    CarritoCompras carrito = new CarritoCompras();
    Producto p1 = new Producto("Celular Huawei p10",31000,"Android 10.0, 3gb RAM, 64gb Memoria");
    Producto p3 = new Producto("Xiaomi Mi band 4","Smartband 0.95",3000,5,1,0.5);
    Producto p2 = new Producto("Mouse HyperX PulseFire Surge", "Mouse gamer con luces RGB", 2300, 5,3);
    Producto p4 = new Producto("Notebook Hp Omen i7","Laptop Omen by HP, intel i7, 8GB RAM",130000,2,1);
    Producto p5 = new Producto("Monitor Samsumg 23","Resolucion 1080x1920, 75Hz, Retardo 1ms",22000,50,1);

    //Test David
    @Test
    public void test_minimo_un_producto_asociado(){

        boolean res_obtenido = CarritoCompras.obtenercantidadProductos(carrito);
        boolean res_esperado = true;
        assertEquals(res_esperado,res_obtenido);
    }

    @Test
    public void test_obtener_descripcion_producto(){
        String res_obtenido = CarritoCompras.obtenerdetalle(p1);
        String res_esperado = "Celular Huawei p10 31000.0 Android 10.0, 3gb RAM, 64gb Memoria";
        assertEquals(res_esperado,res_obtenido);
    }
//Test Diego Atencia
    @Test
    public void testCantidadStock(){
        boolean resultado = CarritoCompras.cantidad_no_mayor_stock(p2);
        boolean esperado = true;
        assertEquals(esperado,resultado);

    }

    @Test
    public void testNombreDescripcion(){
        boolean resultado = CarritoCompras.nombre_y_descripcion(p2);
        boolean esperado = true;
        assertEquals(esperado,resultado);
    }
//Test Diego Di Leo

    @Test
    public void test_verificar_descuento(){
        double resultado = CarritoCompras.realizardescuento(p3);
        double esperado = 1500;
        assertEquals(esperado,resultado,0);
    }
    @Test
    public void controlar_cantidad_noseanula (){
        boolean resultado_obtenido = Producto.controlCantidad(p4);
        boolean resultado_esperado = true;
        Assert.assertEquals(resultado_esperado,resultado_obtenido);
    }

    //Test Matias
    @Test
    public void agregar_producto_no_afecta_stock(){
        CarritoCompras.agregarProducto(p5);
        assertEquals(50,p5.getStockdisponible());
    }

    @Test
    public void no_modificar_cantidad_producto_en_0_o_menos(){
       boolean obtenido= CarritoCompras.modificarcantidadProducto(p5);
        assertEquals(true,obtenido);
    }
}