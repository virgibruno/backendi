package com.example.odontologoSpringMvc.services;

import com.example.odontologoSpringMvc.modelo.Usuario;

public class UsuarioService {

    public Usuario crearUsuario(){
        Usuario usuario = new Usuario("Diego", 25);
        return usuario;
    }
}


