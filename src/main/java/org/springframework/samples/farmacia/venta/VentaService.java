package org.springframework.samples.farmacia.venta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaService {
  private VentaRepository ventaRepository;
  private LineaVentaRepository lineaVentaRepository;

    @Autowired
    public VentaService(VentaRepository ventaRepository, LineaVentaRepository lr) {
        this.ventaRepository = ventaRepository;
        this.lineaVentaRepository = lr;
    }
    @Transactional(readOnly = true)
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Venta findByVentaId(int id) throws DataAccessException {
        return ventaRepository.findById(id).orElse(null);
    }

    @Transactional
    public Venta saveVenta(Venta venta) throws DataAccessException {
       return ventaRepository.save(venta);
    }

    @Transactional
    public void deleteVenta(int id) throws DataAccessException {
        ventaRepository.deleteById(id);
    }

    @Transactional
    public Double precioArticulo(int id) throws DataAccessException {
        LineaVenta ls = lineaVentaRepository.findById(id).get();
        Double precio = ls.getArticulo().getPvp() * ls.getCantidad();
        ls.setPrecio(precio);
        lineaVentaRepository.save(ls);
        return precio;
    }
    
    @Transactional
    public Double precioTotal(int id) throws DataAccessException {
        List<LineaVenta> ls = lineaVentaRepository.findByVentaId(id);
        Double precio = 0.0;
        for (LineaVenta lv: ls) {
            precio += precioArticulo(lv.getId());
        }
        Venta v = ventaRepository.findById(id).get();
        v.setPrecioTotal(precio);
        ventaRepository.save(v);
        return precio;
    }
    
}
