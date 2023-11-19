package com.invenio.invenio.api;

import com.invenio.invenio.bl.Modelobl;
import com.invenio.invenio.dto.Modelodto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/modelo")
public class Modeloapi {

   /* private final Modelobl modelobl;
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(Modeloapi.class);

    @Autowired
    public Modeloapi(Modelobl modelobl) {
        this.modelobl = modelobl;
    }

    @PostMapping ("/crear")
    public Long CrearModelo(@RequestParam Long tipoProductoId,
                            @RequestParam String modelo) {
        LOG.info("Recibida solicitud POST para crear modelo con nombre: {}");
        Modelodto modelodto = modelobl.CrearModelo(tipoProductoId, modelo);
        return (long) modelodto.getModelo_id();
    }*/
}
