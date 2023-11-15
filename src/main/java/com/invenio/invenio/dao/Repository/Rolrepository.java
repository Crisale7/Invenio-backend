package com.invenio.invenio.dao.Repository;

import com.invenio.invenio.dao.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rolrepository extends JpaRepository<Rol, Integer> {
}