package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Activo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Activorepository extends JpaRepository<Activo, Integer> {
}
