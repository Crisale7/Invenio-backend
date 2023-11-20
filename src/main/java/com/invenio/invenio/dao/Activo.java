package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Activo")
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "activo_id")
    private int activo_id;

    @Column(name = "Modelo_modelo_id")
    private int Modelo_modelo_id;

    @Column(name = "Entrada_entrada_id")
    private int Entrada_entrada_id;

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
    @OneToMany(mappedBy = "activo")
    private List<Especificaciones> especificaciones;

    public Activo() {
    }

    public Activo(int activo_id, int Modelo_modelo_id, int Entrada_entrada_id , String nombre, double precio_unitario) {
        this.activo_id = activo_id;
        this.Modelo_modelo_id = Modelo_modelo_id;
        this.Entrada_entrada_id = Entrada_entrada_id;
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

    public int getModelo_modelo_id() {
        return Modelo_modelo_id;
    }

    public void setModelo_modelo_id(int Modelo_modelo_id) {
        this.Modelo_modelo_id = Modelo_modelo_id;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public int getEntrada_entrada_id() {
        return Entrada_entrada_id;
    }

    public void setEntrada_entrada_id(int Entrada_entrada_id) {
        this.Entrada_entrada_id = Entrada_entrada_id;
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

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<ActivoAtributo> getActivo_atributos() {
        return activo_atributos;
    }

    public void setActivo_atributos(ArrayList<ActivoAtributo> activo_atributos) {
        this.activo_atributos = activo_atributos;
    }

    public List<Especificaciones> getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(ArrayList<Especificaciones> especificaciones) {
        this.especificaciones = especificaciones;
    }
}
