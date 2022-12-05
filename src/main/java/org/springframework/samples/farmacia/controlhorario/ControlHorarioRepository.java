package org.springframework.samples.farmacia.controlhorario;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlHorarioRepository extends CrudRepository<ControlHorario, Integer> {
  public List<ControlHorario> findAll();

  @Query("SELECT ch FROM ControlHorario ch WHERE ch.empleado.id = :empleadoId")
  public List<ControlHorario> findByEmpleadoId(Integer empleadoId);
}
