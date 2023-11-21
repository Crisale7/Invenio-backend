package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Especificaciones;
import com.invenio.invenio.dao.Repository.Especificacionesrepository;
import com.invenio.invenio.dto.Especificacionesdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Especificacionesbl {
    private final Especificacionesrepository especificacionesrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Especificacionesbl.class);

    @Autowired
    public Especificacionesbl(Especificacionesrepository especificacionesrepository) {
        this.especificacionesrepository = especificacionesrepository;
    }

    public Especificacionesdto CrearEspecificaciones(String serie, String marca, String estado, int eq, int dimension_alto, int dimension_ancho, String ram, String procesador, String memoria, String color, int Activo_activoo_id){
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
        especificacionesEntity.setActivo_activoo_id(Activo_activoo_id);
        especificacionesrepository.save(especificacionesEntity);
        return new Especificacionesdto(especificacionesEntity.getEspecificaciones_id(), Activo_activoo_id, serie, marca, estado, eq, dimension_alto, dimension_ancho, ram, procesador, memoria, color);
    }
    public Map<String, Object> obtenerEspecificaciones(int id){
        LOG.info("Obteniendo especificaciones con id: {}", id);
        Especificaciones especificacionesEntity = especificacionesrepository.findById(id).orElse(null);
        if (especificacionesEntity != null && especificacionesEntity.getActivo_activoo_id() == id) {
            Map<String, Object> response = new HashMap<>();
            if (especificacionesEntity.getSerie() != null && !especificacionesEntity.getSerie().isEmpty()) {
                response.put("serie", especificacionesEntity.getSerie());
            }
            if (especificacionesEntity.getMarca() != null && !especificacionesEntity.getMarca().isEmpty()) {
                response.put("marca", especificacionesEntity.getMarca());
            }
            if (especificacionesEntity.getEstado() != null && !especificacionesEntity.getEstado().isEmpty()) {
                response.put("estado", especificacionesEntity.getEstado());
            }
            if (especificacionesEntity.getEq() != 0) {
                response.put("eq", especificacionesEntity.getEq());
            }
            if (especificacionesEntity.getDimension_alto() != 0) {
                response.put("dimension_alto", especificacionesEntity.getDimension_alto());
            }
            if (especificacionesEntity.getDimension_ancho() != 0) {
                response.put("dimension_ancho", especificacionesEntity.getDimension_ancho());
            }
            if (especificacionesEntity.getRam() != null && !especificacionesEntity.getRam().isEmpty()) {
                response.put("ram", especificacionesEntity.getRam());
            }
            if (especificacionesEntity.getProcesador() != null && !especificacionesEntity.getProcesador().isEmpty()) {
                response.put("procesador", especificacionesEntity.getProcesador());
            }
            if (especificacionesEntity.getMemoria() != null && !especificacionesEntity.getMemoria().isEmpty()) {
                response.put("memoria", especificacionesEntity.getMemoria());
            }
            if (especificacionesEntity.getColor() != null && !especificacionesEntity.getColor().isEmpty()) {
                response.put("color", especificacionesEntity.getColor());
            }
            return response;
        } else {
            return null;
        }
    }
}