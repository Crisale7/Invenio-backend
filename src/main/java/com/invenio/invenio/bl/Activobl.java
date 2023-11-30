package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Activo;
import com.invenio.invenio.dao.Repository.Activorepository;
import com.invenio.invenio.dto.Activodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public int obtenerIdPorNombre(String nombre){
        LOG.info("Obteniendo ID de activo con nombre: {}", nombre);
        Activo activoEntity = activorepository.findByNombre(nombre);
        if (activoEntity != null) {
            return activoEntity.getActivo_id();
        } else {
            return -1; // O cualquier otro valor que indique que el activo no se encontró
        }
    }

    public List<Integer> GetActivoIdsByModeloId(int modeloId){
        LOG.info("Buscando activos con Modelo_modelo_id: {}", modeloId);
        List<Activo> activos = activorepository.findByModeloId(modeloId);
        return activos.stream().map(Activo::getActivo_id).collect(Collectors.toList());
    }
}
