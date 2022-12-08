package org.springframework.samples.farmacia.empleado;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, String> {

    public List<Empleado> findAll();

    public Optional<Empleado> findById(Integer id);

    @Query("SELECT e FROM Empleado e WHERE e.nombre = :nombre")
    public Empleado findByName(@Param("nombre") String nombre);

    @Query("SELECT e FROM Empleado e WHERE e.user.username = :username")
    public Empleado findByUsername(@Param("username") String username);

  
}
