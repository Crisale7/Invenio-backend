package com.invenio.invenio.dto;

public class TipoProductodto {
    private int tipo_producto_id;
    private String tipo_producto;

    public TipoProductodto() {
    }

    public TipoProductodto(int tipo_producto_id, String tipo_producto) {
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
