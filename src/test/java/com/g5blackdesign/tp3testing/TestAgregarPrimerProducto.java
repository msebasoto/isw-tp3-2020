/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing;

import com.g5blackdesign.tp3testing.Entidades.Producto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author David
 */
public class TestAgregarPrimerProducto {   
    
    Carrito carrito = new Carrito();
    @ParameterizedTest
    @CsvSource({"PC 1 - I5 , i5-4gb-1TB-HDMI , 700.66"})
    public void AgregarPrimerProductoCarrito(String nombre, String descripcion, float precio){  
        Producto producto1test = new Producto(nombre, descripcion, precio);
        assertEquals(true,carrito.CrearCarrito(producto1test));                
    }       

}