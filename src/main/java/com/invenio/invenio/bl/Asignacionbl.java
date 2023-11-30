package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Asignacion;
import com.invenio.invenio.dao.Repository.Asignacionrepository;
import com.invenio.invenio.dto.Asignaciondto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Asignacionbl {
    private final Asignacionrepository asignacionrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Asignacionbl.class);

    @Autowired
    public Asignacionbl(Asignacionrepository asignacionrepository) {
        this.asignacionrepository = asignacionrepository;
    }

    public Asignaciondto CrearAsignacion(int Activo_activo_id, Timestamp fecha_salida){
        LOG.info("Creando asignacion con Activo_activo_id: {}", Activo_activo_id);
        Asignacion asignacionEntity = new Asignacion();
        asignacionEntity.setActivo_activo_id(Activo_activo_id);
        asignacionEntity.setFecha_salida(fecha_salida);
        asignacionrepository.save(asignacionEntity);
        return new Asignaciondto(asignacionEntity.getAsignacion_id(), Activo_activo_id, fecha_salida);
    }

    public List<Integer> GetActivoIdsByFechaSalida(Timestamp fechaSalida){
        LOG.info("Buscando Asignacion con fecha_salida: {}", fechaSalida);
        List<Asignacion> asignaciones = asignacionrepository.findByFechaSalida(fechaSalida);
        return asignaciones.stream().map(Asignacion::getActivo_activo_id).collect(Collectors.toList());
    }
}