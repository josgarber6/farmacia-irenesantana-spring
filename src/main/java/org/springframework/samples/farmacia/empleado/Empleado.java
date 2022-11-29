package org.springframework.samples.farmacia.empleado;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleados")
@Getter
@Setter
public class Empleado extends BaseEntity {

  private String nombre;
  private Rol rol;

  @NotNull
  private Integer numVendedor;

  @NotNull
  private String clave;
  
}
