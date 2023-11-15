package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Asignacionrepository extends JpaRepository<Asignacion, Integer> {
}
