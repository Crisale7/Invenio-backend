package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Activo;
import com.invenio.invenio.dao.Repository.Activorepository;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Activobl {

    private final Activorepository activorepository;
    private static final Logger LOG = (Logger) LoggerFactory.getLogger(Activobl.class);

    @Autowired
    public Activobl(Activorepository activorepository) {
        this.activorepository = activorepository;
    }

    //Logica para crear un activo
    public Activodto CrearActivo(Activodto activodto){
        LOG.info("Creando activo con nombre: {}");
        Activo activo = new Activo();
        activo.setModelo(activorepository.findById(activodto.getModelo_id()).orElseThrow(() -> new RuntimeException("Modelo no encontrado")));
        activo.setEntrada(activorepository.findById(activodto.getEntrada_id()).orElseThrow(() -> new RuntimeException("Entrada no encontrada")));
        activo.setNombre(activodto.getNombre());
        activo.setPrecio_unitario(activodto.getPrecio_unitario());
        activorepository.save(activo);
        return new Activodto(activo.getActivo_id(), activo.getModelo().getModelo_id(), activo.getEntrada().getEntrada_id(), activo.getNombre(), activo.getPrecio_unitario());
    }

    public Activodto obtenerActivo(String nombre) {
        LOG.info("Obteniendo activo con nombre: " + nombre);
        Activo activo = activorepository.findByNombre(nombre);
        return new Activodto(activo.getActivo_id(), activo.getModelo().getModelo_id(), activo.getEntrada().getEntrada_id(), activo.getNombre(), activo.getPrecio_unitario());
    }
}
