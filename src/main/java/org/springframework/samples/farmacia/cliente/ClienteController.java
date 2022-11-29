package org.springframework.samples.farmacia.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClienteController {
  
  private ClienteService clienteService;

  @Autowired
  public ClienteController(ClienteService cs) {
    this.clienteService = cs;
  }

}
