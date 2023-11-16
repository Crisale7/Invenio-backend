package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entradarepository extends JpaRepository<Entrada, Integer> {
}
