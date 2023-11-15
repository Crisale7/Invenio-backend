package com.invenio.invenio.dao;

import jakarta.persistence.*;
    @Entity
    @Table(name="Asignacion")
    public class Asignacion {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "asignacion_id")
        private int asignacion_id;
        @Column(name = "Producto_producto_id")
        private int Producto_producto_id;
        @Column(name = "fecha_salida")
        private int fecha_salida;

        public Asignacion() {
        }

        public Asignacion(int asignacion_id, int Producto_producto_id, int fecha_salida) {
            this.asignacion_id = asignacion_id;
            this.Producto_producto_id = Producto_producto_id;
            this.fecha_salida = fecha_salida;
        }

        public int getAsignacion_id() {
            return asignacion_id;
        }

        public void setAsignacion_id(int asignacion_id) {
            this.asignacion_id = asignacion_id;
        }

        public int getProducto_producto_id() {
            return Producto_producto_id;
        }

        public void setProducto_producto_id(int Producto_producto_id) {
            this.Producto_producto_id = Producto_producto_id;
        }

        public int getFecha_salida() {
            return fecha_salida;
        }

        public void setFecha_salida(int fecha_salida) {
            this.fecha_salida = fecha_salida;
        }
    }
