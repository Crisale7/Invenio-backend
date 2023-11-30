package com.invenio.invenio.api;

import com.invenio.invenio.bl.ActivoAtributobl;
import com.invenio.invenio.dto.ActivoAtributodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/activoAtributo")
public class ActivoAtributoapi {

    private final ActivoAtributobl activoAtributobl;
    private static final Logger LOG = LoggerFactory.getLogger(ActivoAtributoapi.class);

    @Autowired
    public ActivoAtributoapi(ActivoAtributobl activoAtributobl) {
        this.activoAtributobl = activoAtributobl;
    }

    @PostMapping("/crear")
    public int CrearActivoAtributo(@RequestParam int Atributos_atributos_id, @RequestParam int Activo_activo_id, @RequestParam String detalle) {
        LOG.info("Recibida solicitud POST para crear ActivoAtributo con Atributos_atributos_id: {}", Atributos_atributos_id);
        ActivoAtributodto activoAtributodto = activoAtributobl.CrearActivoAtributo(Atributos_atributos_id, Activo_activo_id, detalle);
        return activoAtributodto.getEquipo_atributo_id();
    }

    @GetMapping("/activoIdsByAtributosId/{atributosId}")
    public List<Integer> GetActivoIdsByAtributosId(@PathVariable int atributosId) {
        LOG.info("Recibida solicitud GET para buscar ActivoAtributo con Atributos_atributos_id: {}", atributosId);
        return activoAtributobl.GetActivoIdsByAtributosId(atributosId);
    }
}
