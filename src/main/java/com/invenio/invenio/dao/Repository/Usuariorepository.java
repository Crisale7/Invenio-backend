package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuariorepository extends JpaRepository<Usuario, Integer> {
}