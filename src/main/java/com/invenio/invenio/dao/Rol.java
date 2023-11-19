package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rol_id")
    private int rol_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Grupo_grupo_id", insertable = false, updatable = false)
    private Grupo grupo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Usuario_usuario_id", insertable = false, updatable = false)
    private Usuario usuario;
    @Column(name = "rol")
    private String rol;

    public Rol() {
    }

    public Rol(int rol_id, Grupo grupo, Usuario usuario, String rol) {
        this.rol_id = rol_id;
        this.grupo = grupo;
        this.usuario = usuario;
        this.rol = rol;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
