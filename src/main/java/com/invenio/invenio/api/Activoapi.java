package com.invenio.invenio.api;

import com.invenio.invenio.bl.Activobl;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/obtenerIdPorNombre/{nombre}")
    public int obtenerIdPorNombre(@PathVariable String nombre) {
        LOG.info("Recibida solicitud GET para obtener ID de activo con nombre: {}", nombre);
        return activobl.obtenerIdPorNombre(nombre);
    }

    @GetMapping("/idsByModeloId/{modeloId}")
    public List<Integer> GetActivoIdsByModeloId(@PathVariable int modeloId) {
        LOG.info("Recibida solicitud GET para buscar activos con Modelo_modelo_id: {}", modeloId);
        return activobl.GetActivoIdsByModeloId(modeloId);
    }
}