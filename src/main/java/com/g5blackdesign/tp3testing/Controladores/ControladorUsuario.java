/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5blackdesign.tp3testing.Controladores;

import com.g5blackdesign.tp3testing.Entidades.Usuario;
import com.g5blackdesign.tp3testing.Expertos.ExpertoUsuario;
import com.g5blackdesign.tp3testing.Entidades.Carrito;
/**
 *
 * @author federico
 */
public class ControladorUsuario {
    
    public ExpertoUsuario expertoUsuario = new ExpertoUsuario();
    
    public void CrearUsuario(Carrito carrito,String nombre,String apellido,String dni,String email){
        expertoUsuario.CrearUsuario(carrito,nombre, apellido, dni, email);
    }
    
    public ExpertoUsuario getExpertoUsuario() {
        return expertoUsuario;
    }
    
}


