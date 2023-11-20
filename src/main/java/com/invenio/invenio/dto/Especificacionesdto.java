package com.invenio.invenio.dto;

public class Especificacionesdto {
    private int especificaciones_id;
    private int Activo_activo_id;
    private String serie;
    private String marca;
    private String estado;
    private int eq;
    private int dimension_alto;
    private int dimension_ancho;
    private String ram;
    private String procesador;
    private String memoria;
    private String color;

    public Especificacionesdto() {
    }

    public Especificacionesdto(int especificaciones_id, int Activo_activo_id, String serie, String marca, String estado, int eq, int dimension_alto, int dimension_ancho, String ram, String procesador, String memoria, String color) {
        this.especificaciones_id = especificaciones_id;
        this.Activo_activo_id = Activo_activo_id;
        this.serie = serie;
        this.marca = marca;
        this.estado = estado;
        this.eq = eq;
        this.dimension_alto = dimension_alto;
        this.dimension_ancho = dimension_ancho;
        this.ram = ram;
        this.procesador = procesador;
        this.memoria = memoria;
        this.color = color;
    }

    public int getEspecificaciones_id() {
        return especificaciones_id;
    }

    public void setEspecificaciones_id(int especificaciones_id) {
        this.especificaciones_id = especificaciones_id;
    }

    public int getActivo_activo_id() {
        return Activo_activo_id;
    }

    public void setActivo_activo_id(int Activo_activo_id) {
        this.Activo_activo_id = Activo_activo_id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEq() {
        return eq;
    }

    public void setEq(int eq) {
        this.eq = eq;
    }

    public int getDimension_alto() {
        return dimension_alto;
    }

    public void setDimension_alto(int dimension_alto) {
        this.dimension_alto = dimension_alto;
    }

    public int getDimension_ancho() {
        return dimension_ancho;
    }

    public void setDimension_ancho(int dimension_ancho) {
        this.dimension_ancho = dimension_ancho;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}