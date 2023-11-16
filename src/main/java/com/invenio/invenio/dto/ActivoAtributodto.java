package com.invenio.invenio.dto;

public class ActivoAtributodto {
    private int equipo_atributo_id;
    private int Atributos_atributos_id;
    private int Activo_activo_id;
    private String detalle;

    public ActivoAtributodto() {
    }

    public ActivoAtributodto(int equipo_atributo_id, int Atributos_atributos_id, int Activo_activo_id, String detalle) {
        this.equipo_atributo_id = equipo_atributo_id;
        this.Atributos_atributos_id = Atributos_atributos_id;
        this.Activo_activo_id = Activo_activo_id;
        this.detalle = detalle;
    }

    public int getEquipo_atributo_id() {
        return equipo_atributo_id;
    }

    public void setEquipo_atributo_id(int equipo_atributo_id) {
        this.equipo_atributo_id = equipo_atributo_id;
    }

    public int getAtributos_atributos_id() {
        return Atributos_atributos_id;
    }

    public void setAtributos_atributos_id(int Atributos_atributos_id) {
        this.Atributos_atributos_id = Atributos_atributos_id;
    }

    public int getActivo_activo_id() {
        return Activo_activo_id;
    }

    public void setActivo_activo_id(int Activo_activo_id) {
        this.Activo_activo_id = Activo_activo_id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
