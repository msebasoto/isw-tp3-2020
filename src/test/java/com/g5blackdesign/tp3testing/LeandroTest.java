package com.g5blackdesign.tp3testing;

import com.g5blackdesign.tp3testing.Controladores.ControladorProducto;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import com.g5blackdesign.tp3testing.Entidades.Usuario;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;


/**
 *
 * @author Leandro
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class LeandroTest {
    
    public LeandroTest() {
    }
    
 
    @Test
    public void TestVaciarCarrito(){
    ControladorProducto controlador = new ControladorProducto();
    Usuario user = new Usuario();
    Carrito carrito = new Carrito();
    DetalleCarrito detalle = new DetalleCarrito();
    Producto producto = new Producto();
   
    detalle.setProducto(producto);
    carrito.getListdetallecarrito().add(detalle);
    user.setCarrito(carrito);
    
    controlador.VaciarCarrito(user);
    
        if(user.getCarrito().getListdetallecarrito().isEmpty()){
            assertEquals(true,true);
        }else{
            assertEquals(false,true);
        }    
    }    
        
    @Test
    public void TestContenidoCarrito(){
            Usuario user = new Usuario();
            Carrito carrito = null;
            user.setCarrito(carrito);
            Producto producto = new Producto();
            ControladorProducto controlador = new ControladorProducto();
            
            controlador.AgregaProductoCarrito(user, producto, 1);
                        
            if(user.getCarrito().getListdetallecarrito().size()> 0){
                assertEquals(true,true);
            }else{
                assertEquals(false,true);
            }           
    }    
    
}
