package org.springframework.samples.farmacia.articulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArticuloController {
  private final ArticuloService articuloService;

  @Autowired
  public ArticuloController(ArticuloService as) {
    this.articuloService = as;
  }



}
