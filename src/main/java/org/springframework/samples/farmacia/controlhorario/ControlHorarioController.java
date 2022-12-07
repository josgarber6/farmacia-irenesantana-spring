package org.springframework.samples.farmacia.controlhorario;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.farmacia.empleado.Empleado;
import org.springframework.samples.farmacia.empleado.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlHorarioController {
  
  private ControlHorarioService controlHorarioService;
  private EmpleadoService empleadoService;

  public static final String CREATE_CONTROL = "chs/createControlHorario";

  @Autowired
  public ControlHorarioController(ControlHorarioService cs, EmpleadoService empleadoService) {
    this.controlHorarioService = cs;
    this.empleadoService = empleadoService;
  }

  @ModelAttribute("tipos")
	public Collection<Tipo> populateControlHorarioTypes() {
		return this.controlHorarioService.findByControlHorarioTypes();
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
    if (br.hasErrors()){
      model.put("control", ch);
      model.put("num_vendedores", empleadoService.findAllNumVendedor());
      return CREATE_CONTROL;
    } else {
      ControlHorario newControlHorario = new ControlHorario();
      Empleado chEmpleado = ch.getEmpleado();
      // if (chEmpleado.getClave() == empleadoService.)
      newControlHorario.setEmpleado(ch.getEmpleado());
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
