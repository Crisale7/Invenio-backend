package com.invenio.invenio.api;

import com.invenio.invenio.bl.Grupobl;
import com.invenio.invenio.dto.Grupodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/grupo")
public class Grupoapi {

    private final Grupobl grupobl;
    private static final Logger LOG = LoggerFactory.getLogger(Grupoapi.class);

    @Autowired
    public Grupoapi(Grupobl grupobl) {
        this.grupobl = grupobl;
    }

    @PostMapping("/crear")
    public int CrearGrupo(@RequestParam String grupo) {
        Grupodto grupodto = grupobl.CrearGrupo(grupo);
        return (grupodto.getGrupo_id());
    }
}