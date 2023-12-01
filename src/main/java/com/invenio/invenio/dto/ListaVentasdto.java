package com.invenio.invenio.dto;

import java.sql.Timestamp;

public class ListaVentasdto {
    private Timestamp fecha_venta;
    private double precio_total;

    public ListaVentasdto() {
    }

    public ListaVentasdto(Timestamp fecha_venta, double precio_total) {
        this.fecha_venta = fecha_venta;
        this.precio_total = precio_total;
    }

// getters y setters

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