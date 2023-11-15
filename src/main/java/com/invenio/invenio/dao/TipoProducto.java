package com.invenio.invenio.dao;

import jakarta.persistence.*;

@Entity
@Table(name="Tipo_Producto")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tipo_producto_id")
    private int tipo_producto_id;
    @Column(name = "tipo_producto")
    private String tipo_producto;

    public TipoProducto() {
    }

    public TipoProducto(int tipo_producto_id, String tipo_producto) {
        this.tipo_producto_id = tipo_producto_id;
        this.tipo_producto = tipo_producto;
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
