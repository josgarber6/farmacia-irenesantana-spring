package org.springframework.samples.farmacia.articulo;

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
public class ArticuloController {
  private final ArticuloService articuloService;

  private static final String LIST_ALL_ARTICULOS = "articulos/listArticulos";
  private static final String GET_ARTICULO_DETAIL = "articulos/articuloInfo";
  private static final String CREATE_ARTICULO = "articulos/createArticulo";

  @Autowired
  public ArticuloController(ArticuloService as) {
    this.articuloService = as;
  }

  @GetMapping("/articulos")
  public String listAllArticulos(ModelMap model) {
    model.put("articulos", articuloService.findAll());
    return LIST_ALL_ARTICULOS;
  }

  @GetMapping("/articulos/{id}")
  public String getArticuloDetail(@PathVariable("id") Integer id, ModelMap model) {
    model.put("articulo", articuloService.findByArticuloId(id));
    return GET_ARTICULO_DETAIL;
  }

  @GetMapping("/articulos/new")
  public String addArticulo(ModelMap model) {
    model.put("articulo", new Articulo());
    return CREATE_ARTICULO;
  }

  @PostMapping("/articulos/new")
  public String saveArticulo(@Valid Articulo articulo, BindingResult br, ModelMap model) {
      if (br.hasErrors()) {
        return CREATE_ARTICULO;
      } else {
        Articulo newArticulo = new Articulo();
        BeanUtils.copyProperties(articulo, newArticulo);
        Articulo createdArticulo = articuloService.saveArticulo(newArticulo);
        model.put("message", "Articulo " + createdArticulo.getId() + " creado correctamente");
        model.put("messageType", "info");
        return "redirect:/articulos";
      }
  }

  @GetMapping("/articulos/{id}/edit")
  public String editArticulo(@PathVariable("id") Integer id, ModelMap model) {
    Articulo articulo = articuloService.findByArticuloId(id);
    if (articulo != null) {
      model.put("articulo", articulo);
      return CREATE_ARTICULO;
    } else {
      model.put("message", "El articulo " + id + " no existe");
      model.put("messageType", "info");
      return listAllArticulos(model);
    }
  }

  @PostMapping("/articulos/{id}/edit")
  public String editArticulo(@PathVariable("id") Integer id, @Valid Articulo articulo, BindingResult br, ModelMap model) {
    if (br.hasErrors()) {
      return CREATE_ARTICULO;
    } else {
      Articulo articuloToUpdate = articuloService.findByArticuloId(id);
      if (articuloToUpdate != null) {
        BeanUtils.copyProperties(articulo, articuloToUpdate, "id");
        articuloService.saveArticulo(articuloToUpdate);
        model.put("message", "Articulo " + id + " actualizado correctamente");
        return listAllArticulos(model);
      } else {
        model.put("message", "El articulo " + id + " no existe");
        model.put("messageType", "info");
        return listAllArticulos(model);
      }
    }
  }
  

}
