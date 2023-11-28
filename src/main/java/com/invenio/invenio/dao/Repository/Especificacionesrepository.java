package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Especificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Especificacionesrepository extends JpaRepository<Especificaciones, Integer> {
    @Query(value =
            """
                    SELECT e FROM Especificaciones e
                    WHERE e.Activo_activo_id = :activoId
                    """)
    List<Especificaciones> findByActivo_activo_id(@Param("activoId") int activoId);
}

