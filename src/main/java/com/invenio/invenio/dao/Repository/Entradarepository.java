package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface Entradarepository extends JpaRepository<Entrada, Integer> {
    @Query("SELECT e FROM Entrada e WHERE e.fecha_entrada = :fechaEntrada")
    List<Entrada> findByFechaEntrada(@Param("fechaEntrada") Timestamp fechaEntrada);
}