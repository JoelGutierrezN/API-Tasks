package com.tasks.persistence;

import com.tasks.domain.Usuario;
import com.tasks.domain.mapper.UsuarioMapper;
import com.tasks.domain.repository.UsuarioRepository;
import com.tasks.persistence.crud.UserCrudRepository;
import com.tasks.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements UsuarioRepository {
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private UsuarioMapper mapper;

    @Override
    public List<Usuario> getAll(){
        List<User> users = (List<User>) userCrudRepository.findAll();
        return mapper.toUsuarios(users);
    }

    @Override
    public Usuario save(Usuario usuario) {
        User user = mapper.toUser(usuario);
        return mapper.toUsuario(userCrudRepository.save(user));
    }

    public void delete(long id){
        userCrudRepository.deleteById(id);
    }

    @Override
    public Optional<Usuario> getUser(long id){
        return userCrudRepository.findById(id).map(user -> mapper.toUsuario(user));
    }
}
