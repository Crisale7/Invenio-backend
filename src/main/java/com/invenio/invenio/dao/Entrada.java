package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="Entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entrada_id")
    private int entrada_id;
    @Column(name = "fecha_entrada") private Timestamp fecha_entrada;
    @Column(name = "detalle") private String detalle;
    public Entrada() {
    }

    public Entrada(int entrada_id, Timestamp fecha_entrada, String detalle) {
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