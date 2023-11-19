package com.invenio.invenio.dto;

import com.invenio.invenio.dao.Entrada;
import com.invenio.invenio.dao.Modelo;

public class Activodto {
    private int activo_id;
    private int Modelo_modelo_id;
    private int Entrada_entrada_id;
    private String nombre;
    private double precio_unitario;

    public Activodto() {
    }

    public Activodto(int activo_id, int Modelo_modelo_id, int Entrada_entrada_id, String nombre, double precio_unitario) {
        this.activo_id = activo_id;
        this.Modelo_modelo_id = Modelo_modelo_id;
        this.Entrada_entrada_id = Entrada_entrada_id;
        this.nombre = nombre;
        this.precio_unitario = precio_unitario;
    }

    //Getters and Setters

    public int getActivo_id() {
        return activo_id;
    }

    public void setActivo_id(int activo_id) {
        this.activo_id = activo_id;
    }

    public int getModelo_modelo_id() {
        return Modelo_modelo_id;
    }

    public void setModelo_modelo_id(int Modelo_modelo_id) {
        this.Modelo_modelo_id = Modelo_modelo_id;
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

}

