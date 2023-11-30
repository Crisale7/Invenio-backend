package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface Asignacionrepository extends JpaRepository<Asignacion, Integer> {
    @Query("SELECT a FROM Asignacion a WHERE a.fecha_salida = :fechaSalida")
    List<Asignacion> findByFechaSalida(@Param("fechaSalida") Timestamp fechaSalida);
}

