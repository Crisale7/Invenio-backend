package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Atributos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Atributosrepository extends JpaRepository<Atributos, Integer> {
    @Query("SELECT a FROM Atributos a WHERE a.nombre = :nombre")
    Atributos findByNombre(@Param("nombre") String nombre);
}