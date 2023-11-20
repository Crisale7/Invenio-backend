package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Activo;
import com.invenio.invenio.dao.Repository.Activorepository;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activobl {
    private final Activorepository activorepository;
    private static final Logger LOG = LoggerFactory.getLogger(Activobl.class);

    @Autowired
    public Activobl(Activorepository activorepository) {
        this.activorepository = activorepository;
    }

    public Activodto CrearActivo(String nombre, double precio_unitario, int Modelo_modelo_id, int Entrada_entrada_id){
        LOG.info("Creando activo con nombre: {}", nombre);
        Activo activoEntity = new Activo();
        activoEntity.setNombre(nombre);
        activoEntity.setPrecio_unitario(precio_unitario);
        activoEntity.setModelo_modelo_id(Modelo_modelo_id);
        activoEntity.setEntrada_entrada_id(Entrada_entrada_id);
        activorepository.save(activoEntity);
        return new Activodto(activoEntity.getActivo_id(), Modelo_modelo_id, Entrada_entrada_id, nombre, precio_unitario);
    }
}
