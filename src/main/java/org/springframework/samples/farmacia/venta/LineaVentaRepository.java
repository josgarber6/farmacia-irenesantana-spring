package org.springframework.samples.farmacia.venta;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaVentaRepository extends CrudRepository<LineaVenta, Integer> {

  public List<LineaVenta> findAll();

  @Query("SELECT lr FROM LineaVenta lr WHERE lr.venta.id = :ventaId")
  public List<LineaVenta> findByVentaId(Integer ventaId);
  
}
