package org.springframework.samples.farmacia.empleado;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmpleadoRepository extends CrudRepository<Empleado, String> {

    @Query("SELECT e FROM Empleado c WHERE c.nombre =:nombre")
    public Empleado findByName(@Param("nombre") String nombre);

  
}
