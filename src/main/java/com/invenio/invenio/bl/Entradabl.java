package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Entrada;
import com.invenio.invenio.dao.Repository.Entradarepository;
import com.invenio.invenio.dto.Entradadto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class Entradabl {
    private final Entradarepository entradarepository;
    private static final Logger LOG = LoggerFactory.getLogger(Entradabl.class);

    @Autowired
    public Entradabl(Entradarepository entradarepository) {
        this.entradarepository = entradarepository;
    }

    public Entradadto CrearEntrada(String detalle, Timestamp fecha_entrada){
        LOG.info("Creando entrada con detalle: {}", detalle);
        Entrada entradaEntity = new Entrada();
        entradaEntity.setDetalle(detalle);
        entradaEntity.setFecha_entrada(fecha_entrada);
        entradarepository.save(entradaEntity);
        return new Entradadto(entradaEntity.getEntrada_id(), fecha_entrada, detalle);
    }
}