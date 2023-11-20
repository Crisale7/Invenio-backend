package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Asignacion")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asignacion_id")
    private int asignacion_id;
    @Column(name = "Activo_activo_id")
    private int Activo_activo_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Activo_activo_id", insertable = false, updatable = false)
    private Activo activo;
    @Column(name = "fecha_salida")
    private Timestamp fecha_salida;
    @OneToMany(mappedBy = "asignacion")
    private List<Usuario> usuarios;

    public Asignacion() {
    }

    public Asignacion(int asignacion_id, int Activo_activo_id , Timestamp fecha_salida) {
        this.asignacion_id = asignacion_id;
        this.Activo_activo_id = Activo_activo_id;
        this.fecha_salida = fecha_salida;
    }

    public int getAsignacion_id() {
        return asignacion_id;
    }

    public void setAsignacion_id(int asignacion_id) {
        this.asignacion_id = asignacion_id;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public int getActivo_activo_id() {
        return Activo_activo_id;
    }

    public void setActivo_activo_id(int Activo_activo_id) {
        this.Activo_activo_id = Activo_activo_id;
    }

    public Timestamp getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Timestamp fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
