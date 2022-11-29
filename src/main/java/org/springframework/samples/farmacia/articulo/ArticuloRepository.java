package org.springframework.samples.farmacia.articulo;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;


public interface ArticuloRepository extends CrudRepository<Articulo, Integer> {

    List<Articulo> findAll();

    




   
}
