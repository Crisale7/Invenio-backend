package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Repository.TipoProductorepository;
import com.invenio.invenio.dao.TipoProducto;
import com.invenio.invenio.dto.TipoProductodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProductobl {
    private final TipoProductorepository tipoProductorepository;
    private static final Logger LOG = LoggerFactory.getLogger(TipoProductobl.class);

    @Autowired
    public TipoProductobl(TipoProductorepository tipoProductorepository) {
        this.tipoProductorepository = tipoProductorepository;
    }

    public TipoProductodto CrearTipoProducto(String tipo_producto){
        LOG.info("Creando tipo de producto con nombre: {}", tipo_producto);
        TipoProducto tipoProductoEntity = new TipoProducto();
        tipoProductoEntity.setTipo_producto(tipo_producto);
        tipoProductorepository.save(tipoProductoEntity);
        return new TipoProductodto(tipoProductoEntity.getTipo_producto_id(), tipo_producto);
    }
}
