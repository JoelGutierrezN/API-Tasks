package com.tasks.domain.repository;

import com.tasks.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    Optional<Usuario> getUser(long id);
    List<Usuario> getAll();
    Usuario save(Usuario usuario);
    void delete(long id);
}
