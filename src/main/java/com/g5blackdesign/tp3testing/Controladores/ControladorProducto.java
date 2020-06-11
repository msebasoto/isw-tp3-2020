package com.g5blackdesign.tp3testing.Controladores;

import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import com.g5blackdesign.tp3testing.Entidades.Usuario;


public class ControladorProducto {

    public void AgregaProductoCarrito(Usuario user, Producto producto, int cantidad){
          
        DetalleCarrito detalle = new DetalleCarrito();        
        detalle.setProducto(producto);
        detalle.setCantidad(cantidad);
        
        if(user.getCarrito()== null){
           Carrito carrito = new Carrito();
           user.setCarrito(carrito);
           user.getCarrito().getListdetallecarrito().add(detalle);          
            
        }else{
            for(int i=0; i < user.getCarrito().getListdetallecarrito().size(); i++){
                    if(user.getCarrito().getListdetallecarrito().get(i).getIdproducto() == producto.getId()){
                            int sumarCant = user.getCarrito().getListdetallecarrito().get(i).getCantidad() + cantidad;
                            user.getCarrito().getListdetallecarrito().get(i).setCantidad(sumarCant);
                    }else{
                            user.getCarrito().getListdetallecarrito().add(detalle);
                    }
            }
        }        
    }
    
    public void VaciarCarrito(Usuario user){
       user.getCarrito().getListdetallecarrito().clear();
    }   
}