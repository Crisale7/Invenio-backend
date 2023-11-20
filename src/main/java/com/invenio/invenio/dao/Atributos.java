package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Atributos")
public class Atributos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "atributos_id")
    private int atributos_id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "obligatorio")
    private boolean obligatorio;
    @OneToMany(mappedBy = "atributos")
    private List<ActivoAtributo> activo_atributos;

    // constructores, getters y setters
    public Atributos() {
    }

    public Atributos(int atributos_id, String nombre, String tipo, boolean obligatorio) {
        this.atributos_id = atributos_id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.obligatorio = obligatorio;
    }

    public int getAtributos_id() {
        return atributos_id;
    }

    public void setAtributos_id(int atributos_id) {
        this.atributos_id = atributos_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(boolean obligatorio) {
        this.obligatorio = obligatorio;
    }

    public List<ActivoAtributo> getActivo_atributos() {
        return activo_atributos;
    }

    public void setActivo_atributos(ArrayList<ActivoAtributo> activo_atributos) {
        this.activo_atributos = activo_atributos;
    }
}