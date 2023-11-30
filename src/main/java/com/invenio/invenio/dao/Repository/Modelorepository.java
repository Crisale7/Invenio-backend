package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Modelorepository extends JpaRepository<Modelo, Integer> {
    @Query("SELECT m FROM Modelo m WHERE m.modelo = :modelo")
    Modelo findByModelo(@Param("modelo") String modelo);
}
