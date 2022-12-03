package org.springframework.samples.farmacia.controlhorario;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "control_horario")
@Getter
@Setter
public class ControlHorario {

  @Column(name = "horario_ficha_anterior")
  private Date horarioFichaAnterior;
  private LocalTime hora;
  private Tipo tipo;

  @ManyToOne(cascade = {CascadeType.ALL})
  @JoinColumn(name = "empleado_id")
  private Integer empleadoId;
  
}
