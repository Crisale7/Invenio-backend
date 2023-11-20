package com.invenio.invenio.api;

import com.invenio.invenio.bl.Rolbl;
import com.invenio.invenio.dto.Roldto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rol")
public class Rolapi {

    private final Rolbl rolbl;
    private static final Logger LOG = LoggerFactory.getLogger(Rolapi.class);

    @Autowired
    public Rolapi(Rolbl rolbl) {
        this.rolbl = rolbl;
    }

    @PostMapping ("/crear")
    public int CrearRol(@RequestParam String rol, @RequestParam int Grupo_grupo_id, @RequestParam int Usuario_usuario_id) {
        LOG.info("Recibida solicitud POST para crear rol con nombre: {}", rol);
        Roldto roldto = rolbl.CrearRol(rol, Grupo_grupo_id, Usuario_usuario_id);
        return roldto.getRol_id();
    }
}