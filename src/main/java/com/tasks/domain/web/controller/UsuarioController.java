package com.tasks.domain.web.controller;

import com.tasks.domain.Usuario;
import com.tasks.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> getAll(){
        return usuarioService.getAll();
    }

    public Optional<Usuario> getUsuario(long id){
        return usuarioService.getUsuario(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioService.save(usuario);
    }

    public boolean delete(long id){
        return usuarioService.delete(id);
    }
}
