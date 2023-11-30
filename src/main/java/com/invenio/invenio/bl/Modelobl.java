package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Modelo;
import com.invenio.invenio.dao.Repository.Modelorepository;
import com.invenio.invenio.dto.Modelodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Modelobl {
    private final Modelorepository modelorepository;
    private static final Logger LOG = LoggerFactory.getLogger(Modelobl.class);

    @Autowired
    public Modelobl(Modelorepository modelorepository) {
        this.modelorepository = modelorepository;
    }

    public Modelodto CrearModelo(String modelo, int Tipo_Producto_tipo_producto_id){
        LOG.info("Creando modelo con nombre: {}", modelo);
        Modelo modeloEntity = new Modelo();
        modeloEntity.setModelo(modelo);
        modeloEntity.setTipo_Producto_tipo_producto_id(Tipo_Producto_tipo_producto_id);
        modelorepository.save(modeloEntity);
        return new Modelodto(modeloEntity.getModelo_id(), Tipo_Producto_tipo_producto_id, modelo);
    }
    public int GetModeloId(String modelo){
        LOG.info("Buscando modelo con nombre: {}", modelo);
        Modelo modeloEntity = modelorepository.findByModelo(modelo);
        return modeloEntity.getModelo_id();
    }
}