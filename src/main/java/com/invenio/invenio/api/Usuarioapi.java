package com.invenio.invenio.api;

import com.invenio.invenio.bl.Usuariobl;
import com.invenio.invenio.dto.Usuariodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public int CrearUsuario(@RequestParam String hash_contrasena, @RequestParam String nombre, @RequestParam String usuario) {
        LOG.info("Recibida solicitud POST para crear usuario con nombre: {}", nombre);
        Usuariodto usuariodto = usuariobl.CrearUsuario(hash_contrasena, nombre, usuario);
        return usuariodto.getUsuario_id();
    }
}