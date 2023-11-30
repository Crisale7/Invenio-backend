package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.ActivoAtributo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivoAtributorepository extends JpaRepository<ActivoAtributo, Integer> {
    @Query("SELECT aa FROM ActivoAtributo aa WHERE aa.Atributos_atributos_id = :atributosId")
    List<ActivoAtributo> findByAtributosId(@Param("atributosId") int atributosId);
}
