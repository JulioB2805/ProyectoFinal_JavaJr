package com.snpp.crudmovimiento_Julio.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import com.snpp.crudmovimiento_Julio.crud.MovimientoCrudRepository;
import com.snpp.crudmovimiento_Julio.entity.Movimiento;

@Repository
public class MovimientoRepository {

    private final MovimientoCrudRepository movimientoCrudRepository;

    public MovimientoRepository(MovimientoCrudRepository movimientoCrudRepository) {
        this.movimientoCrudRepository = movimientoCrudRepository;
    }

    public List<Movimiento> getAll() {
        return (List<Movimiento>) movimientoCrudRepository.findAll();
    }

    public Optional<Movimiento> getMovimiento(int id) {
        return movimientoCrudRepository.findById(id);
    }

    public Movimiento save(Movimiento producto) {
        return movimientoCrudRepository.save(producto);
    }

    public void delete(int id) {
        movimientoCrudRepository.deleteById(id);
    }
}
