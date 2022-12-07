package org.springframework.samples.farmacia.empleado;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.samples.farmacia.user.User;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "empleados")
@Getter
@Setter
public class Empleado {

  @Id
  private Integer id;

  private String nombre;

  @Enumerated(EnumType.STRING)
  private Rol rol;

  @OneToOne
  @JoinColumn(name = "username")
  private User user;

  private String clave;

  
}
