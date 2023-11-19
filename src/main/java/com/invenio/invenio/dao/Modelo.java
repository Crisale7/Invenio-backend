package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "modelo_id")
    private int modelo_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Tipo_Producto_tipo_producto_id", insertable = false, updatable = false)
    private TipoProducto tipo_producto;
    @Column(name = "modelo")
    private String modelo;

    public Modelo() {
    }

    public Modelo(int modelo_id, TipoProducto tipo_producto, String modelo) {
        this.modelo_id = modelo_id;
        this.tipo_producto = tipo_producto;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}