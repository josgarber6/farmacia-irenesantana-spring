package org.springframework.samples.farmacia.venta;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Integer> {

  public List<Venta> findAll();
  
}
