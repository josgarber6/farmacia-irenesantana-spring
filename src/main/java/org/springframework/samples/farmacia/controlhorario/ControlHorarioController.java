package org.springframework.samples.farmacia.controlhorario;

import java.time.LocalTime;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.farmacia.empleado.Empleado;
import org.springframework.samples.farmacia.util.AuthenticationService;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public class ControlHorarioController {
  
  private ControlHorarioService controlHorarioService;
  private AuthenticationService authService;

  public final static String CREATE_CONTROL = "controlhorario/createControlHorario";

  @Autowired
  public ControlHorarioController(ControlHorarioService cs, AuthenticationService as) {
    this.controlHorarioService = cs;
    this.authService = as;
  }

  @GetMapping(value="/controlhorario")
  public String getControlHorario(ModelMap model) {
    model.put("controles", controlHorarioService.findAll());
    return "controlhorario/ControlListing";
  }

  @GetMapping(value = "/controlhorario/new")
  public String addControlHorario(ModelMap model) {
    model.put("control", new ControlHorario());
    return CREATE_CONTROL;
  }

  @PostMapping(value = "/controlhorario/new")
  public String saveControlHorario(@Valid ControlHorario ch, BindingResult br, ModelMap model) {
    Empleado e = authService.getEmpleado();
    if (br.hasErrors()){
      return CREATE_CONTROL;
    } else {
      ControlHorario newControlHorario = new ControlHorario();
      newControlHorario.setEmpleadoId(e.getId());
      newControlHorario.setHora(LocalTime.now());
      newControlHorario.setHorarioFichaAnterior(new Date());
      newControlHorario.setTipo(ch.getTipo());
      BeanUtils.copyProperties(ch, newControlHorario, "id");
      this.controlHorarioService.saveControlHorario(newControlHorario);
      model.put("message", "Control Horario creado correctamente.");
      return "redirect:/";
    }
  }
  

}
