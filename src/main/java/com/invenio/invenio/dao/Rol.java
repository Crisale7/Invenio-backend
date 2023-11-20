package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rol_id")
    private int rol_id;

    @Column(name = "Grupo_grupo_id")
    private int Grupo_grupo_id;

    @Column(name = "Usuario_usuario_id")
    private int Usuario_usuario_id;

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

    public Rol(int rol_id, int Grupo_grupo_id, int Usuario_usuario_id, String rol) {
        this.rol_id = rol_id;
        this.Grupo_grupo_id = Grupo_grupo_id;
        this.Usuario_usuario_id = Usuario_usuario_id;
        this.rol = rol;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getGrupo_grupo_id() {
        return Grupo_grupo_id;
    }

    public void setGrupo_grupo_id(int Grupo_grupo_id) {
        this.Grupo_grupo_id = Grupo_grupo_id;
    }

    public int getUsuario_usuario_id() {
        return Usuario_usuario_id;
    }

    public void setUsuario_usuario_id(int Usuario_usuario_id) {
        this.Usuario_usuario_id = Usuario_usuario_id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
}
