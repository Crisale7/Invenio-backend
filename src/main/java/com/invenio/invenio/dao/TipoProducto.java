package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="TipoProducto")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tipo_producto_id")
    private int tipo_producto_id;
    @Column(name = "tipo_producto")
    private String tipo_producto;
    @OneToMany(mappedBy = "tipo_producto")
    private List<Modelo> modelos;

    public TipoProducto() {
    }

    public TipoProducto(int tipo_producto_id, String tipo_producto) {
        this.tipo_producto_id = tipo_producto_id;
        this.tipo_producto = tipo_producto;
    }

    public TipoProducto(Long tipoProductoId) {
    }

    public int getTipo_producto_id() {
        return tipo_producto_id;
    }

    public void setTipo_producto_id(int tipo_producto_id) {
        this.tipo_producto_id = tipo_producto_id;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
}