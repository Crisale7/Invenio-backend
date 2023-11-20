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

    public Roldto CrearRol(String rol, int Grupo_grupo_id, int Usuario_usuario_id){
        LOG.info("Creando rol con nombre: {}", rol);
        Rol rolEntity = new Rol();
        rolEntity.setRol(rol);
        rolEntity.setGrupo_grupo_id(Grupo_grupo_id);
        rolEntity.setUsuario_usuario_id(Usuario_usuario_id);
        rolrepository.save(rolEntity);
        return new Roldto(rolEntity.getRol(), rolEntity.getGrupo_grupo_id(), rolEntity.getUsuario_usuario_id());
    }
}