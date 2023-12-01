package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Repository.Usuariorepository;
import com.invenio.invenio.dao.Usuario;
import com.invenio.invenio.dto.Usuariodto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class Usuariobl {
    private final Usuariorepository usuariorepository;
    private static final Logger LOG = LoggerFactory.getLogger(Usuariobl.class);

    @Autowired
    public Usuariobl(Usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    public Usuariodto CrearUsuario(String contrasena, String nombre, String usuario, int Asignacion_asignacion_id){
        LOG.info("Creando usuario con nombre: {}", nombre);
        Usuario usuarioEntity = new Usuario();
        usuarioEntity.setHash_contrasena(getSHA256(contrasena));
        usuarioEntity.setNombre(nombre);
        usuarioEntity.setUsuario(usuario);
        usuarioEntity.setAsignacion_asignacion_id(Asignacion_asignacion_id);
        usuariorepository.save(usuarioEntity);
        return new Usuariodto(usuarioEntity.getHash_contrasena(), usuarioEntity.getNombre(), usuarioEntity.getUsuario(), usuarioEntity.getAsignacion_asignacion_id());
    }

    private static String getSHA256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

