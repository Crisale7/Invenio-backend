package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Gruporepository extends JpaRepository<Grupo, Integer> {
}
