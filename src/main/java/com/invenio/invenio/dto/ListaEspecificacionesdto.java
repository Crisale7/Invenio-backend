package com.invenio.invenio.dto;

public class ListaEspecificacionesdto {
    private String serie;
    private String marca;
    private String estado;
    private Integer eq;
    private Integer dimension_alto;
    private Integer dimension_ancho;
    private String ram;
    private String procesador;
    private String memoria;
    private String color;

    public ListaEspecificacionesdto() {
    }

    public ListaEspecificacionesdto(String serie, String marca, String estado, Integer eq, Integer dimension_alto, Integer dimension_ancho, String ram, String procesador, String memoria, String color) {
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

    public Integer getEq() {
        return eq;
    }

    public void setEq(Integer eq) {
        this.eq = eq;
    }

    public Integer getDimension_alto() {
        return dimension_alto;
    }

    public void setDimension_alto(Integer dimension_alto) {
        this.dimension_alto = dimension_alto;
    }

    public Integer getDimension_ancho() {
        return dimension_ancho;
    }

    public void setDimension_ancho(Integer dimension_ancho) {
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
