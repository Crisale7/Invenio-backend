package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.ActivoAtributo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivoAtributorepository extends JpaRepository<ActivoAtributo, Integer> {
}
