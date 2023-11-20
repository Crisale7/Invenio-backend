package com.invenio.invenio.dto;

import java.sql.Timestamp;

public class Asignaciondto {
    private int asignacion_id;
    private int Activo_activo_id;
    private int fecha_salida;

    public Asignaciondto() {
    }

    public Asignaciondto(int asignacion_id, int Activo_activo_id, int fecha_salida) {
        this.asignacion_id = asignacion_id;
        this.Activo_activo_id = Activo_activo_id;
        this.fecha_salida = fecha_salida;
    }

    public Asignaciondto(int asignacionId, int activoActivoId, Timestamp fechaSalida) {
    }

    public int getAsignacion_id() {
        return asignacion_id;
    }

    public void setAsignacion_id(int asignacion_id) {
        this.asignacion_id = asignacion_id;
    }

    public int getActivo_activo_id() {
        return Activo_activo_id;
    }

    public void setActivo_activo_id(int Producto_producto_id) {
        this.Activo_activo_id = Producto_producto_id;
    }

    public int getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(int fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
