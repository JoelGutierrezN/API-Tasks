package com.tasks.domain.mapper;

import com.tasks.domain.Usuario;
import com.tasks.persistence.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "fullname", target = "nombre"),
            @Mapping(source = "username", target = "nombreUsuario"),
            @Mapping(source = "gender", target = "genero"),
            @Mapping(source = "email", target = "correo"),
            @Mapping(source = "password", target = "pwd"),
            @Mapping(source = "phone", target = "telefono"),
            @Mapping(source = "cellphone", target = "celular"),
            @Mapping(source = "profilePicture", target = "imagen"),
            @Mapping(source = "role", target = "rol"),
            @Mapping(source = "comments", target = "comentarios"),
            @Mapping(source = "ownerOf", target = "liderDelEquipo"),
            @Mapping(source = "teams", target = "perteneceALosEquipos"),
    })
    Usuario toUsuario(User user);
    List<Usuario> toUsuarios(List<User> users);
    @InheritInverseConfiguration
//    @Mapping(target = "nombre", ignore = true) - En caso de ignorar alguna field que no fue usada en el la primera direccion del mapeo
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);
}
