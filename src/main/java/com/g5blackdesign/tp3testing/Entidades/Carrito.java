/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Entidades;

import java.util.List;

/**
 *
 * @author federico
 */
public class Carrito {
    private int id;
    private List<DetalleCarrito> listdetallecarrito;

    public Carrito(List<DetalleCarrito> listdetallecarrito) {
        this.listdetallecarrito = listdetallecarrito;
    }

    public Carrito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<DetalleCarrito> getListdetallecarrito() {
        return listdetallecarrito;
    }

    public void setListdetallecarrito(List<DetalleCarrito> listdetallecarrito) {
        this.listdetallecarrito = listdetallecarrito;
    }
    
    
    public Boolean CrearCarrito(Producto p){
        if (p.getNombre().isEmpty() || p.getDescripcion().isEmpty() || p.getPrecio() == 0.0){
            return false;
        }else{
            return true;
        }
    }
}
