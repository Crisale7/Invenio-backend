package com.invenio.invenio.bl;

import com.invenio.invenio.dao.ActivoAtributo;
import com.invenio.invenio.dao.Repository.ActivoAtributorepository;
import com.invenio.invenio.dto.ActivoAtributodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivoAtributobl {
    private final ActivoAtributorepository activoAtributorepository;
    private static final Logger LOG = LoggerFactory.getLogger(ActivoAtributobl.class);

    @Autowired
    public ActivoAtributobl(ActivoAtributorepository activoAtributorepository) {
        this.activoAtributorepository = activoAtributorepository;
    }

    public ActivoAtributodto CrearActivoAtributo(int Atributos_atributos_id, int Activo_activo_id, String detalle){
        LOG.info("Creando ActivoAtributo con Atributos_atributos_id: {}", Atributos_atributos_id);
        ActivoAtributo activoAtributoEntity = new ActivoAtributo();
        activoAtributoEntity.setAtributos_atributos_id(Atributos_atributos_id);
        activoAtributoEntity.setActivo_activo_id(Activo_activo_id);
        activoAtributoEntity.setDetalle(detalle);
        activoAtributorepository.save(activoAtributoEntity);
        return new ActivoAtributodto(activoAtributoEntity.getEquipo_atributo_id(), Atributos_atributos_id, Activo_activo_id, detalle);
    }
}
