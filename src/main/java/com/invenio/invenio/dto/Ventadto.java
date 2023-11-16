package com.invenio.invenio.dto;

import java.sql.Timestamp;

public class Ventadto {
    private int venta_id;
    private int Activo_activo_id;
    private Timestamp fecha_venta;
    private double precio_total;

    public Ventadto() {
    }

    public Ventadto(int venta_id, int Activo_activo_id, Timestamp fecha_venta, double precio_total) {
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

