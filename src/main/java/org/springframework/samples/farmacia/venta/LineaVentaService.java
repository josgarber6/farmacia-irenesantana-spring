package org.springframework.samples.farmacia.venta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LineaVentaService {

  private LineaVentaRepository lineaVentaRepository;

  @Autowired
  public LineaVentaService(LineaVentaRepository lr) {
    this.lineaVentaRepository = lr;
  }

  @Transactional(readOnly = true)
  public List<LineaVenta> findAll() {
    return lineaVentaRepository.findAll();
  }
}
