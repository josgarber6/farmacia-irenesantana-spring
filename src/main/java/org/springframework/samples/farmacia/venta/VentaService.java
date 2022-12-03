package org.springframework.samples.farmacia.venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaService {
  private VentaRepository ventaRepository;

    @Autowired
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Transactional(readOnly = true)
    public Venta findByVentaId(int id) throws DataAccessException {
        return ventaRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveVenta(Venta venta) throws DataAccessException {
        ventaRepository.save(venta);
    }
}
