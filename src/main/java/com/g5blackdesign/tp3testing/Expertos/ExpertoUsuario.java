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
    
    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    
    
    public boolean CrearUsuario(Carrito carrito, String nombre, String apellido, String dni, String email){
        if (!carrito.getListdetallecarrito().isEmpty() && ExpertoUsuario.contieneSoloLetras(nombre)) {
            usuario = new Usuario(nombre,apellido,dni,email);
            usuario.setCarrito(carrito);
            return true;
        }
        return false;
    }
        
    
    
}
