package org.springframework.samples.farmacia.controlhorario;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ControlHorarioService {
    
    @Autowired
    private ControlHorarioRepository controlHorarioRepository;
    
    @Autowired
    public ControlHorarioService (ControlHorarioRepository chr) {
        this.controlHorarioRepository = chr;
    }

    @Transactional(readOnly = true)
    public List<ControlHorario> findAll() {
        return controlHorarioRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<ControlHorario> findByEmpleadoId (int id) {
        return controlHorarioRepository.findByEmpleadoId(id);
    }

    @Transactional(readOnly = true)
    public Collection<Tipo> findByControlHorarioTypes() throws DataAccessException {
        return controlHorarioRepository.findBtControlHorarioType();
    }

    @Transactional
    public ControlHorario saveControlHorario(ControlHorario controlHorario) throws DataAccessException {
        return controlHorarioRepository.save(controlHorario);
    }

}
