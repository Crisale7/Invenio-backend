package com.invenio.invenio.dto;

import java.sql.Timestamp;

public class Entradadto {
    private int entrada_id;
    private Timestamp fecha_entrada;
    private String detalle;

    public Entradadto() {
    }

    public Entradadto(int entrada_id, Timestamp fecha_entrada, String detalle) {
        this.entrada_id = entrada_id;
        this.fecha_entrada = fecha_entrada;
        this.detalle = detalle;
    }

    public int getEntrada_id() {
        return entrada_id;
    }

    public void setEntrada_id(int entrada_id) {
        this.entrada_id = entrada_id;
    }

    public Timestamp getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Timestamp fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
