package org.springframework.samples.farmacia.articulo;

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
    public Articulo findByArticuloId(int id) throws DataAccessException {
        return articuloRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveArticulo(Articulo articulo) throws DataAccessException {
        articuloRepository.save(articulo);
    }

    @Transactional
    public void deleteRoom(int id) throws DataAccessException {
        articuloRepository.deleteById(id);
    }
}
