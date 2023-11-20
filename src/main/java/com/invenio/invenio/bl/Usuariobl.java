package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Repository.Usuariorepository;
import com.invenio.invenio.dao.Usuario;
import com.invenio.invenio.dto.Usuariodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Usuariobl {
    private final Usuariorepository usuariorepository;
    private static final Logger LOG = LoggerFactory.getLogger(Usuariobl.class);

    @Autowired
    public Usuariobl(Usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    public Usuariodto CrearUsuario(String hash_contrasena, String nombre, String usuario){
        LOG.info("Creando usuario con nombre: {}", nombre);
        Usuario usuarioEntity = new Usuario();
        usuarioEntity.setHash_contrasena(hash_contrasena);
        usuarioEntity.setNombre(nombre);
        usuarioEntity.setUsuario(usuario);
        usuariorepository.save(usuarioEntity);
        return new Usuariodto(usuarioEntity.getUsuario_id(), hash_contrasena, nombre, usuario);
    }
}
