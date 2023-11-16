package com.invenio.invenio.dto;

public class Atributosdto {
    private int atributos_id;
    private String nombre;
    private String tipo;
    private boolean obligatorio;

    public Atributosdto() {
    }

    public Atributosdto(int atributos_id, String nombre, String tipo, boolean obligatorio) {
        this.atributos_id = atributos_id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.obligatorio = obligatorio;
    }

    public int getAtributos_id() {
        return atributos_id;
    }

    public void setAtributos_id(int atributos_id) {
        this.atributos_id = atributos_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(boolean obligatorio) {
        this.obligatorio = obligatorio;
    }
}

