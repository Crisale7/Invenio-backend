package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Modelorepository extends JpaRepository<Modelo, Integer> {
}
