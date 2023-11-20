package com.invenio.invenio.api;

import com.invenio.invenio.bl.Atributosbl;
import com.invenio.invenio.dto.Atributosdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/atributos")
public class Atributosapi {

    private final Atributosbl atributosbl;
    private static final Logger LOG = LoggerFactory.getLogger(Atributosapi.class);

    @Autowired
    public Atributosapi(Atributosbl atributosbl) {
        this.atributosbl = atributosbl;
    }

    @PostMapping("/crear")
    public int CrearAtributos(@RequestParam String nombre, @RequestParam String tipo, @RequestParam boolean obligatorio) {
        LOG.info("Recibida solicitud POST para crear atributo con nombre: {}", nombre);
        Atributosdto atributosdto = atributosbl.CrearAtributos(nombre, tipo, obligatorio);
        return atributosdto.getAtributos_id();
    }
}