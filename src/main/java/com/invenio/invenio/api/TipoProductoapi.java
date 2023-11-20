package com.invenio.invenio.api;

import com.invenio.invenio.bl.TipoProductobl;
import com.invenio.invenio.dto.TipoProductodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tipoProducto")
public class TipoProductoapi {

    private final TipoProductobl tipoProductobl;
    private static final Logger LOG = LoggerFactory.getLogger(TipoProductoapi.class);

    @Autowired
    public TipoProductoapi(TipoProductobl tipoProductobl) {
        this.tipoProductobl = tipoProductobl;
    }

    @PostMapping("/crear")
    public int CrearTipoProducto(@RequestParam String tipo_producto) {
        LOG.info("Recibida solicitud POST para crear tipo de producto con nombre: {}", tipo_producto);
        TipoProductodto tipoProductodto = tipoProductobl.CrearTipoProducto(tipo_producto);
        return tipoProductodto.getTipo_producto_id();
    }
}