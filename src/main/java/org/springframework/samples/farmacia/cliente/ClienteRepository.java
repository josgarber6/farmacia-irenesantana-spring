package org.springframework.samples.farmacia.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
  
    public List<Cliente> findAll();
    @Query("SELECT c FROM Cliente c WHERE c.nombre =:nombre")
    public Cliente findByName(@Param("nombre") String nombre);
}
