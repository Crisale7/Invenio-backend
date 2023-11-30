package com.invenio.invenio.api;

import com.invenio.invenio.bl.Modelobl;
import com.invenio.invenio.dto.ListaEspecificacionesdto;
import com.invenio.invenio.dto.Modelodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/modelo")
public class Modeloapi {

    private final Modelobl modelobl;
    private static final Logger LOG = LoggerFactory.getLogger(Modeloapi.class);

    @Autowired
    public Modeloapi(Modelobl modelobl) {
        this.modelobl = modelobl;
    }

    @PostMapping("/crear")
    public int CrearModelo(@RequestParam String modelo, @RequestParam int Tipo_Producto_tipo_producto_id) {
        LOG.info("Recibida solicitud POST para crear modelo con nombre: {}", modelo);
        Modelodto modelodto = modelobl.CrearModelo(modelo, Tipo_Producto_tipo_producto_id);
        return modelodto.getModelo_id();
    }

    @GetMapping("/id")
    public int GetModeloId(@RequestParam String modelo) {
        LOG.info("Recibida solicitud GET para buscar modelo con nombre: {}", modelo);
        return modelobl.GetModeloId(modelo);
    }
}
