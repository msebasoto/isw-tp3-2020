/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing;

import com.g5blackdesign.tp3testing.Controladores.ControladorCarrito;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author federico
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DetallesDelCarritoTest {
    
    static Producto producto1;
    static Producto producto2;
    static ControladorCarrito controladorcarrito;
    // ANTES DE INICIAR LOS TEST DEFINIMOS LOS VALORES UTILIZANDO UNA FUNCION
    @BeforeAll
    public static void CrearObjetosNecesarios() {
        producto1 = new Producto("NOTEBOOK LENOVO YOGA i5", "NOTEBOOK LENOVO YOGA CON PANTALLA TACTIL", (float) 200.57, 30);
        producto1.setId(45);
        producto2 = new Producto("DISCO NVME 1GB GREEN", "DISCO SSD NVME", (float) 100.55, 40);
        producto2.setId(65);
        controladorcarrito = new ControladorCarrito();
        
        controladorcarrito.expertocarrito.listproductos.add(producto1);
        controladorcarrito.expertocarrito.listproductos.add(producto2);
        DetalleCarrito detallecarrito = new DetalleCarrito(45, 10, 25);
        controladorcarrito.expertocarrito.CrearCarrito();
        controladorcarrito.AgregarDetalleCarrito(detallecarrito);
    }
    

    @ParameterizedTest()
    @DisplayName("Fallo al crear DetalleCarrito de Producto inexistente.")
    @CsvSource({"20,10,60"})
    void CrearDetalleCarritoDeProductoInexistente(final int idproducto, final int idcarrito, final int cantidad) {
        final DetalleCarrito detallecarrito = new DetalleCarrito(idproducto, idcarrito, cantidad);
        assertEquals(false, controladorcarrito.AgregarDetalleCarrito(detallecarrito));
    }
    
    @ParameterizedTest
    @DisplayName("Restar cantidad de DetalleCarrito mayor a cantidad actual en DetalleCarrito de Carrito")
    @CsvSource({"45,10,-80"})
    void RestarCantidadDetalleCarritoMayorACantidadActualEnCarrito(final int idproducto, final int idcarrito, final int cantidad){
        final DetalleCarrito detallecarrito2 = new DetalleCarrito(idproducto, idcarrito, cantidad);
        assertEquals("No puede quedar negativo", controladorcarrito.ModificarCantidadDetalleCarrito(detallecarrito2));
    }
}