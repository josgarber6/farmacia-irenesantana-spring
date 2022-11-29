package org.springframework.samples.farmacia.venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VentaController {
  
  private VentaService ventaService;

  @Autowired
  public VentaController(VentaService vs) {
    this.ventaService = vs;
  }

}
