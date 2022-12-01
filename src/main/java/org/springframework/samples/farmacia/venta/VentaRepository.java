package org.springframework.samples.farmacia.venta;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VentaRepository extends CrudRepository<Venta, Integer> {

    List<Venta> findAll();
  
}
