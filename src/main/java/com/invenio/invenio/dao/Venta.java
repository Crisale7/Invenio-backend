package com.invenio.invenio.dao;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "venta_id")
    private int venta_id;
    @Column(name = "Activo_activo_id") private int Activo_activo_id;
    @Column(name = "fecha_venta") private Timestamp fecha_venta;
    @Column(name = "precio_total") private double precio_total;
    public Venta() {
    }

    public Venta(int venta_id, int Activo_activo_id, Timestamp fecha_venta, double precio_total) {
        this.venta_id = venta_id;
        this.Activo_activo_id = Activo_activo_id;
        this.fecha_venta = fecha_venta;
        this.precio_total = precio_total;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public int getActivo_activo_id() {
        return Activo_activo_id;
    }

    public void setActivo_activo_id(int Activo_activo_id) {
        this.Activo_activo_id = Activo_activo_id;
    }

    public Timestamp getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Timestamp fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

}