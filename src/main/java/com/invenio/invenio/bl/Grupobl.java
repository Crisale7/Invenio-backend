package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Grupo;
import com.invenio.invenio.dao.Repository.Gruporepository;
import com.invenio.invenio.dto.Grupodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Grupobl {
    private final Gruporepository gruporepository;
    private static final Logger LOG = LoggerFactory.getLogger(Grupobl.class);

    @Autowired
    public Grupobl(Gruporepository gruporepository) {
        this.gruporepository = gruporepository;
    }

    public Grupodto CrearGrupo(String grupo){
        LOG.info("Creando grupo con nombre: {}", grupo);
        Grupo grupoEntity = new Grupo();
        grupoEntity.setGrupo(grupo);
        gruporepository.save(grupoEntity);
        return new Grupodto(grupoEntity.getGrupo_id(), grupo);
    }
}