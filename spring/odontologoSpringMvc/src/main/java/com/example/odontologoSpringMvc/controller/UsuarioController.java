package com.example.odontologoSpringMvc.controller;

import com.example.odontologoSpringMvc.modelo.Usuario;
import com.example.odontologoSpringMvc.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private UsuarioService usuarioService = new UsuarioService();

    @GetMapping("/")
    public Usuario crearUsuario(){
        return usuarioService.crearUsuario();
    }

    @GetMapping("crear2")
    public Usuario crearUsuario2(){
        Usuario usuario = new Usuario("Alicia", 45);
        return usuario;
    }
}
