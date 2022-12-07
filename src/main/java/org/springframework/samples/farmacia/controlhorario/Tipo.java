package org.springframework.samples.farmacia.controlhorario;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.samples.farmacia.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tipos")
public class Tipo extends NamedEntity{
 
}

