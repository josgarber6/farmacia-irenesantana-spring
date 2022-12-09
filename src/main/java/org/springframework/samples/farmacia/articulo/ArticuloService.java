package org.springframework.samples.farmacia.articulo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticuloService {
  
    private ArticuloRepository articuloRepository;

    @Autowired
    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    @Transactional(readOnly = true)
    public List<Articulo> findAll() {
        return articuloRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Articulo findByArticuloId(int id) throws DataAccessException {
        return articuloRepository.findById(id).orElse(null);
    }

    @Transactional
    public Articulo saveArticulo(Articulo articulo) throws DataAccessException {
        return articuloRepository.save(articulo);
    }

    @Transactional
    public void deleteArticulo(int id) throws DataAccessException {
        articuloRepository.deleteById(id);
    }
}
