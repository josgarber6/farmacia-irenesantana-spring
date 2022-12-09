package org.springframework.samples.farmacia.articulo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.farmacia.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulos")
@Getter
@Setter
public class Articulo extends BaseEntity {

  @NotNull
  private String denominacion;

  @NotNull
  @Column(name = "codigo_nacional")
  private String codigoNacional;

  @DateTimeFormat(pattern = "yyyy/MM/dd")
  private LocalDate caducidad;

  @NotNull
  @Min(0)
  private Integer existencias;
  
  @NotNull
  @Min(0)
  private String lote;

  @Min(0)
  private Integer tenencia;

  @Min(0)
  private Integer minimo;

  private Double precioAlbaran;

  private Boolean requiereReceta;

  private Double pvp;

  private String imagen;

  @Size(min=1, max = 500)
  private String observacion;
  
}
