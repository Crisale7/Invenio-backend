package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Grupo;
import com.invenio.invenio.dao.Repository.Rolrepository;
import com.invenio.invenio.dao.Rol;
import com.invenio.invenio.dao.Usuario;
import com.invenio.invenio.dto.Roldto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rolbl {
    private final Rolrepository rolrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Rolbl.class);

    @Autowired
    public Rolbl(Rolrepository rolrepository) {
        this.rolrepository = rolrepository;
    }

    public Roldto CrearRol(String rol){
        LOG.info("Creando rol con nombre: {}", rol);
        Rol rolEntity = new Rol();
        rolEntity.setRol(rol);
        rolrepository.save(rolEntity);
        return new Roldto(rolEntity.getRol_id(), rol);
    }
}
