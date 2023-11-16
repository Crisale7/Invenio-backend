package com.invenio.invenio.dao.Repository;


import com.invenio.invenio.dao.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ventarepository extends JpaRepository<Venta, Integer> {
}