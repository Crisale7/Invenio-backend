package com.invenio.invenio.api;

import com.invenio.invenio.bl.Usuariobl;
import com.invenio.invenio.dto.Usuariodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class Usuarioapi {

    private final Usuariobl usuariobl;
    private static final Logger LOG = LoggerFactory.getLogger(Usuarioapi.class);

    @Autowired
    public Usuarioapi(Usuariobl usuariobl) {
        this.usuariobl = usuariobl;
    }

    @PostMapping("/crear")
    public Usuariodto crearUsuario(@RequestParam String contrasena, @RequestParam String nombre, @RequestParam String usuario, @RequestParam int Asignacion_asignacion_id) {
        return usuariobl.CrearUsuario(contrasena, nombre, usuario, Asignacion_asignacion_id);
    }
}