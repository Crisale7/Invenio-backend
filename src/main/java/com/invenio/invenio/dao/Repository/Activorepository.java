package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Activo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Activorepository extends JpaRepository<Activo, Integer> {
    @Query(value = "SELECT a FROM Activo a WHERE a.nombre = :nombre")
    Activo findByNombre(@Param("nombre") String nombre);
}

