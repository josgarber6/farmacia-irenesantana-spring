package org.springframework.samples.farmacia.cliente;

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
    public Cliente findByClienteId (int id) throws DataAccessException {
        return clienteRepository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public Cliente findByClienteName (String name) throws DataAccessException {
        return clienteRepository.findByName(name);
    }

    @Transactional
    public void saveCliente(Cliente cliente) throws DataAccessException {
        clienteRepository.save(cliente);
    }

}
