package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Especificaciones;
import com.invenio.invenio.dao.Repository.Especificacionesrepository;
import com.invenio.invenio.dto.Especificacionesdto;
import com.invenio.invenio.dto.ListaEspecificacionesdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Especificacionesbl {
    private final Especificacionesrepository especificacionesrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Especificacionesbl.class);

    @Autowired
    public Especificacionesbl(Especificacionesrepository especificacionesrepository) {
        this.especificacionesrepository = especificacionesrepository;
    }

    public Especificacionesdto CrearEspecificaciones(String serie, String marca, String estado, Integer eq, Integer dimension_alto, Integer dimension_ancho, String ram, String procesador, String memoria, String color, Integer Activo_activoo_id) {
        LOG.info("Creando especificaciones con serie: {}", serie);
        Especificaciones especificacionesEntity = new Especificaciones();
        especificacionesEntity.setSerie(serie);
        especificacionesEntity.setMarca(marca);
        especificacionesEntity.setEstado(estado);
        especificacionesEntity.setEq(eq);
        especificacionesEntity.setDimension_alto(dimension_alto);
        especificacionesEntity.setDimension_ancho(dimension_ancho);
        especificacionesEntity.setRam(ram);
        especificacionesEntity.setProcesador(procesador);
        especificacionesEntity.setMemoria(memoria);
        especificacionesEntity.setColor(color);
        especificacionesEntity.setActivo_activo_id(Activo_activoo_id);
        especificacionesrepository.save(especificacionesEntity);
        return new Especificacionesdto(especificacionesEntity.getEspecificaciones_id(), Activo_activoo_id, serie, marca, estado, eq, dimension_alto, dimension_ancho, ram, procesador, memoria, color);
    }



    public ListaEspecificacionesdto obtenerEspecificacionesPorActivoId(int activoId) {
        LOG.info("Obteniendo especificaciones con Activo_activo_id: {}", activoId);
        List<Especificaciones> especificacionesEntities = especificacionesrepository.findByActivo_activo_id(activoId);
        if (!especificacionesEntities.isEmpty()) {
            Especificaciones especificacionesEntity = especificacionesEntities.get(0);
            ListaEspecificacionesdto listaEspecificacionesdto = new ListaEspecificacionesdto(
                    especificacionesEntity.getSerie() != null && !especificacionesEntity.getSerie().isEmpty() ? especificacionesEntity.getSerie() : "No posee",
                    especificacionesEntity.getMarca() != null && !especificacionesEntity.getMarca().isEmpty() ? especificacionesEntity.getMarca() : "No posee",
                    especificacionesEntity.getEstado() != null && !especificacionesEntity.getEstado().isEmpty() ? especificacionesEntity.getEstado() : "No posee",
                    especificacionesEntity.getEq() != 0 ? especificacionesEntity.getEq() : 0,
                    especificacionesEntity.getDimension_alto() != 0 ? especificacionesEntity.getDimension_alto() : 0,
                    especificacionesEntity.getDimension_ancho() != 0 ? especificacionesEntity.getDimension_ancho() : 0,
                    especificacionesEntity.getRam() != null && !especificacionesEntity.getRam().isEmpty() ? especificacionesEntity.getRam() : "No posee",
                    especificacionesEntity.getProcesador() != null && !especificacionesEntity.getProcesador().isEmpty() ? especificacionesEntity.getProcesador() : "No posee",
                    especificacionesEntity.getMemoria() != null && !especificacionesEntity.getMemoria().isEmpty() ? especificacionesEntity.getMemoria() : "No posee",
                    especificacionesEntity.getColor() != null && !especificacionesEntity.getColor().isEmpty() ? especificacionesEntity.getColor() : "No posee"
            );
            return listaEspecificacionesdto;
        } else {
            return null;
        }
    }

    public ListaEspecificacionesdto obtenerEspecificacionesPorSerie(String serie){
        LOG.info("Obteniendo especificaciones con serie: {}", serie);
        Especificaciones especificacionesEntity = especificacionesrepository.findBySerie(serie);
        if (especificacionesEntity != null) {
            ListaEspecificacionesdto listaEspecificacionesdto = new ListaEspecificacionesdto(
                    especificacionesEntity.getSerie() != null && !especificacionesEntity.getSerie().isEmpty() ? especificacionesEntity.getSerie() : "No posee",
                    especificacionesEntity.getMarca() != null && !especificacionesEntity.getMarca().isEmpty() ? especificacionesEntity.getMarca() : "No posee",
                    especificacionesEntity.getEstado() != null && !especificacionesEntity.getEstado().isEmpty() ? especificacionesEntity.getEstado() : "No posee",
                    especificacionesEntity.getEq() != 0 ? especificacionesEntity.getEq() : 0,
                    especificacionesEntity.getDimension_alto() != 0 ? especificacionesEntity.getDimension_alto() : 0,
                    especificacionesEntity.getDimension_ancho() != 0 ? especificacionesEntity.getDimension_ancho() : 0,
                    especificacionesEntity.getRam() != null && !especificacionesEntity.getRam().isEmpty() ? especificacionesEntity.getRam() : "No posee",
                    especificacionesEntity.getProcesador() != null && !especificacionesEntity.getProcesador().isEmpty() ? especificacionesEntity.getProcesador() : "No posee",
                    especificacionesEntity.getMemoria() != null && !especificacionesEntity.getMemoria().isEmpty() ? especificacionesEntity.getMemoria() : "No posee",
                    especificacionesEntity.getColor() != null && !especificacionesEntity.getColor().isEmpty() ? especificacionesEntity.getColor() : "No posee"
            );
            return listaEspecificacionesdto;
        } else {
            return null;
        }
    }

    public Especificacionesdto ActualizarEspecificaciones(Integer id, String serie, String marca, String estado, Integer eq, Integer dimension_alto, Integer dimension_ancho, String ram, String procesador, String memoria, String color, Integer Activo_activo_id) {
        LOG.info("Actualizando especificaciones con id: {}", id);
        Especificaciones especificacionesEntity = especificacionesrepository.findById(id).orElse(null);
        if (especificacionesEntity != null) {
            if (serie != null) especificacionesEntity.setSerie(serie);
            if (marca != null) especificacionesEntity.setMarca(marca);
            if (estado != null) especificacionesEntity.setEstado(estado);
            if (eq != null) especificacionesEntity.setEq(eq);
            if (dimension_alto != null) especificacionesEntity.setDimension_alto(dimension_alto);
            if (dimension_ancho != null) especificacionesEntity.setDimension_ancho(dimension_ancho);
            if (ram != null) especificacionesEntity.setRam(ram);
            if (procesador != null) especificacionesEntity.setProcesador(procesador);
            if (memoria != null) especificacionesEntity.setMemoria(memoria);
            if (color != null) especificacionesEntity.setColor(color);
            if (Activo_activo_id != null) especificacionesEntity.setActivo_activo_id(Activo_activo_id);
            especificacionesrepository.save(especificacionesEntity);
            return new Especificacionesdto(especificacionesEntity.getEspecificaciones_id(), Activo_activo_id, serie, marca, estado, eq, dimension_alto, dimension_ancho, ram, procesador, memoria, color);
        } else {
            return null;
        }
    }

    public Integer GetEspecificacionesIdBySerie(String serie){
        LOG.info("Buscando Especificaciones con serie: {}", serie);
        Especificaciones especificaciones = especificacionesrepository.findBySerie(serie);
        return especificaciones != null ? especificaciones.getEspecificaciones_id() : null;
    }

    public ListaEspecificacionesdto GetEspecificacionesById(Integer id){
        LOG.info("Buscando Especificaciones con id: {}", id);
        Especificaciones especificaciones = especificacionesrepository.findById(id).orElse(null);
        if (especificaciones != null) {
            return new ListaEspecificacionesdto(
                    especificaciones.getSerie() != null && !especificaciones.getSerie().isEmpty() ? especificaciones.getSerie() : "No posee"
                    , especificaciones.getMarca() != null && !especificaciones.getMarca().isEmpty() ? especificaciones.getMarca() : "No posee"
                    , especificaciones.getEstado() != null && !especificaciones.getEstado().isEmpty() ? especificaciones.getEstado() : "No posee"
                    , especificaciones.getEq() != 0 ? especificaciones.getEq() : 0
                    , especificaciones.getDimension_alto() != 0 ? especificaciones.getDimension_alto() : 0
                    , especificaciones.getDimension_ancho() != 0 ? especificaciones.getDimension_ancho() : 0
                    , especificaciones.getRam() != null && !especificaciones.getRam().isEmpty() ? especificaciones.getRam() : "No posee"
                    , especificaciones.getProcesador() != null && !especificaciones.getProcesador().isEmpty() ? especificaciones.getProcesador() : "No posee"
                    , especificaciones.getMemoria() != null && !especificaciones.getMemoria().isEmpty() ? especificaciones.getMemoria() : "No posee"
                    , especificaciones.getColor() != null && !especificaciones.getColor().isEmpty() ? especificaciones.getColor() : "No posee"
            );
        } else {
            return null;
        }
    }


    public void EliminarEspecificaciones(Integer id){
        LOG.info("Eliminando Especificaciones con id: {}", id);
        especificacionesrepository.deleteById(id);
    }


}