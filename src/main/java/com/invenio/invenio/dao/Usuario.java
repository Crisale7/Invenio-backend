package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_id")
    private int usuario_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Asignacion_asignacion_id", insertable = false, updatable = false)
    private Asignacion asignacion;
    @Column(name = "hash_contrasena")
    private String hash_contrasena;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "usuario")
    private String usuario;
    @OneToMany(mappedBy = "usuario")
    private List<Rol> roles;

    public Usuario() {
    }

    public Usuario(int usuario_id, Asignacion asignacion, String hash_contrasena, String nombre, String usuario) {
        this.usuario_id = usuario_id;
        this.asignacion = asignacion;
        this.hash_contrasena = hash_contrasena;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public Usuario(int usuarioUsuarioId) {
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public String getHash_contrasena() {
        return hash_contrasena;
    }

    public void setHash_contrasena(String hash_contrasena) {
        this.hash_contrasena = hash_contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}