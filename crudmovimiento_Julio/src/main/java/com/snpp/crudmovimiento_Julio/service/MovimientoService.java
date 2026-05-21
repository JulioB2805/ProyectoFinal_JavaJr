package com.snpp.crudmovimiento_Julio.service;

import java.util.List;
import java.util.Optional;
 
import org.springframework.stereotype.Service;

import com.snpp.crudmovimiento_Julio.entity.Movimiento;
import com.snpp.crudmovimiento_Julio.repository.MovimientoRepository;

@Service
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;

    public MovimientoService(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> getAll() {
        return movimientoRepository.getAll();
    }

    public Movimiento getMovimiento(int id) {
        Optional<Movimiento> movimiento = movimientoRepository.getMovimiento(id);
        if (movimiento.isPresent()) {
            return movimiento.get();
        } else {
            return null;
        }
    }

    public Movimiento save(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public boolean delete(int id) {
        if (movimientoRepository.getMovimiento(id).isPresent()) {
            movimientoRepository.delete(id);
            return true;
        }
        return false;
    }
}
