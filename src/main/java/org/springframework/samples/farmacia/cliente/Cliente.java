package org.springframework.samples.farmacia.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

  @NotNull
  private String direccion;

  @NotNull
  @Column(name = "firma_electronica")
  private String firmaElectronica;
  
  @NotNull
  private String telefono;

  private String dni;
  
  @Size(min = 0, max = 500)
  private String observacion;
  
}
