package org.springframework.samples.farmacia.venta;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VentaController {
  
  private VentaService ventaService;

  private static final String LIST_VENTAS = "ventas/listVentas";
  private static final String GET_VENTA_DETAIL = "ventas/ventaInfo";
  private static final String CREATE_VENTA = "ventas/createVenta";

  @Autowired
  public VentaController(VentaService vs) {
    this.ventaService = vs;
  }
  
@GetMapping("/historialventas")
public String listAllVentas(ModelMap model) {
  List<Venta> ventas = ventaService.findAll();
  for(Venta venta: ventas) {
    Integer id = venta.getId();
    Double precioTotal = ventaService.precioTotal(id);
    venta.setPrecioTotal(precioTotal);
  }
  model.put("ventas", ventaService.findAll());
  return LIST_VENTAS;
}

@GetMapping("/ventas/{id}")
public String getVentaDetail(@PathVariable("id") Integer id, ModelMap model) {
  model.put("venta", ventaService.findByVentaId(id));
  return GET_VENTA_DETAIL;
  }

  @GetMapping("/ventas/new")
  public String addVenta(ModelMap model) {
    model.put("venta", new Venta());
    return CREATE_VENTA;
  }

  @PostMapping("/ventas/new")
  public String saveVenta(@Valid Venta venta, BindingResult br, ModelMap model) {
      if (br.hasErrors()) {
        return CREATE_VENTA;
      } else {
        Venta newVenta = new Venta();
        BeanUtils.copyProperties(venta, newVenta);
        Venta createdVenta = ventaService.saveVenta(newVenta);
        model.put("message", "Venta " + createdVenta.getId() + " creado correctamente");
        model.put("messageType", "info");
        return "redirect:/ventas";
      }
  }

  @GetMapping("/ventas/{id}/edit")
  public String editVenta(@PathVariable("id") Integer id, ModelMap model) {
    Venta venta = ventaService.findByVentaId(id);
    if (venta != null) {
      model.put("venta", venta);
      return CREATE_VENTA;
    } else {
      model.put("message", "La venta " + id + " no existe");
      model.put("messageType", "info");
      return listAllVentas(model);
    }
  }

  @PostMapping("/ventas/{id}/edit")
  public String editVenta(@PathVariable("id") Integer id, @Valid Venta venta, BindingResult br, ModelMap model) {
    if (br.hasErrors()) {
      return CREATE_VENTA;
    } else {
      Venta ventaToUpdate = ventaService.findByVentaId(id);
      if (ventaToUpdate != null) {
        BeanUtils.copyProperties(venta, ventaToUpdate, "id");
        ventaService.saveVenta(ventaToUpdate);
        model.put("message", "Venta " + id + " actualizado correctamente");
        return listAllVentas(model);
      } else {
        model.put("message", "La venta " + id + " no existe");
        model.put("messageType", "info");
        return listAllVentas(model);
      }
    }
  }
}
