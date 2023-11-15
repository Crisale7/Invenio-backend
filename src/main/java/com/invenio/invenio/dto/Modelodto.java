package com.invenio.invenio.dto;

public class Modelodto {
    private int modelo_id;
    private int Tipo_Producto_tipo_producto_id;
    private String modelo;

    public Modelodto() {
    }

    public Modelodto(int modelo_id, int Tipo_Producto_tipo_producto_id, String modelo) {
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
}
