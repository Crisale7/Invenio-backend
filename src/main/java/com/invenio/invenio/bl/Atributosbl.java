package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Atributos;
import com.invenio.invenio.dao.Repository.Atributosrepository;
import com.invenio.invenio.dto.Atributosdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Atributosbl {
    private final Atributosrepository atributosrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Atributosbl.class);

    @Autowired
    public Atributosbl(Atributosrepository atributosrepository) {
        this.atributosrepository = atributosrepository;
    }

    public Atributosdto CrearAtributos(String nombre, String tipo, boolean obligatorio){
        LOG.info("Creando atributo con nombre: {}", nombre);
        Atributos atributosEntity = new Atributos();
        atributosEntity.setNombre(nombre);
        atributosEntity.setTipo(tipo);
        atributosEntity.setObligatorio(obligatorio);
        atributosrepository.save(atributosEntity);
        return new Atributosdto(atributosEntity.getAtributos_id(), nombre, tipo, obligatorio);
    }

    public int GetAtributosIdByNombre(String nombre){
        LOG.info("Buscando atributo con nombre: {}", nombre);
        Atributos atributos = atributosrepository.findByNombre(nombre);
        return atributos.getAtributos_id();
    }
}