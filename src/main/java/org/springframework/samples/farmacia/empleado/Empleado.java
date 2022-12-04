package org.springframework.samples.farmacia.empleado;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.samples.farmacia.model.BaseEntity;
import org.springframework.samples.farmacia.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleados")
@Getter
@Setter
public class Empleado extends BaseEntity {

  private String nombre;

  @Enumerated(EnumType.STRING)
  private Rol rol;

  @Column(name = "num_vendedor")
  @NotNull
  private Integer numVendedor;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "username", referencedColumnName = "username")
	private User user;
  
}
