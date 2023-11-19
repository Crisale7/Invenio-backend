package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Asignacion")
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asignacion_id")
    private int asignacion_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Activo_activo_id", insertable = false, updatable = false)
    private Activo activo;
    @Column(name = "fecha_salida")
    private int fecha_salida;
    @OneToMany(mappedBy = "asignacion")
    private List<Usuario> usuarios;

    public Asignacion() {
    }

    public Asignacion(int asignacion_id, Activo activo, int fecha_salida) {
        this.asignacion_id = asignacion_id;
        this.activo = activo;
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

    public int getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(int fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
