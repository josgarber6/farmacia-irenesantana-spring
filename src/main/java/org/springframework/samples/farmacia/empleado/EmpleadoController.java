package org.springframework.samples.farmacia.empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpleadoController {

  private EmpleadoService empleadoService;

  @Autowired
  public EmpleadoController(EmpleadoService es) {
    this.empleadoService = es;
  }

}
