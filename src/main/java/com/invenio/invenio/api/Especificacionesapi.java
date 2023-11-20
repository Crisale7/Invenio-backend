package com.invenio.invenio.api;

import com.invenio.invenio.bl.Especificacionesbl;
import com.invenio.invenio.dto.Especificacionesdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/especificaciones")
public class Especificacionesapi {

    private final Especificacionesbl especificacionesbl;
    private static final Logger LOG = LoggerFactory.getLogger(Especificacionesapi.class);

    @Autowired
    public Especificacionesapi(Especificacionesbl especificacionesbl) {
        this.especificacionesbl = especificacionesbl;
    }

    @PostMapping("/crear")
    public int CrearEspecificaciones(@RequestParam String serie, @RequestParam String marca, @RequestParam String estado, @RequestParam int eq, @RequestParam int dimension_alto, @RequestParam int dimension_ancho, @RequestParam String ram, @RequestParam String procesador, @RequestParam String memoria, @RequestParam String color, @RequestParam int Activo_activoo_id) {
        LOG.info("Recibida solicitud POST para crear especificaciones con serie: {}", serie);
        Especificacionesdto especificacionesdto = especificacionesbl.CrearEspecificaciones(serie, marca, estado, eq, dimension_alto, dimension_ancho, ram, procesador, memoria, color, Activo_activoo_id);
        return especificacionesdto.getEspecificaciones_id();
    }
}