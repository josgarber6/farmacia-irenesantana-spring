package org.springframework.samples.farmacia.venta;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "ventas")
@Getter
@Setter
public class Venta extends BaseEntity {

  private Date fecha;

  @Column(name = "tipo_pago")
  private TipoPago tipoPago;

  public Double getPrecioTotal() {
    return null;
  }

}
