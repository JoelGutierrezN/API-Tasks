package com.tasks.domain.repository;

import com.tasks.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<Usuario> getAll();
    Optional<List<Usuario>> getUser(int id);
    Usuario save(Usuario usuario);
    void delete(long id);
}
