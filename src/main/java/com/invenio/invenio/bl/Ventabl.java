package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Repository.Ventarepository;
import com.invenio.invenio.dao.Venta;
import com.invenio.invenio.dto.ListaVentasdto;
import com.invenio.invenio.dto.Ventadto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Ventabl {
    private final Ventarepository ventarepository;
    private static final Logger LOG = LoggerFactory.getLogger(Ventabl.class);

    @Autowired
    public Ventabl(Ventarepository ventarepository) {
        this.ventarepository = ventarepository;
    }

    public Ventadto CrearVenta(double precio_total, int Activo_activo_id, Timestamp fecha_venta){
        LOG.info("Creando venta con precio_total: {}", precio_total);
        Venta ventaEntity = new Venta();
        ventaEntity.setPrecio_total(precio_total);
        ventaEntity.setActivo_activo_id(Activo_activo_id);
        ventaEntity.setFecha_venta(fecha_venta);
        ventarepository.save(ventaEntity);
        return new Ventadto(ventaEntity.getVenta_id(), Activo_activo_id, fecha_venta, precio_total);
    }

    public List<ListaVentasdto> GetAllVentas(){
        LOG.info("Obteniendo todas las ventas");
        List<Venta> ventas = ventarepository.findAll();
        return ventas.stream().map(venta -> new ListaVentasdto(venta.getFecha_venta(), venta.getPrecio_total())).collect(Collectors.toList());
    }
}