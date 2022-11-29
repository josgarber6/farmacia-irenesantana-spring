package org.springframework.samples.farmacia.cliente;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente extends BaseEntity {

  @NotNull
  private String nombre;

  @NotNull
  private String apellido;
  
  private String dni;
  
}
