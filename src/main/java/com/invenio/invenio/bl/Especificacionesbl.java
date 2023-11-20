package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Especificaciones;
import com.invenio.invenio.dao.Repository.Especificacionesrepository;
import com.invenio.invenio.dto.Especificacionesdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}