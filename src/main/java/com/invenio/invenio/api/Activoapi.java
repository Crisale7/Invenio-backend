package com.invenio.invenio.api;

import com.invenio.invenio.bl.Activobl;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1/activo")
public class Activoapi {

   /* private final Activobl activobl;
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(Activoapi.class);

    @Autowired
    public Activoapi(Activobl activobl) {
        this.activobl = activobl;
    }

    @PostMapping("/crear")
    public void CrearActivo(@RequestBody Activodto activodto){
        LOG.info("Recibida solicitud POST para crear activo con nombre: {}");
        activobl.CrearActivo(activodto);
    }

    @GetMapping("/obtener")
    public Activodto obtenerActivo(@RequestParam String nombre) {
        LOG.info("Recibida solicitud GET para obtener activo con nombre: " + nombre);
        return activobl.obtenerActivo(nombre);
    }*/
}
