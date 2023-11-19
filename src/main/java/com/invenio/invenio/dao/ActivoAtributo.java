package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="ActivoAtributo")
public class ActivoAtributo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "equipo_atributo_id")
    private int equipo_atributo_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Atributos_atributos_id", insertable = false, updatable = false)
    private Atributos atributos;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Activo_activo_id", insertable = false, updatable = false)
    private Activo activo;
    @Column(name = "detalle")
    private String detalle;

    public ActivoAtributo() {
    }

    public ActivoAtributo(int equipo_atributo_id, Atributos atributos, Activo activo, String detalle) {
        this.equipo_atributo_id = equipo_atributo_id;
        this.atributos = atributos;
        this.activo = activo;
        this.detalle = detalle;
    }

    public int getEquipo_atributo_id() {
        return equipo_atributo_id;
    }

    public void setEquipo_atributo_id(int equipo_atributo_id) {
        this.equipo_atributo_id = equipo_atributo_id;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

