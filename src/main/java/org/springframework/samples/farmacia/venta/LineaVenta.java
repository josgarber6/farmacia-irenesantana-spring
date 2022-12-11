package org.springframework.samples.farmacia.venta;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.samples.farmacia.articulo.Articulo;
import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "linea_venta")
@Getter
@Setter
public class LineaVenta extends BaseEntity {
  
  @NotNull
  @Min(0)
  private Integer cantidad;

  @NotNull
  @Min(0)
  private Double precio;

  @ManyToOne
  @JoinColumn(name = "articulo_id", referencedColumnName = "id")
  private Articulo articulo;
  
  @ManyToOne
  @JoinColumn(name = "venta_id", referencedColumnName = "id")
  private Venta venta;
  
}
