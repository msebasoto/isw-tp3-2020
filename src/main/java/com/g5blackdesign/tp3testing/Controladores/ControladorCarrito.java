/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Controladores;

import com.g5blackdesign.tp3testing.Entidades.DetalleCarrito;
import com.g5blackdesign.tp3testing.Expertos.ExpertoCarrito;

/**
 *
 * @author federico
 */
public class ControladorCarrito {
    
    public ExpertoCarrito expertocarrito = new ExpertoCarrito();
    
    public void CrearCarrito(){
        expertocarrito.CrearCarrito();
    }
    
    public boolean AgregarDetalleCarrito(DetalleCarrito detallecarrito){
        return expertocarrito.AddDetalleCarritoToCarrito(detallecarrito);
    }
    
    public String ModificarCantidadDetalleCarrito(DetalleCarrito detalleCarrito){
        return expertocarrito.ModificarDetalleCarrito(detalleCarrito);
    }

    public ExpertoCarrito getExpertocarrito() {
        return expertocarrito;
    }
    
    
}
