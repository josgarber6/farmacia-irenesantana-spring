package org.springframework.samples.farmacia.controlhorario;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.samples.farmacia.empleado.Empleado;
import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "control_horario")
@Getter
@Setter
public class ControlHorario extends BaseEntity {

  @Column(name = "horario_ficha_anterior")
  private Date horarioFichaAnterior;
  private LocalTime hora;

  @Enumerated(EnumType.STRING)
  private Tipo tipo;

  @ManyToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "empleado_id", referencedColumnName = "id")
  private Empleado empleado;
  
}
