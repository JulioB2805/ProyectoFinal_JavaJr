package com.snpp.crudmovimiento_Julio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snpp.crudmovimiento_Julio.entity.Movimiento;
import com.snpp.crudmovimiento_Julio.service.MovimientoService;

@RestController
@RequestMapping(path = "api/v1/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping
    public List<Movimiento> getAll() {
        return movimientoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimiento> getProducto(@PathVariable("id") int idMovimiento) {
        Movimiento movimiento = movimientoService.getMovimiento(idMovimiento);
        if (movimiento != null) {
            return new ResponseEntity<>(movimiento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping  
    public ResponseEntity<Movimiento> save(@RequestBody Movimiento producto) {
        Movimiento nuevoProducto = movimientoService.save(producto);
        return new ResponseEntity<>(nuevoProducto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int idMovimiento) {
        boolean eliminado = movimientoService.delete(idMovimiento);
        if (eliminado) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
