package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Atributos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Atributosrepository extends JpaRepository<Atributos, Integer> {
}