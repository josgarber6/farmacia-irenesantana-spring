package org.springframework.samples.farmacia.empleado;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, String> {

    @Query("SELECT e FROM Empleado e WHERE e.nombre = :nombre")
    public Empleado findByName(@Param("nombre") String nombre);

    @Query("SELECT e FROM Empleado e WHERE e.username = :username")
    public Empleado findByUsername(@Param("username") String username);

  
}
