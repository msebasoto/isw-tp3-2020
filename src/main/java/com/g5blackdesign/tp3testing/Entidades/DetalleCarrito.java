/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Entidades;

/**
 *
 * @author federico
 */
public class DetalleCarrito {
    //Creo que no hace falta esta variable
    private int idproducto;
  
    private int idcarrito;
    private int cantidad;
    private Producto producto;
    
    
    public DetalleCarrito(){
    
    }
    
    public DetalleCarrito(int idproducto, int idcarrito, int cantidad) {
        this.idproducto = idproducto;
        this.idcarrito = idcarrito;
        this.cantidad = cantidad;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdcarrito() {
        return idcarrito;
    }

    public void setIdcarrito(int idcarrito) {
        this.idcarrito = idcarrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
