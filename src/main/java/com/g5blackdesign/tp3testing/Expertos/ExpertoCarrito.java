/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Expertos;

import com.g5blackdesign.tp3testing.Entidades.Carrito;
import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Entidades.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fedeg
 */
public class ExpertoCarrito {
    private Carrito carrito;
    public List<Producto> listproductos = new ArrayList<Producto>();
    
    public void CrearCarrito(){
        this.carrito = new Carrito();
    }
    
    public boolean AddDetalleCarritoToCarrito(DetalleCarrito detallecarrito){
        boolean existe = false;
        for(int i=0;i<listproductos.size();i++){
           if(listproductos.get(i).getId()==detallecarrito.getIdproducto()){
               existe = true;
               carrito.AddDetalleCarritoToCarrito(detallecarrito);
               break;
           } 
        }
        return existe;
    }

    public String ModificarDetalleCarrito(DetalleCarrito detalleCarrito){
        String modificado = "Producto no encontrado";
        for(int i=0;i<this.carrito.getListdetallecarrito().size();i++){
            if(this.carrito.getListdetallecarrito().get(i).getIdproducto() == detalleCarrito.getIdproducto()){
                int nueva_cantidad = detalleCarrito.getCantidad();
                int cantidad_actual = this.carrito.getListdetallecarrito().get(i).getCantidad();
                if(nueva_cantidad<0){
                    if(nueva_cantidad-cantidad_actual<0){
                        modificado = "No puede quedar negativo";
                    }
                }else{
                    modificado = "Es una suma. Modificamos el detalle siempre y cuando no supere el stock.";
                }
                break;
            }
        }
        return modificado;
    }
}
