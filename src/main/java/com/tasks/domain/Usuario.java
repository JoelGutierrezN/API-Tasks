package com.tasks.domain;

import com.tasks.persistence.entity.Comment;
import com.tasks.persistence.entity.Team;
import com.tasks.persistence.entity.UserTeam;

import java.util.List;

public class Usuario {
    private Long id;
    private String nombre;
    private String nombreUsuario;
    private Short genero;
    private String correo;
    private String pwd;
    private String telefono;
    private String celular;
    private String imagen;
    private String rol;
    private List<Comment> comentarios;
    private Team liderDelEquipo;
    private List<UserTeam> perteneceALosEquipos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Short getGenero() {
        return genero;
    }

    public void setGenero(Short genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Comment> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comment> comentarios) {
        this.comentarios = comentarios;
    }

    public Team getLiderDelEquipo() {
        return liderDelEquipo;
    }

    public void setLiderDelEquipo(Team liderDelEquipo) {
        this.liderDelEquipo = liderDelEquipo;
    }

    public List<UserTeam> getPerteneceALosEquipos() {
        return perteneceALosEquipos;
    }

    public void setPerteneceALosEquipos(List<UserTeam> perteneceALosEquipos) {
        this.perteneceALosEquipos = perteneceALosEquipos;
    }
}
