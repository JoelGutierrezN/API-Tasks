package com.tasks.domain.service;

import com.tasks.domain.Usuario;
import com.tasks.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.getAll();
    }

    public Optional<Usuario> getUsuario(long id){
        return usuarioRepository.getUser(id);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean delete(long id){
        return getUsuario(id).map(usuario -> {
            usuarioRepository.delete(id);
            return true;
        }).orElse(false);
    }
}

