package org.springframework.samples.farmacia.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClienteController {
  
  private ClienteService clienteService;

  private static final String LIST_ALL_CLIENTES = "/clientes/listClientes";
  private static final String CREATE_CLIENTE = "/clientes/createCliente";

  @Autowired
  public ClienteController(ClienteService cs) {
    this.clienteService = cs;
  }

  @GetMapping("/clientes")
  public String findAllClientes(ModelMap model) {
    List<Cliente> clientes = clienteService.findAll();
    model.put("clientes", clientes);
    return LIST_ALL_CLIENTES;
  }

  @GetMapping("/clientes/new")
  public String addCliente(ModelMap model) {
    model.put("cliente", new Cliente());
    return CREATE_CLIENTE;
  }

  @PostMapping("/clientes/new")
  public String saveCliente(@Valid Cliente cliente, BindingResult br, ModelMap model) {
      if (br.hasErrors()) {
        return CREATE_CLIENTE;
      } else {
        Cliente newCliente = new Cliente();
        BeanUtils.copyProperties(cliente, newCliente);
        Cliente createdCliente = clienteService.saveCliente(newCliente);
        model.put("message", "Cliente " + createdCliente.getId() + " creado correctamente");
        model.put("messageType", "info");
        return "redirect:/clientes";
      }
  }

}
