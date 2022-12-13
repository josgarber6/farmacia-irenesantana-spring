package org.springframework.samples.farmacia.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    public ClienteService (ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Cliente findByClienteId (int id) throws DataAccessException {
        return clienteRepository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public Cliente findByClienteName (String name) throws DataAccessException {
        return clienteRepository.findByName(name);
    }

    @Transactional
    public Cliente saveCliente(Cliente cliente) throws DataAccessException {
        return clienteRepository.save(cliente);
    }

}
