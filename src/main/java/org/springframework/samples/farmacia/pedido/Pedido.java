package org.springframework.samples.farmacia.pedido;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulos")
@Getter
@Setter
public class Pedido extends BaseEntity {

  private String proveedor;
  private Date fecha;
  private LocalTime hora;

  @Enumerated(EnumType.STRING)
  private Estado estado;
  private String clave;

  public Double getPrecioTotal() {
    return null;
  }
  
}
