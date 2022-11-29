package org.springframework.samples.farmacia.empleado;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService (EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
    
    public Optional<Empleado> findEmpleado(String name) {
        return empleadoRepository.findById(name);
    }

    @Transactional
    public void saveEmpleado(Empleado cliente) throws DataAccessException {
        empleadoRepository.save(cliente);
    }
  
}
