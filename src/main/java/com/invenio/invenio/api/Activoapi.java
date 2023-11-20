package com.invenio.invenio.api;

import com.invenio.invenio.bl.Activobl;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/activo")
public class Activoapi {

    private final Activobl activobl;
    private static final Logger LOG = LoggerFactory.getLogger(Activoapi.class);

    @Autowired
    public Activoapi(Activobl activobl) {
        this.activobl = activobl;
    }

    @PostMapping("/crear")
    public int CrearActivo(@RequestParam String nombre, @RequestParam double precio_unitario, @RequestParam int Modelo_modelo_id, @RequestParam int Entrada_entrada_id) {
        LOG.info("Recibida solicitud POST para crear activo con nombre: {}", nombre);
        Activodto activodto = activobl.CrearActivo(nombre, precio_unitario, Modelo_modelo_id, Entrada_entrada_id);
        return activodto.getActivo_id();
    }
}