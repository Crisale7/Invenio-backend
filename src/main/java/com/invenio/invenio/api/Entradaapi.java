package com.invenio.invenio.api;

import com.invenio.invenio.bl.Entradabl;
import com.invenio.invenio.dto.Entradadto;
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
@RequestMapping("/api/v1/entrada")
public class Entradaapi {

    private final Entradabl entradabl;
    private static final Logger LOG = LoggerFactory.getLogger(Entradaapi.class);

    @Autowired
    public Entradaapi(Entradabl entradabl) {
        this.entradabl = entradabl;
    }

    @PostMapping ("/crear")
    public int CrearEntrada(@RequestParam String detalle, @RequestParam String fecha_entrada) throws ParseException {
        LOG.info("Recibida solicitud POST para crear entrada con detalle: {}", detalle);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat.parse(fecha_entrada);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        Entradadto entradadto = entradabl.CrearEntrada(detalle, timestamp);
        return entradadto.getEntrada_id();
    }

    @GetMapping("/entradaIdsByFechaEntrada/{fechaEntrada}")
    public List<Integer> GetEntradaIdsByFechaEntrada(@PathVariable String fechaEntrada) throws ParseException {
        LOG.info("Recibida solicitud GET para buscar Entrada con fecha_entrada: {}", fechaEntrada);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat.parse(fechaEntrada);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        return entradabl.GetEntradaIdsByFechaEntrada(timestamp);
    }
}