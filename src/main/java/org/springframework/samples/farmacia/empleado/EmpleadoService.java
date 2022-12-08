package org.springframework.samples.farmacia.empleado;

import java.util.List;
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
    
    @Transactional(readOnly = true)
    public Optional<Empleado> findById(Integer id) {
        return empleadoRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public Empleado getEmpleadoByUsername(String username) {
        return empleadoRepository.findByUsername(username);
    }

    @Transactional(readOnly = true)
    public List<Integer> findAllNumVendedor() {
        return empleadoRepository.findAll().stream().map(x -> x.getId()).toList();
    }

    @Transactional(readOnly = true)
    public String findClaveById(Integer id) {
        return empleadoRepository.findById(String.valueOf(id)).get().getClave();
    }


    @Transactional
    public void saveEmpleado(Empleado cliente) throws DataAccessException {
        empleadoRepository.save(cliente);
    }
  
}
