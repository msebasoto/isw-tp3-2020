/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Expertos;

import com.g5blackdesign.tp3testing.Entidades.Usuario;
import com.g5blackdesign.tp3testing.Entidades.Carrito;

/**
 *
 * @author ignacio
 */
public class ExpertoUsuario {
    private Usuario usuario;
    public Carrito carrito;
    
    
    public boolean CrearUsuario(Carrito carrito, String nombre, String apellido, String dni, String email){
        if (!carrito.getListdetallecarrito().isEmpty()) {
            usuario = new Usuario(carrito,nombre,apellido,dni,email);
            return true;
        }
        return false;
    }
        
    
    
}
