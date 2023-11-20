package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "modelo_id")
    private int modelo_id;
    @Column(name = "Tipo_Producto_tipo_producto_id")
    private int Tipo_Producto_tipo_producto_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Tipo_Producto_tipo_producto_id", insertable = false, updatable = false)
    private TipoProducto tipo_producto;
    @Column(name = "modelo")
    private String modelo;
    @OneToMany(mappedBy = "modelo")
    private List<Activo> activos;

    public Modelo() {
    }

    public Modelo(int modelo_id, int Tipo_Producto_tipo_producto_id, String modelo) {
        this.modelo_id = modelo_id;
        this.Tipo_Producto_tipo_producto_id = Tipo_Producto_tipo_producto_id;
        this.modelo = modelo;
    }

    public int getModelo_id() {
        return modelo_id;
    }

    public void setModelo_id(int modelo_id) {
        this.modelo_id = modelo_id;
    }

    public TipoProducto getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(TipoProducto tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getTipo_Producto_tipo_producto_id() {
        return Tipo_Producto_tipo_producto_id;
    }

    public void setTipo_Producto_tipo_producto_id(int Tipo_Producto_tipo_producto_id) {
        this.Tipo_Producto_tipo_producto_id = Tipo_Producto_tipo_producto_id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Activo> getActivos() {
        return activos;
    }

    public void setActivos(ArrayList<Activo> activos) {
        this.activos = activos;
    }
}