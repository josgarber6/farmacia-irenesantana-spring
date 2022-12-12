package org.springframework.samples.farmacia.venta;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.farmacia.articulo.Articulo;
import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "ventas")
@Getter
@Setter
public class Venta extends BaseEntity {

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private LocalDate fecha;

  @Column(name = "tipo_pago")
  @Enumerated(EnumType.STRING)
  private TipoPago tipoPago;

  @Column(name = "precio_total")
  private Double precioTotal;

  @ManyToMany
	@JoinTable(name = "venta_articulos", joinColumns = @JoinColumn(name = "venta_id"), inverseJoinColumns = @JoinColumn(name = "articulo_id"))
	private Set<Articulo> articulos;

  @OneToMany(mappedBy="venta")
    private Collection<LineaVenta> lineasVenta;

}
