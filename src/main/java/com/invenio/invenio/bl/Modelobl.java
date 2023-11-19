package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Modelo;
import com.invenio.invenio.dao.Repository.Modelorepository;
import com.invenio.invenio.dao.TipoProducto;
import com.invenio.invenio.dto.Modelodto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Modelobl {
   /* private final Modelorepository modelorepository;
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(Modelobl.class);

    @Autowired
    public Modelobl(Modelorepository modelorepository) {
        this.modelorepository = modelorepository;
    }

    public Modelodto CrearModelo(Long tipoProductoId, String modelo){
        LOG.info("Creando modelo con nombre: {}");
        Modelo modeloEntity = new Modelo();
        modeloEntity.setTipo_producto(new TipoProducto(tipoProductoId));
        modeloEntity.setModelo(modelo);
        modelorepository.save(modeloEntity);
        return new Modelodto(modeloEntity.getModelo_id(), Math.toIntExact(tipoProductoId), modelo);
    }*/
}
