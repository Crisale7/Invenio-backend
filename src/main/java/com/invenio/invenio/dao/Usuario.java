package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_id")
    private int usuario_id;
    @Column(name = "Asignacion_asignacion_id")
    private int Asignacion_asignacion_id;
    @Column(name = "hash_contrasena")
    private String hash_contrasena;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "usuario")
    private String usuario;

    public Usuario() {
    }

    public Usuario(int usuario_id, int Asignacion_asignacion_id, String hash_contrasena, String nombre, String usuario) {
        this.usuario_id = usuario_id;
        this.Asignacion_asignacion_id = Asignacion_asignacion_id;
        this.hash_contrasena = hash_contrasena;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getAsignacion_asignacion_id() {
        return Asignacion_asignacion_id;
    }

    public void setAsignacion_asignacion_id(int Asignacion_asignacion_id) {
        this.Asignacion_asignacion_id = Asignacion_asignacion_id;
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