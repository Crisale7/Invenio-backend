package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="ActivoAtributo")
public class ActivoAtributo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "equipo_atributo_id")
    private int equipo_atributo_id;
    @Column(name = "Atributos_atributos_id")
    private int Atributos_atributos_id;
    @Column(name = "Activo_activo_id")
    private int Activo_activo_id;
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

    public ActivoAtributo(int equipo_atributo_id, int Atributos_atributos_id, int Activo_activo_id, String detalle) {
        this.equipo_atributo_id = equipo_atributo_id;
        this.Atributos_atributos_id = Atributos_atributos_id;
        this.Activo_activo_id = Activo_activo_id;
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

    public int getAtributos_atributos_id() {
        return Atributos_atributos_id;
    }

    public void setAtributos_atributos_id(int Atributos_atributos_id) {
        this.Atributos_atributos_id = Atributos_atributos_id;
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

