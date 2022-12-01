package org.springframework.samples.farmacia.articulo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ArticuloRepository extends CrudRepository<Articulo, Integer> {

    List<Articulo> findAll();

    




   
}
