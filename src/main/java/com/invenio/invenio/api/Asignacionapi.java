package com.invenio.invenio.api;

import com.invenio.invenio.bl.Asignacionbl;
import com.invenio.invenio.dto.Asignaciondto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/asignacion")
public class Asignacionapi {

    private final Asignacionbl asignacionbl;
    private static final Logger LOG = LoggerFactory.getLogger(Asignacionapi.class);

    @Autowired
    public Asignacionapi(Asignacionbl asignacionbl) {
        this.asignacionbl = asignacionbl;
    }

    @PostMapping("/crear")
    public int CrearAsignacion(@RequestParam int Activo_activo_id, @RequestParam String fecha_salida) throws ParseException {
        LOG.info("Recibida solicitud POST para crear asignacion con Activo_activo_id: {}", Activo_activo_id);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat.parse(fecha_salida);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        Asignaciondto asignaciondto = asignacionbl.CrearAsignacion(Activo_activo_id, timestamp);
        return asignaciondto.getAsignacion_id();
    }

    @GetMapping("/activoIdsByFechaSalida/{fechaSalida}")
    public List<Integer> GetActivoIdsByFechaSalida(@PathVariable String fechaSalida) throws ParseException {
        LOG.info("Recibida solicitud GET para buscar Asignacion con fecha_salida: {}", fechaSalida);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat.parse(fechaSalida);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        return asignacionbl.GetActivoIdsByFechaSalida(timestamp);
    }
}
