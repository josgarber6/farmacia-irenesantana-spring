package org.springframework.samples.farmacia.articulo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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

  @NotNull
  private Date caducidad;

  @NotNull
  private Integer existencia;
  
  @NotNull
  private String lote;

  private Integer tenencia;

  @Min(0)
  private Integer minimo;

  private Double precioAlbaran;

  private Boolean requiereReceta;

  private Double pvp;

  private String imagen;

  @Min(0)
  @Max(50)
  private String observacion;
  
}
