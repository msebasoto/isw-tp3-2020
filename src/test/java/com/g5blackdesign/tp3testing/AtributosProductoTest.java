package com.g5blackdesign.tp3testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;



@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)

class TestAtributosproducto{

    static Producto producto1=new Producto("PC AMD RYZEN 3700 PLACA DE VIDEO RX 580 8GB ", "PC GAMER", 1250);
   
    @Test
    public void testNombreNoDebeEstarVacio(){
        assertNotEquals("", producto1.getNombre());
    }

    @Test
    public void testPrecioProductoMayorIgualCero() {

        final float precioReal = producto1.getPrecio();
        assertEquals(true, precioReal>=0);
        
   }

}
