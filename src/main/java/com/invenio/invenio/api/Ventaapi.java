package com.invenio.invenio.api;

import com.invenio.invenio.bl.Ventabl;
import com.invenio.invenio.dto.Ventadto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/venta")
public class Ventaapi {

    private final Ventabl ventabl;
    private static final Logger LOG = LoggerFactory.getLogger(Ventaapi.class);

    @Autowired
    public Ventaapi(Ventabl ventabl) {
        this.ventabl = ventabl;
    }

    @PostMapping("/crear")
    public int CrearVenta(@RequestParam double precio_total, @RequestParam int Activo_activo_id, @RequestParam String fecha_venta) throws ParseException, ParseException {
        LOG.info("Recibida solicitud POST para crear venta con precio_total: {}", precio_total);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateFormat.parse(fecha_venta);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
        Ventadto ventadto = ventabl.CrearVenta(precio_total, Activo_activo_id, timestamp);
        return ventadto.getVenta_id();
    }
}
