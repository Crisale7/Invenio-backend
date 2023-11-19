package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Activo")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "activo_id")
    private int activo_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Modelo_modelo_id", insertable = false, updatable = false)
    private Modelo modelo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Entrada_entrada_id", insertable = false, updatable = false)
    private Entrada entrada;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio_unitario")
    private double precio_unitario;
    @OneToMany(mappedBy = "activo")
    private List<Asignacion> asignaciones;
    @OneToMany(mappedBy = "activo")
    private List<Venta> ventas;
    @OneToMany(mappedBy = "activo")
    private List<ActivoAtributo> activo_atributos;

    public Activo() {
    }

    public Activo(int activo_id, Modelo modelo, Entrada entrada, String nombre, double precio_unitario) {
        this.activo_id = activo_id;
        this.modelo = modelo;
        this.entrada = entrada;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
    }

    public int getActivo_id() {
        return activo_id;
    }

    public void setActivo_id(int activo_id) {
        this.activo_id = activo_id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
}
