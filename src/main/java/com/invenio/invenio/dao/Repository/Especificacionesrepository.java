package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Especificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Especificacionesrepository extends JpaRepository<Especificaciones, Integer> {
}

