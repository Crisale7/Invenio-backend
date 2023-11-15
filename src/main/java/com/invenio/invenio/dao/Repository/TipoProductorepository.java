package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProductorepository extends JpaRepository<TipoProducto, Integer> {
}
