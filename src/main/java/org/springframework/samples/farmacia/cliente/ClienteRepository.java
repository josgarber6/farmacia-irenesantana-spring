package org.springframework.samples.farmacia.cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
  
    @Query("SELECT c FROM Cliente c WHERE c.nombre =:nombre")
    public Cliente findByName(@Param("nombre") String nombre);
}
