
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
*/
package com.g5blackdesign.tp3testing;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.Usuario;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Controladores.ControladorUsuario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ignacio
 */
public class IgnacioTest {
    
        static Carrito carrito ;
        static Usuario usuario;
        static List<DetalleCarrito> listaDetalleCarrito;
        static DetalleCarrito detalleCarrito;
        static ControladorUsuario controladorUsuario; 
        static Producto producto1;
        
      
        
   
    
        @ParameterizedTest
        @CsvSource({"Ignacio,Galvez,35678392,lafg@mail.com"})
            void CrearUsuarioConCarroVacío(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                listaDetalleCarrito = new ArrayList();
                carrito = new Carrito(listaDetalleCarrito);
                controladorUsuario = new ControladorUsuario();
                assertEquals(false,controladorUsuario.getExpertoUsuario().CrearUsuario(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
            
            
        @ParameterizedTest
        @CsvSource({"S3rg10,Gonzalez,35678392,lafg@mail.com"})
            void CrearUsuarioConNombreconNumeros(final String nombreCliente, final String apellidoCliente, final String dniCliente,final String mailCliente) {
                producto1 = new Producto("Pc","samsung i5 con 8 gb",10000f);
                producto1.setId(1);
                detalleCarrito = new DetalleCarrito(1,1,1);
                listaDetalleCarrito = new ArrayList();
                carrito = new Carrito(listaDetalleCarrito);
                carrito.setId(1);
                controladorUsuario = new ControladorUsuario();
                assertEquals(false,controladorUsuario.getExpertoUsuario().CrearUsuario(carrito, nombreCliente, apellidoCliente, dniCliente, mailCliente));
        }
            
            
    
    
}
